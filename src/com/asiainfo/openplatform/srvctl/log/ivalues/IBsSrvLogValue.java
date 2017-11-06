package com.asiainfo.openplatform.srvctl.log.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBsSrvLogValue extends DataStructInterface{

  public final static  String S_StartTime = "START_TIME";
  public final static  String S_SysId = "SYS_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_LocalSysName = "LOCAL_SYS_NAME";
  public final static  String S_FlowName = "FLOW_NAME";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_EndTime = "END_TIME";
  public final static  String S_ExecuteTime = "EXECUTE_TIME";
  public final static  String S_SourceIp = "SOURCE_IP";
  public final static  String S_ChannelType = "CHANNEL_TYPE";
  public final static  String S_CreateTime = "CREATE_TIME";
  public final static  String S_ErroInfo = "ERRO_INFO";
  public final static  String S_InData = "IN_DATA";
  public final static  String S_OpCode = "OP_CODE";
  public final static  String S_RetMsg = "RET_MSG";
  public final static  String S_SerialId = "SERIAL_ID";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_OpOrgId = "OP_ORG_ID";
  public final static  String S_RetCode = "RET_CODE";
  public final static  String S_FlowCode = "FLOW_CODE";
  public final static  String S_SysSerialId = "SYS_SERIAL_ID";
  public final static  String S_OutData = "OUT_DATA";
  public final static  String S_LogId = "LOG_ID";


public Timestamp getStartTime();

public String getSysId();

public String getOpId();

public String getLocalSysName();

public String getFlowName();

public String getBillId();

public Timestamp getEndTime();

public long getExecuteTime();

public String getSourceIp();

public String getChannelType();

public Timestamp getCreateTime();

public String getErroInfo();

public String getInData();

public String getOpCode();

public String getRetMsg();

public String getSerialId();

public String getExt1();

public String getExt2();

public String getExt3();

public String getExt4();

public String getExt5();

public String getOpOrgId();

public String getRetCode();

public String getFlowCode();

public String getSysSerialId();

public String getOutData();

public long getLogId();


public  void setStartTime(Timestamp value);

public  void setSysId(String value);

public  void setOpId(String value);

public  void setLocalSysName(String value);

public  void setFlowName(String value);

public  void setBillId(String value);

public  void setEndTime(Timestamp value);

public  void setExecuteTime(long value);

public  void setSourceIp(String value);

public  void setChannelType(String value);

public  void setCreateTime(Timestamp value);

public  void setErroInfo(String value);

public  void setInData(String value);

public  void setOpCode(String value);

public  void setRetMsg(String value);

public  void setSerialId(String value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setExt4(String value);

public  void setExt5(String value);

public  void setOpOrgId(String value);

public  void setRetCode(String value);

public  void setFlowCode(String value);

public  void setSysSerialId(String value);

public  void setOutData(String value);

public  void setLogId(long value);
}
