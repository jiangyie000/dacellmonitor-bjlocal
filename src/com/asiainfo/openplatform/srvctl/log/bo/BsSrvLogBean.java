package com.asiainfo.openplatform.srvctl.log.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.openplatform.srvctl.log.ivalues.*;

public class BsSrvLogBean extends DataContainer implements DataContainerInterface,IBsSrvLogValue{

  private static String  m_boName = "com.asiainfo.openplatform.srvctl.log.bo.BsSrvLog";



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

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BsSrvLogBean() throws AIException{
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

  public void initSysId(String value){
     this.initProperty(S_SysId,value);
  }
  public  void setSysId(String value){
     this.set(S_SysId,value);
  }
  public  void setSysIdNull(){
     this.set(S_SysId,null);
  }

  public String getSysId(){
       return DataType.getAsString(this.get(S_SysId));
  
  }
  public String getSysIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SysId));
      }

  public void initOpId(String value){
     this.initProperty(S_OpId,value);
  }
  public  void setOpId(String value){
     this.set(S_OpId,value);
  }
  public  void setOpIdNull(){
     this.set(S_OpId,null);
  }

  public String getOpId(){
       return DataType.getAsString(this.get(S_OpId));
  
  }
  public String getOpIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OpId));
      }

  public void initLocalSysName(String value){
     this.initProperty(S_LocalSysName,value);
  }
  public  void setLocalSysName(String value){
     this.set(S_LocalSysName,value);
  }
  public  void setLocalSysNameNull(){
     this.set(S_LocalSysName,null);
  }

  public String getLocalSysName(){
       return DataType.getAsString(this.get(S_LocalSysName));
  
  }
  public String getLocalSysNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LocalSysName));
      }

  public void initFlowName(String value){
     this.initProperty(S_FlowName,value);
  }
  public  void setFlowName(String value){
     this.set(S_FlowName,value);
  }
  public  void setFlowNameNull(){
     this.set(S_FlowName,null);
  }

  public String getFlowName(){
       return DataType.getAsString(this.get(S_FlowName));
  
  }
  public String getFlowNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FlowName));
      }

  public void initBillId(String value){
     this.initProperty(S_BillId,value);
  }
  public  void setBillId(String value){
     this.set(S_BillId,value);
  }
  public  void setBillIdNull(){
     this.set(S_BillId,null);
  }

  public String getBillId(){
       return DataType.getAsString(this.get(S_BillId));
  
  }
  public String getBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillId));
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

  public void initSourceIp(String value){
     this.initProperty(S_SourceIp,value);
  }
  public  void setSourceIp(String value){
     this.set(S_SourceIp,value);
  }
  public  void setSourceIpNull(){
     this.set(S_SourceIp,null);
  }

  public String getSourceIp(){
       return DataType.getAsString(this.get(S_SourceIp));
  
  }
  public String getSourceIpInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SourceIp));
      }

  public void initChannelType(String value){
     this.initProperty(S_ChannelType,value);
  }
  public  void setChannelType(String value){
     this.set(S_ChannelType,value);
  }
  public  void setChannelTypeNull(){
     this.set(S_ChannelType,null);
  }

  public String getChannelType(){
       return DataType.getAsString(this.get(S_ChannelType));
  
  }
  public String getChannelTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChannelType));
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

  public void initErroInfo(String value){
     this.initProperty(S_ErroInfo,value);
  }
  public  void setErroInfo(String value){
     this.set(S_ErroInfo,value);
  }
  public  void setErroInfoNull(){
     this.set(S_ErroInfo,null);
  }

  public String getErroInfo(){
       return DataType.getAsString(this.get(S_ErroInfo));
  
  }
  public String getErroInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ErroInfo));
      }

  public void initInData(String value){
     this.initProperty(S_InData,value);
  }
  public  void setInData(String value){
     this.set(S_InData,value);
  }
  public  void setInDataNull(){
     this.set(S_InData,null);
  }

  public String getInData(){
       return DataType.getAsString(this.get(S_InData));
  
  }
  public String getInDataInitialValue(){
        return DataType.getAsString(this.getOldObj(S_InData));
      }

  public void initOpCode(String value){
     this.initProperty(S_OpCode,value);
  }
  public  void setOpCode(String value){
     this.set(S_OpCode,value);
  }
  public  void setOpCodeNull(){
     this.set(S_OpCode,null);
  }

  public String getOpCode(){
       return DataType.getAsString(this.get(S_OpCode));
  
  }
  public String getOpCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OpCode));
      }

  public void initRetMsg(String value){
     this.initProperty(S_RetMsg,value);
  }
  public  void setRetMsg(String value){
     this.set(S_RetMsg,value);
  }
  public  void setRetMsgNull(){
     this.set(S_RetMsg,null);
  }

  public String getRetMsg(){
       return DataType.getAsString(this.get(S_RetMsg));
  
  }
  public String getRetMsgInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RetMsg));
      }

  public void initSerialId(String value){
     this.initProperty(S_SerialId,value);
  }
  public  void setSerialId(String value){
     this.set(S_SerialId,value);
  }
  public  void setSerialIdNull(){
     this.set(S_SerialId,null);
  }

  public String getSerialId(){
       return DataType.getAsString(this.get(S_SerialId));
  
  }
  public String getSerialIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SerialId));
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

  public void initOpOrgId(String value){
     this.initProperty(S_OpOrgId,value);
  }
  public  void setOpOrgId(String value){
     this.set(S_OpOrgId,value);
  }
  public  void setOpOrgIdNull(){
     this.set(S_OpOrgId,null);
  }

  public String getOpOrgId(){
       return DataType.getAsString(this.get(S_OpOrgId));
  
  }
  public String getOpOrgIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OpOrgId));
      }

  public void initRetCode(String value){
     this.initProperty(S_RetCode,value);
  }
  public  void setRetCode(String value){
     this.set(S_RetCode,value);
  }
  public  void setRetCodeNull(){
     this.set(S_RetCode,null);
  }

  public String getRetCode(){
       return DataType.getAsString(this.get(S_RetCode));
  
  }
  public String getRetCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RetCode));
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

  public void initSysSerialId(String value){
     this.initProperty(S_SysSerialId,value);
  }
  public  void setSysSerialId(String value){
     this.set(S_SysSerialId,value);
  }
  public  void setSysSerialIdNull(){
     this.set(S_SysSerialId,null);
  }

  public String getSysSerialId(){
       return DataType.getAsString(this.get(S_SysSerialId));
  
  }
  public String getSysSerialIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SysSerialId));
      }

  public void initOutData(String value){
     this.initProperty(S_OutData,value);
  }
  public  void setOutData(String value){
     this.set(S_OutData,value);
  }
  public  void setOutDataNull(){
     this.set(S_OutData,null);
  }

  public String getOutData(){
       return DataType.getAsString(this.get(S_OutData));
  
  }
  public String getOutDataInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OutData));
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


 
 }

