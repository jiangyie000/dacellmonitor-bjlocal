package com.asiainfo.openplatform.srvctl.log.services.interfaces;

import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogParamValue;
import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogValue;

/**
 * 服务请求调用日志SV 
 * 	操作每次调用的服务请求(IBsSrvLogValue)和请求参数(IBsSrvLogValueParam)
 */
public interface IBsSrvLogSV {
	
	/**
	 * 保存服务请求(IBsSrvLogValue)和请求参数(IBsSrvLogValueParam)日志
	 * @param bsSrvLogs
	 * @throws Exception
	 */
	public void save(IBsSrvLogValue[] bsSrvLogs, IBsSrvLogParamValue[] bsSrvParamLogs)throws Exception;
	
	
	/**
	 * 获取IBsSrvLogValue的Id
	 * @throws Exception
	 */
	public long getNewId() throws Exception;
}











