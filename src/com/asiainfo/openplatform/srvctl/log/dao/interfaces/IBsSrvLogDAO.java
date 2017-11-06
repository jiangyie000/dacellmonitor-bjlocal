package com.asiainfo.openplatform.srvctl.log.dao.interfaces;

import com.asiainfo.openplatform.srvctl.log.ivalues.IBsSrvLogValue;

/**
 * �������������־DAO
 * 	����ÿ�ε��õķ�������(IBsSrvLogValue)���������(IBsSrvLogValueParam)
 */
public interface IBsSrvLogDAO {
	
	/**
	 * ������־
	 * @param bsSrvLogs
	 * @throws Exception
	 */
	public void save(IBsSrvLogValue[] bsSrvLogs)throws Exception;

	/**
	 * ��ȡIBsSrvLogValue��Id
	 * @throws Exception
	 */
	public long getNewId() throws Exception;
}











