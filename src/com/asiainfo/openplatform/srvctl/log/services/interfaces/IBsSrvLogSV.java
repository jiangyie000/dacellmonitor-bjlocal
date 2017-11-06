package com.asiainfo.openplatform.srvctl.log.services.interfaces;

import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogParamValue;
import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogValue;

/**
 * �������������־SV 
 * 	����ÿ�ε��õķ�������(IBsSrvLogValue)���������(IBsSrvLogValueParam)
 */
public interface IBsSrvLogSV {
	
	/**
	 * �����������(IBsSrvLogValue)���������(IBsSrvLogValueParam)��־
	 * @param bsSrvLogs
	 * @throws Exception
	 */
	public void save(IBsSrvLogValue[] bsSrvLogs, IBsSrvLogParamValue[] bsSrvParamLogs)throws Exception;
	
	
	/**
	 * ��ȡIBsSrvLogValue��Id
	 * @throws Exception
	 */
	public long getNewId() throws Exception;
}











