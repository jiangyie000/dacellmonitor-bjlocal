package com.asiainfo.openplatform.srvctl.log.dao.interfaces;

import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogParamValue;

/**
 * 服务请求调用日志参数DAO
 * 	操作每次调用的请求参数(IBsSrvLogValueParam)
 */
public interface IBsSrvLogParamDAO {
	
	/**
	 * 保存日志参数
	 * @param bsSrvLogs
	 * @throws Exception
	 */
	public void save(IBsSrvLogParamValue[] bsSrvParamLogs)throws Exception;
	
}











