package com.asiainfo.openplatform.srvctl.log.dao.interfaces;

import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogValue;

/**
 * 服务请求调用日志DAO
 * 	操作每次调用的服务请求(IBsSrvLogValue)和请求参数(IBsSrvLogValueParam)
 */
public interface IBsSrvLogDAO {
	
	/**
	 * 保存日志
	 * @param bsSrvLogs
	 * @throws Exception
	 */
	public void save(IBsSrvLogValue[] bsSrvLogs)throws Exception;

	/**
	 * 获取IBsSrvLogValue的Id
	 * @throws Exception
	 */
	public long getNewId() throws Exception;
}











