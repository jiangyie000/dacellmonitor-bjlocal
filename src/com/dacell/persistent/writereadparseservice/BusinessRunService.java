package com.dacell.persistent.writereadparseservice;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.openplatform.common.util.StringUtil;
import com.asiainfo.openplatform.srvctl.log.bo.BsSrvLogBean;
import com.asiainfo.openplatform.srvctl.log.bo.BsSrvLogParamBean;
import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogParamValue;
import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogValue;
import com.asiainfo.openplatform.srvctl.log.services.interfaces.IBsSrvLogSV;
import com.dacell.persistent.writereadparseservice.staegeinterface.BusinessRunServiceInterface;
import com.dacell.rpc.domain.RequestContext;

public class BusinessRunService<T> implements BusinessRunServiceInterface<T>{
	private static Log LOG = LogFactory.getLog(BusinessRunService.class);
	IBsSrvLogSV srvLogSv = (IBsSrvLogSV) ServiceFactory.getService(IBsSrvLogSV.class);
	public void runService(T request){
		if(LOG.isDebugEnabled()){
			LOG.debug("服务端入数据库操作开始..");
		}
		try {
			List<RequestContext> list =(List<RequestContext>)request;
			List<IBsSrvLogValue> bsSrvLogList = new ArrayList<IBsSrvLogValue>();
			List<IBsSrvLogParamValue> bsSrvParamLogList = new ArrayList<IBsSrvLogParamValue>();
			if(list.size()>0){
				for(RequestContext context:list){
					IBsSrvLogValue srvLogValue =transSrvLogBean(context);
					bsSrvLogList.add(srvLogValue);
					bsSrvParamLogList.add(transSrvLogParamBean(context, srvLogValue.getLogId()));
				}
			}
			
			//List转成数组,保存
        	IBsSrvLogValue[] bsSrvLogs = (IBsSrvLogValue[]) bsSrvLogList.toArray(new IBsSrvLogValue[]{});
        	IBsSrvLogParamValue[] bsSrvLogParams = (IBsSrvLogParamValue[]) bsSrvParamLogList.toArray(new IBsSrvLogParamValue[]{});
        	srvLogSv.save(bsSrvLogs, bsSrvLogParams);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	private IBsSrvLogParamValue transSrvLogParamBean(RequestContext context,long logId) throws Exception {
		IBsSrvLogParamValue value = new BsSrvLogParamBean();
		value.setLogId(logId);
		
		value.setFlowCode(String.valueOf(context.getAttributes().get("method"))); 
		value.setFlowMode(null); 
        value.setTaskId(null);
        value.setLastTaskId(null);
        value.setSrvCode(null);
        value.setSrvName(null);
		 value.setStartTime(new Timestamp(Long.valueOf(String.valueOf(context.getAttributes().get("START_TIME")))));
	        value.setEndTime(new Timestamp(Long.valueOf(String.valueOf(context.getAttributes().get("END_TIME")))));
	        value.setExecuteTime(Long.valueOf(String.valueOf(context.getAttributes().get("EXECUTE_TIME"))));
	        value.setCreateTime(new Timestamp(Long.valueOf(String.valueOf(context.getAttributes().get("CREATE_TIME")))));
			
	        String SrvInvokeStartTime_str = String.valueOf(context.getAttributes().get("SrvInvokeStartTime"));
	        String SrvInvokeEndTime_str = String.valueOf(context.getAttributes().get("SrvInvokeEndTime"));
	         //调用crm服务的开始时间和结束时间
	         value.setExt1("0".equals(SrvInvokeStartTime_str)?"":new Date(Long.valueOf(SrvInvokeStartTime_str)).toLocaleString());
	         value.setExt2("0".equals(SrvInvokeEndTime_str)?"":new Date(Long.valueOf(SrvInvokeEndTime_str)).toLocaleString());
	        
	      //入参&&出参&&错误信息分段
	        String busiStr =String.valueOf(context.getAttributes().get("BUSI_STR"));
	        String inStr = busiStr;
            String outStr = String.valueOf(context.getAttributes().get("OUT_DATA"));
            String errStr = String.valueOf(context.getAttributes().get("ERROR_INFO"));
            Map<String,String> subInMap = getSubMap("indata",inStr);
            Map<String,String> subOutMap = getSubMap("outdata",outStr);
            Map<String,String> errMap = getSubMap("errinfo",errStr);
            
            value.setInData1(subInMap.get("indata1"));
            value.setInData2(subInMap.get("indata2"));
            value.setInData3(subInMap.get("indata3"));
            value.setInData4(subInMap.get("indata4"));
            value.setInData5(subInMap.get("indata5"));
            
            value.setOutData1(subOutMap.get("outdata1"));
            value.setOutData2(subOutMap.get("outdata2"));
            value.setOutData3(subOutMap.get("outdata3"));
            value.setOutData4(subOutMap.get("outdata4"));
            value.setOutData5(subOutMap.get("outdata5"));
            
            value.setErroInfo1(errMap.get("errinfo1"));
            value.setErroInfo2(errMap.get("errinfo2"));
            value.setErroInfo3(errMap.get("errinfo3"));
            value.setErroInfo4(errMap.get("errinfo4"));
            value.setErroInfo5(errMap.get("errinfo5"));
		
		return value;
	}
	
	
	//分段保存, 以strKey作为map的key,inStr切割字符作为每个字串.
    private Map<String,String> getSubMap(String strKey,String inStr){
    	Map<String,String> subMap = new HashMap<String,String>();
    	
    	String str1 = "";
    	String str2 = "";
    	String str3 = "";
    	String str4 = "";
    	String str5 = "";
    	
    	if(!StringUtil.isEmpty(inStr)){
        	if(inStr.length()<=2000){
            	str1 = inStr;
            }else if(inStr.length()>2000&&inStr.length()<=4000){
            	str1 = inStr.substring(0,2000);
            	str2 = inStr.substring(2000);
            }else if(inStr.length()>4000&&inStr.length()<=6000){
            	str1 = inStr.substring(0,2000);
            	str2 = inStr.substring(2000,4000);
            	str3 = inStr.substring(4000);
            }else if(inStr.length()>6000&&inStr.length()<=6000){
            	str1 = inStr.substring(0,2000);
            	str2 = inStr.substring(2000,4000);
            	str3 = inStr.substring(4000,6000);
            	str4 = inStr.substring(8000);
            }else if(inStr.length()>6000&&inStr.length()<=10000){
            	str1 = inStr.substring(0,2000);
            	str2 = inStr.substring(2000,4000);
            	str3 = inStr.substring(4000,6000);
            	str4 = inStr.substring(6000,8000);
            	str5 = inStr.substring(8000);
            }
    	}
    	
    	subMap.put(strKey+"1", str1);
    	subMap.put(strKey+"2", str2);
    	subMap.put(strKey+"3", str3);
    	subMap.put(strKey+"4", str4);
    	subMap.put(strKey+"5", str5);
        
        return subMap;
    }
    
	private IBsSrvLogValue transSrvLogBean(RequestContext context) throws Exception {
		
		IBsSrvLogValue value = new BsSrvLogBean();
		value.setLogId(srvLogSv.getNewId()); 
		
		value.setSerialId(String.valueOf(context.getAttributes().get("busiSerial")));
		value.setSysSerialId(String.valueOf(context.getAttributes().get("transcSerial")));
		value.setLocalSysName("OPF");
		
		value.setChannelType(String.valueOf(context.getAttributes().get("openId")));
		value.setSourceIp(String.valueOf(context.getAttributes().get("esbThisIp"))); 
        value.setSysId(String.valueOf(context.getAttributes().get("appId"))); 
        value.setOpId(String.valueOf(context.getAttributes().get("operId")));
        value.setOpCode("");
        value.setOpOrgId("");
        
        value.setFlowCode(String.valueOf(context.getAttributes().get("method"))); 
        
        value.setFlowName(String.valueOf(context.getAttributes().get("FlowName")));//?
        value.setBillId(String.valueOf(context.getAttributes().get("BillId")));
        
        value.setRetCode(String.valueOf(context.getAttributes().get("RetCode")));
        value.setRetMsg(String.valueOf(context.getAttributes().get("RetMsg")));
        
        value.setStartTime(new Timestamp(Long.valueOf(String.valueOf(context.getAttributes().get("START_TIME")))));
        value.setEndTime(new Timestamp(Long.valueOf(String.valueOf(context.getAttributes().get("END_TIME")))));
        value.setExecuteTime(Long.valueOf(String.valueOf(context.getAttributes().get("EXECUTE_TIME"))));
        value.setCreateTime(new Timestamp(Long.valueOf(String.valueOf(context.getAttributes().get("CREATE_TIME")))));
        
        
       String SrvInvokeStartTime_str = String.valueOf(context.getAttributes().get("SrvInvokeStartTime"));
       String SrvInvokeEndTime_str = String.valueOf(context.getAttributes().get("SrvInvokeEndTime"));
        //调用crm服务的开始时间和结束时间
        value.setExt1("0".equals(SrvInvokeStartTime_str)?"":new Date(Long.valueOf(SrvInvokeStartTime_str)).toLocaleString());
        value.setExt2("0".equals(SrvInvokeEndTime_str)?"":new Date(Long.valueOf(SrvInvokeEndTime_str)).toLocaleString());
		
        String sysStr =String.valueOf(context.getAttributes().get("SYS_STR"));
        String busiStr =String.valueOf(context.getAttributes().get("BUSI_STR"));
        sysStr = getSubMap("sysStr", sysStr).get("sysStr1");	
        busiStr = getSubMap("busiStr", busiStr).get("busiStr1");
        
        String inStr = getSubMap("inStr","系统参数："+sysStr+",业务参数："+busiStr).get("inStr1");
        value.setInData(inStr);
        value.setOutData(getSubMap("outdata",String.valueOf(context.getAttributes().get("OUT_DATA"))).get("outdata1"));
        value.setErroInfo(getSubMap("errInfo",String.valueOf(context.getAttributes().get("ERROR_INFO"))).get("errInfo1"));
		return value;
	}

}
