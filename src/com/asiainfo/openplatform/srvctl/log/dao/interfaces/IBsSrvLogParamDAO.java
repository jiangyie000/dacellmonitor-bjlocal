package com.asiainfo.openplatform.srvctl.log.dao.interfaces;

import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogParamValue;

/**
 * �������������־����DAO
 * 	����ÿ�ε��õ��������(IBsSrvLogValueParam)
 */
public interface IBsSrvLogParamDAO {
	
	/**
	 * ������־����
	 * @param bsSrvLogs
	 * @throws Exception
	 */
	public void save(IBsSrvLogParamValue[] bsSrvParamLogs)throws Exception;
	
}











