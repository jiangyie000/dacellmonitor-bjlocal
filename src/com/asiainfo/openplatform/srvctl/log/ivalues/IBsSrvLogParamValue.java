package com.asiainfo.openplatform.srvctl.log.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBsSrvLogParamValue extends DataStructInterface{

  public final static  String S_StartTime = "START_TIME";
  public final static  String S_ErroInfo2 = "ERRO_INFO2";
  public final static  String S_ErroInfo1 = "ERRO_INFO1";
  public final static  String S_SrvCode = "SRV_CODE";
  public final static  String S_OutData2 = "OUT_DATA2";
  public final static  String S_OutData1 = "OUT_DATA1";
  public final static  String S_EndTime = "END_TIME";
  public final static  String S_SrvName = "SRV_NAME";
  public final static  String S_ExecuteTime = "EXECUTE_TIME";
  public final static  String S_ErroInfo4 = "ERRO_INFO4";
  public final static  String S_ErroInfo3 = "ERRO_INFO3";
  public final static  String S_CreateTime = "CREATE_TIME";
  public final static  String S_ErroInfo5 = "ERRO_INFO5";
  public final static  String S_OutData5 = "OUT_DATA5";
  public final static  String S_OutData4 = "OUT_DATA4";
  public final static  String S_OutData3 = "OUT_DATA3";
  public final static  String S_LastTaskId = "LAST_TASK_ID";
  public final static  String S_FlowMode = "FLOW_MODE";
  public final static  String S_InData5 = "IN_DATA5";
  public final static  String S_InData4 = "IN_DATA4";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_FlowCode = "FLOW_CODE";
  public final static  String S_InData1 = "IN_DATA1";
  public final static  String S_InData3 = "IN_DATA3";
  public final static  String S_InData2 = "IN_DATA2";
  public final static  String S_LogId = "LOG_ID";
  public final static  String S_TaskId = "TASK_ID";


public Timestamp getStartTime();

public String getErroInfo2();

public String getErroInfo1();

public String getSrvCode();

public String getOutData2();

public String getOutData1();

public Timestamp getEndTime();

public String getSrvName();

public long getExecuteTime();

public String getErroInfo4();

public String getErroInfo3();

public Timestamp getCreateTime();

public String getErroInfo5();

public String getOutData5();

public String getOutData4();

public String getOutData3();

public String getLastTaskId();

public String getFlowMode();

public String getInData5();

public String getInData4();

public String getExt1();

public String getExt2();

public String getExt3();

public String getExt4();

public String getExt5();

public String getFlowCode();

public String getInData1();

public String getInData3();

public String getInData2();

public long getLogId();

public String getTaskId();


public  void setStartTime(Timestamp value);

public  void setErroInfo2(String value);

public  void setErroInfo1(String value);

public  void setSrvCode(String value);

public  void setOutData2(String value);

public  void setOutData1(String value);

public  void setEndTime(Timestamp value);

public  void setSrvName(String value);

public  void setExecuteTime(long value);

public  void setErroInfo4(String value);

public  void setErroInfo3(String value);

public  void setCreateTime(Timestamp value);

public  void setErroInfo5(String value);

public  void setOutData5(String value);

public  void setOutData4(String value);

public  void setOutData3(String value);

public  void setLastTaskId(String value);

public  void setFlowMode(String value);

public  void setInData5(String value);

public  void setInData4(String value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setExt4(String value);

public  void setExt5(String value);

public  void setFlowCode(String value);

public  void setInData1(String value);

public  void setInData3(String value);

public  void setInData2(String value);

public  void setLogId(long value);

public  void setTaskId(String value);
}
