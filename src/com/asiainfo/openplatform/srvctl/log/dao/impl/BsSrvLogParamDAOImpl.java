package com.asiainfo.openplatform.srvctl.log.dao.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.asiainfo.openplatform.srvctl.log.bo.BsSrvLogEngine;
import com.asiainfo.openplatform.srvctl.log.bo.BsSrvLogParamEngine;
import com.asiainfo.openplatform.srvctl.log.dao.interfaces.IBsSrvLogDAO;
import com.asiainfo.openplatform.srvctl.log.dao.interfaces.IBsSrvLogParamDAO;
import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogParamValue;
import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogValue;

public class BsSrvLogParamDAOImpl implements IBsSrvLogParamDAO {

	private static final transient Log logger = LogFactory.getLog(BsSrvLogParamDAOImpl.class);

	public void save(IBsSrvLogParamValue[] bsSrvParamLogs) throws Exception {
		BsSrvLogParamEngine.saveBatch(bsSrvParamLogs);
	}
}
