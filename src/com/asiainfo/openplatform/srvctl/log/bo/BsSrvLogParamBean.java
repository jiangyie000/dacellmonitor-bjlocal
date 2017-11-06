package com.asiainfo.openplatform.srvctl.log.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.openplatform.srvctl.log.ivalues.*;

public class BsSrvLogParamBean extends DataContainer implements DataContainerInterface,IBsSrvLogParamValue{

  private static String  m_boName = "com.asiainfo.openplatform.srvctl.log.bo.BsSrvLogParam";



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

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BsSrvLogParamBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initStartTime(Timestamp value){
     this.initProperty(S_StartTime,value);
  }
  public  void setStartTime(Timestamp value){
     this.set(S_StartTime,value);
  }
  public  void setStartTimeNull(){
     this.set(S_StartTime,null);
  }

  public Timestamp getStartTime(){
        return DataType.getAsDateTime(this.get(S_StartTime));
  
  }
  public Timestamp getStartTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_StartTime));
      }

  public void initErroInfo2(String value){
     this.initProperty(S_ErroInfo2,value);
  }
  public  void setErroInfo2(String value){
     this.set(S_ErroInfo2,value);
  }
  public  void setErroInfo2Null(){
     this.set(S_ErroInfo2,null);
  }

  public String getErroInfo2(){
       return DataType.getAsString(this.get(S_ErroInfo2));
  
  }
  public String getErroInfo2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ErroInfo2));
      }

  public void initErroInfo1(String value){
     this.initProperty(S_ErroInfo1,value);
  }
  public  void setErroInfo1(String value){
     this.set(S_ErroInfo1,value);
  }
  public  void setErroInfo1Null(){
     this.set(S_ErroInfo1,null);
  }

  public String getErroInfo1(){
       return DataType.getAsString(this.get(S_ErroInfo1));
  
  }
  public String getErroInfo1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ErroInfo1));
      }

  public void initSrvCode(String value){
     this.initProperty(S_SrvCode,value);
  }
  public  void setSrvCode(String value){
     this.set(S_SrvCode,value);
  }
  public  void setSrvCodeNull(){
     this.set(S_SrvCode,null);
  }

  public String getSrvCode(){
       return DataType.getAsString(this.get(S_SrvCode));
  
  }
  public String getSrvCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SrvCode));
      }

  public void initOutData2(String value){
     this.initProperty(S_OutData2,value);
  }
  public  void setOutData2(String value){
     this.set(S_OutData2,value);
  }
  public  void setOutData2Null(){
     this.set(S_OutData2,null);
  }

  public String getOutData2(){
       return DataType.getAsString(this.get(S_OutData2));
  
  }
  public String getOutData2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_OutData2));
      }

  public void initOutData1(String value){
     this.initProperty(S_OutData1,value);
  }
  public  void setOutData1(String value){
     this.set(S_OutData1,value);
  }
  public  void setOutData1Null(){
     this.set(S_OutData1,null);
  }

  public String getOutData1(){
       return DataType.getAsString(this.get(S_OutData1));
  
  }
  public String getOutData1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_OutData1));
      }

  public void initEndTime(Timestamp value){
     this.initProperty(S_EndTime,value);
  }
  public  void setEndTime(Timestamp value){
     this.set(S_EndTime,value);
  }
  public  void setEndTimeNull(){
     this.set(S_EndTime,null);
  }

  public Timestamp getEndTime(){
        return DataType.getAsDateTime(this.get(S_EndTime));
  
  }
  public Timestamp getEndTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_EndTime));
      }

  public void initSrvName(String value){
     this.initProperty(S_SrvName,value);
  }
  public  void setSrvName(String value){
     this.set(S_SrvName,value);
  }
  public  void setSrvNameNull(){
     this.set(S_SrvName,null);
  }

  public String getSrvName(){
       return DataType.getAsString(this.get(S_SrvName));
  
  }
  public String getSrvNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SrvName));
      }

  public void initExecuteTime(long value){
     this.initProperty(S_ExecuteTime,new Long(value));
  }
  public  void setExecuteTime(long value){
     this.set(S_ExecuteTime,new Long(value));
  }
  public  void setExecuteTimeNull(){
     this.set(S_ExecuteTime,null);
  }

  public long getExecuteTime(){
        return DataType.getAsLong(this.get(S_ExecuteTime));
  
  }
  public long getExecuteTimeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ExecuteTime));
      }

  public void initErroInfo4(String value){
     this.initProperty(S_ErroInfo4,value);
  }
  public  void setErroInfo4(String value){
     this.set(S_ErroInfo4,value);
  }
  public  void setErroInfo4Null(){
     this.set(S_ErroInfo4,null);
  }

  public String getErroInfo4(){
       return DataType.getAsString(this.get(S_ErroInfo4));
  
  }
  public String getErroInfo4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ErroInfo4));
      }

  public void initErroInfo3(String value){
     this.initProperty(S_ErroInfo3,value);
  }
  public  void setErroInfo3(String value){
     this.set(S_ErroInfo3,value);
  }
  public  void setErroInfo3Null(){
     this.set(S_ErroInfo3,null);
  }

  public String getErroInfo3(){
       return DataType.getAsString(this.get(S_ErroInfo3));
  
  }
  public String getErroInfo3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ErroInfo3));
      }

  public void initCreateTime(Timestamp value){
     this.initProperty(S_CreateTime,value);
  }
  public  void setCreateTime(Timestamp value){
     this.set(S_CreateTime,value);
  }
  public  void setCreateTimeNull(){
     this.set(S_CreateTime,null);
  }

  public Timestamp getCreateTime(){
        return DataType.getAsDateTime(this.get(S_CreateTime));
  
  }
  public Timestamp getCreateTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CreateTime));
      }

  public void initErroInfo5(String value){
     this.initProperty(S_ErroInfo5,value);
  }
  public  void setErroInfo5(String value){
     this.set(S_ErroInfo5,value);
  }
  public  void setErroInfo5Null(){
     this.set(S_ErroInfo5,null);
  }

  public String getErroInfo5(){
       return DataType.getAsString(this.get(S_ErroInfo5));
  
  }
  public String getErroInfo5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ErroInfo5));
      }

  public void initOutData5(String value){
     this.initProperty(S_OutData5,value);
  }
  public  void setOutData5(String value){
     this.set(S_OutData5,value);
  }
  public  void setOutData5Null(){
     this.set(S_OutData5,null);
  }

  public String getOutData5(){
       return DataType.getAsString(this.get(S_OutData5));
  
  }
  public String getOutData5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_OutData5));
      }

  public void initOutData4(String value){
     this.initProperty(S_OutData4,value);
  }
  public  void setOutData4(String value){
     this.set(S_OutData4,value);
  }
  public  void setOutData4Null(){
     this.set(S_OutData4,null);
  }

  public String getOutData4(){
       return DataType.getAsString(this.get(S_OutData4));
  
  }
  public String getOutData4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_OutData4));
      }

  public void initOutData3(String value){
     this.initProperty(S_OutData3,value);
  }
  public  void setOutData3(String value){
     this.set(S_OutData3,value);
  }
  public  void setOutData3Null(){
     this.set(S_OutData3,null);
  }

  public String getOutData3(){
       return DataType.getAsString(this.get(S_OutData3));
  
  }
  public String getOutData3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_OutData3));
      }

  public void initLastTaskId(String value){
     this.initProperty(S_LastTaskId,value);
  }
  public  void setLastTaskId(String value){
     this.set(S_LastTaskId,value);
  }
  public  void setLastTaskIdNull(){
     this.set(S_LastTaskId,null);
  }

  public String getLastTaskId(){
       return DataType.getAsString(this.get(S_LastTaskId));
  
  }
  public String getLastTaskIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LastTaskId));
      }

  public void initFlowMode(String value){
     this.initProperty(S_FlowMode,value);
  }
  public  void setFlowMode(String value){
     this.set(S_FlowMode,value);
  }
  public  void setFlowModeNull(){
     this.set(S_FlowMode,null);
  }

  public String getFlowMode(){
       return DataType.getAsString(this.get(S_FlowMode));
  
  }
  public String getFlowModeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FlowMode));
      }

  public void initInData5(String value){
     this.initProperty(S_InData5,value);
  }
  public  void setInData5(String value){
     this.set(S_InData5,value);
  }
  public  void setInData5Null(){
     this.set(S_InData5,null);
  }

  public String getInData5(){
       return DataType.getAsString(this.get(S_InData5));
  
  }
  public String getInData5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_InData5));
      }

  public void initInData4(String value){
     this.initProperty(S_InData4,value);
  }
  public  void setInData4(String value){
     this.set(S_InData4,value);
  }
  public  void setInData4Null(){
     this.set(S_InData4,null);
  }

  public String getInData4(){
       return DataType.getAsString(this.get(S_InData4));
  
  }
  public String getInData4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_InData4));
      }

  public void initExt1(String value){
     this.initProperty(S_Ext1,value);
  }
  public  void setExt1(String value){
     this.set(S_Ext1,value);
  }
  public  void setExt1Null(){
     this.set(S_Ext1,null);
  }

  public String getExt1(){
       return DataType.getAsString(this.get(S_Ext1));
  
  }
  public String getExt1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext1));
      }

  public void initExt2(String value){
     this.initProperty(S_Ext2,value);
  }
  public  void setExt2(String value){
     this.set(S_Ext2,value);
  }
  public  void setExt2Null(){
     this.set(S_Ext2,null);
  }

  public String getExt2(){
       return DataType.getAsString(this.get(S_Ext2));
  
  }
  public String getExt2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext2));
      }

  public void initExt3(String value){
     this.initProperty(S_Ext3,value);
  }
  public  void setExt3(String value){
     this.set(S_Ext3,value);
  }
  public  void setExt3Null(){
     this.set(S_Ext3,null);
  }

  public String getExt3(){
       return DataType.getAsString(this.get(S_Ext3));
  
  }
  public String getExt3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext3));
      }

  public void initExt4(String value){
     this.initProperty(S_Ext4,value);
  }
  public  void setExt4(String value){
     this.set(S_Ext4,value);
  }
  public  void setExt4Null(){
     this.set(S_Ext4,null);
  }

  public String getExt4(){
       return DataType.getAsString(this.get(S_Ext4));
  
  }
  public String getExt4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext4));
      }

  public void initExt5(String value){
     this.initProperty(S_Ext5,value);
  }
  public  void setExt5(String value){
     this.set(S_Ext5,value);
  }
  public  void setExt5Null(){
     this.set(S_Ext5,null);
  }

  public String getExt5(){
       return DataType.getAsString(this.get(S_Ext5));
  
  }
  public String getExt5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext5));
      }

  public void initFlowCode(String value){
     this.initProperty(S_FlowCode,value);
  }
  public  void setFlowCode(String value){
     this.set(S_FlowCode,value);
  }
  public  void setFlowCodeNull(){
     this.set(S_FlowCode,null);
  }

  public String getFlowCode(){
       return DataType.getAsString(this.get(S_FlowCode));
  
  }
  public String getFlowCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FlowCode));
      }

  public void initInData1(String value){
     this.initProperty(S_InData1,value);
  }
  public  void setInData1(String value){
     this.set(S_InData1,value);
  }
  public  void setInData1Null(){
     this.set(S_InData1,null);
  }

  public String getInData1(){
       return DataType.getAsString(this.get(S_InData1));
  
  }
  public String getInData1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_InData1));
      }

  public void initInData3(String value){
     this.initProperty(S_InData3,value);
  }
  public  void setInData3(String value){
     this.set(S_InData3,value);
  }
  public  void setInData3Null(){
     this.set(S_InData3,null);
  }

  public String getInData3(){
       return DataType.getAsString(this.get(S_InData3));
  
  }
  public String getInData3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_InData3));
      }

  public void initInData2(String value){
     this.initProperty(S_InData2,value);
  }
  public  void setInData2(String value){
     this.set(S_InData2,value);
  }
  public  void setInData2Null(){
     this.set(S_InData2,null);
  }

  public String getInData2(){
       return DataType.getAsString(this.get(S_InData2));
  
  }
  public String getInData2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_InData2));
      }

  public void initLogId(long value){
     this.initProperty(S_LogId,new Long(value));
  }
  public  void setLogId(long value){
     this.set(S_LogId,new Long(value));
  }
  public  void setLogIdNull(){
     this.set(S_LogId,null);
  }

  public long getLogId(){
        return DataType.getAsLong(this.get(S_LogId));
  
  }
  public long getLogIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LogId));
      }

  public void initTaskId(String value){
     this.initProperty(S_TaskId,value);
  }
  public  void setTaskId(String value){
     this.set(S_TaskId,value);
  }
  public  void setTaskIdNull(){
     this.set(S_TaskId,null);
  }

  public String getTaskId(){
       return DataType.getAsString(this.get(S_TaskId));
  
  }
  public String getTaskIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TaskId));
      }


 
 }

