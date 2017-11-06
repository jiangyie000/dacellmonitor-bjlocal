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
 * �������������־SV 
 * 	����ÿ�ε��õķ�������(IBsSrvLogValue)���������(IBsSrvLogValueParam)
 */
public class BsSrvLogSVImpl implements IBsSrvLogSV{
	
	private static final transient Log logger = LogFactory.getLog(BsSrvLogSVImpl.class);
	
	//�����������(IBsSrvLogValue)���������(IBsSrvLogValueParam)��־
	public void save(IBsSrvLogValue[] bsSrvLogs,IBsSrvLogParamValue[] bsSrvParamLogs)throws Exception{
		IBsSrvLogDAO srvLogDao = (IBsSrvLogDAO)ServiceFactory.getService(IBsSrvLogDAO.class);
		IBsSrvLogParamDAO srvLogParamDao = (IBsSrvLogParamDAO)ServiceFactory.getService(IBsSrvLogParamDAO.class);
		
		srvLogDao.save(bsSrvLogs);
		srvLogParamDao.save(bsSrvParamLogs);
		
		if(logger.isDebugEnabled()){
			logger.debug("��־���...���ʱ��:"+TimeUtil.getSysTime());
		}
	}
	
	
	//IBsSrvLogValue��ID
	public long getNewId() throws Exception {
		IBsSrvLogDAO srvLogDao = (IBsSrvLogDAO)ServiceFactory.getService(IBsSrvLogDAO.class);
		return srvLogDao.getNewId();
	}
}











