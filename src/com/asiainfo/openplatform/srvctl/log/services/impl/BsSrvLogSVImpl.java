package com.asiainfo.openplatform.srvctl.log.services.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.comframe.utils.TimeUtil;
import com.asiainfo.openplatform.srvctl.log.dao.interfaces.IBsSrvLogDAO;
import com.asiainfo.openplatform.srvctl.log.dao.interfaces.IBsSrvLogParamDAO;
import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogParamValue;
import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogValue;
import com.asiainfo.openplatform.srvctl.log.services.interfaces.IBsSrvLogSV;

/**
 * 服务请求调用日志SV 
 * 	操作每次调用的服务请求(IBsSrvLogValue)和请求参数(IBsSrvLogValueParam)
 */
public class BsSrvLogSVImpl implements IBsSrvLogSV{
	
	private static final transient Log logger = LogFactory.getLog(BsSrvLogSVImpl.class);
	
	//保存服务请求(IBsSrvLogValue)和请求参数(IBsSrvLogValueParam)日志
	public void save(IBsSrvLogValue[] bsSrvLogs,IBsSrvLogParamValue[] bsSrvParamLogs)throws Exception{
		IBsSrvLogDAO srvLogDao = (IBsSrvLogDAO)ServiceFactory.getService(IBsSrvLogDAO.class);
		IBsSrvLogParamDAO srvLogParamDao = (IBsSrvLogParamDAO)ServiceFactory.getService(IBsSrvLogParamDAO.class);
		
		srvLogDao.save(bsSrvLogs);
		srvLogParamDao.save(bsSrvParamLogs);
		
		if(logger.isDebugEnabled()){
			logger.debug("日志入表...入表时间:"+TimeUtil.getSysTime());
		}
	}
	
	
	//IBsSrvLogValue的ID
	public long getNewId() throws Exception {
		IBsSrvLogDAO srvLogDao = (IBsSrvLogDAO)ServiceFactory.getService(IBsSrvLogDAO.class);
		return srvLogDao.getNewId();
	}
}











