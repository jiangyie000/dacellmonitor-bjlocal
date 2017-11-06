package com.dacell.persistent.writereadparserthread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dacell.cfgdomain.Module;
import com.dacell.cfgdomain.ModuleUtil;
import com.dacell.cfgdomain.XMLConfigConstants;
import com.dacell.persistent.lockmanager.StageLock;
import com.dacell.persistent.message.AtomicUtil;
import com.dacell.persistent.writereadparseservice.staegeinterface.BusinessRunServiceInterface;

public class BusinessThread<T> implements Runnable {

	protected static Log LOG = LogFactory.getLog(BusinessThread.class);
	// 该AtomicLong变量的计数是整个服务实例全局的计数，因为所有的入库动作都是通过该类进行操作
//	public static AtomicLong taskExecuteNum = new AtomicLong(0);
	private BusinessRunServiceInterface<T> dbRunService;
	private Module module;
	private LinkedBlockingQueue<T> input_queue;
	private int stageIndex;

	public BusinessThread(LinkedBlockingQueue<T> input_queue,
			Module module, BusinessRunServiceInterface<T> dbRunService,int stageIndex) {
		this.dbRunService = dbRunService;
		this.module = module;
		this.input_queue = input_queue;
		this.stageIndex=stageIndex;
	}

	public void run() {
		while (true) {
			// 这里获得的应该是一个日志record记录，可以不是RequestContext，否则记录日志的数据太庞大
			T request = null;
			// 队列中获取数据需要超时监控，传入参数
			// 这里可以多次获取对象个人存入列表，然后批量交给dbServiceRun.runService();进行入库操作，也可以传递到远程
//			request = (T) input_queue.poll();
			List<T> list =new ArrayList<T>();
			
			for (int i = 0; i < Integer.valueOf(ModuleUtil.getRunableMap(module, stageIndex, XMLConfigConstants.BATCH_WRITE_NUM)); i++){
				T obj =input_queue.poll();
				if(obj!=null){
					list.add(obj);
					AtomicUtil.getModulesAtomicMap().get(module.getModuleId()).get(stageIndex).incrementAndGet();
				}
			}
			
			request=(T)list;

			if (((List)request).size() == 0) {
				// LOG.info("==APP_ID:" + appDomain.getId() + " APP_NAME:"
				// + appDomain.getName() + " 入库队列中没有数据到达......");
				// 多个线程共享一个锁，可能对锁发生冲突，是否可以获得应有的效果，需要校验
//				LogFlowLockSetStateManager.stopDbService_ReadQueue_isEmpty(module);// 队列空的时候，停止入库操作
				StageLock.stopStageThread_DataisEmpty(module,stageIndex,0,"队列数据为空,休眠业务线程执行......");
			} else {
//				BusinessThread.taskExecuteNum.incrementAndGet();
//				LOG.info("==MODULE_ID:" + module.getModuleId()
//						+ " MODULE_NAME:" + module.getName() + "===test=="
//						+ Thread.currentThread().getName() + "正在执行。。。"
//						// + ((User) request.getObject()).getName() + " atomic="
//						+ " atomic="
////						+ BusinessThread.taskExecuteNum.get());
//						+ AtomicUtil.getModulesAtomicMap().get(module.getModuleId()).get(stageIndex).get());
				// 这里可以实现批量数据库入库动作
				dbRunService.runService(request);
				// 获得数据可以入库操作
				// 可以再抽象一层，这个类上下的代码都是一样的，抽象方法只需要实现这里的数据库操作
				// 这里会实时的有对象个数到达，具体实现方法可以根据获取到的对象进行处理
				// ............===============需要重点进行抽象实现，并再写一个例子，这个抽象方法会不断传入上面定义的request对象
				// 可以考虑把request对象转换成以hashmap定义，这样客户端不需要接触request的类
//				LogFlowLockSetStateManager.startReadService_ReadQueue_NotFull(module);
				
				
				//如果前面的队列之前满了，消费以后需要通知启动，
				if(stageIndex-1>=0){
					StageLock.startStageThread_DataNotEmpty(module,stageIndex-1,1,"队列中数据已经被消费，启动业务线程继续读入数据......");
				}
			}
		}
	}
}
