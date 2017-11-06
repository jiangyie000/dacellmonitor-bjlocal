package com.asiainfo.openplatform.srvctl.log.dao.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.asiainfo.openplatform.srvctl.log.bo.BsSrvLogEngine;
import com.asiainfo.openplatform.srvctl.log.dao.interfaces.IBsSrvLogDAO;
import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogValue;

public class BsSrvLogDAOImpl implements IBsSrvLogDAO {

	private static final transient Log logger = LogFactory.getLog(BsSrvLogDAOImpl.class);

	@Override
	public void save(IBsSrvLogValue[] bsSrvLogs) throws Exception {
		BsSrvLogEngine.saveBatch(bsSrvLogs);
	}

	@Override
	public long getNewId() throws Exception {
		return BsSrvLogEngine.getNewId().longValue();
	}
	
	

}
