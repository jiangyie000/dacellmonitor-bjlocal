package com.asiainfo.openplatform.common.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */
public class StringUtil extends org.apache.commons.lang.StringUtils {
  public final static Logger log=Logger.getLogger(StringUtil.class);
  public static final String TA_LEFT="left";
  public static final String TA_RIGHT="right";
  public StringUtil() {
  }
  /**
   * 字符串按指定长度构造字符串,不足填空格
   */
  public static String toStringAlign(String str, int len, String align){
    String alignText = new String(str);
    if (alignText.length() < len) {
       int count = len - alignText.length();
       while (count > 0) {
         if (StringUtil.equalsIgnoreCase(align, StringUtil.TA_LEFT)) {
        	 alignText = alignText + " ";
         } else {
        	 alignText = " " + alignText;
         }
         count--;
       }
    }
    return alignText;
    
  }
  /**
   * 整数按指定长度构造字符串,不足填空格
   * @param iVal
   * @param len
   * @param align  left,right
   * @return String
   */
  public static String toStringAlign(int iVal,int len,String align){
     return StringUtil.toStringAlign(String.valueOf(iVal),len,align);
  }
  /**
   * 长整数按指定长度构造字符串,不足填空格
   * @param lVal
   * @param len
   * @param align
   * @return
   */
  public static String toStringAlign(long lVal,int len,String align){
	  return StringUtil.toStringAlign(String.valueOf(lVal),len,align);
  }
  /**
   * 从字符串中删除掉指定字符
   * @param str
   * @param ch
   * @return
   */
  public static String remove(String str, char ch){
    String temp = "";
    int index = 0;
    while (index < str.length()) {
	  if (str.charAt(index) != ch) {
		  temp = temp + String.valueOf(str.charAt(index));
	  }
	  index++;
    }
    return temp;
  }
  /**
   * 从字符串中删除掉指定字符串
   * @param str
   * @param revStr
   * @return
   */
  public static String remove(String str, String revStr){
	return StringUtil.replace(str, revStr, "");
  }
  /***
   * 整数按指定长度构造字符串,以字符填空格
   * @param str
   * @param len
   * @param align
   * @param full
   * @return
   */
  public static String fullStringAlgin(String str,int len,String align,char full){
	String temp=str;
	if(temp.length()<len){
		int nCount=len-temp.getBytes().length;
		String fullstr=String.valueOf(full);
		while(nCount>0){
		  if(StringUtil.equalsIgnoreCase(align,StringUtil.TA_LEFT)) temp=temp+fullstr;
		  else temp=fullstr+temp;
		  nCount--;
		}
	}
	return temp;  
  }
  /***
   * 
   * @param str1
   * @param str2
   * @return
   */
  public static boolean containsIgnoreCase( String str1 , String str2[] ){
	  boolean aEnable = false;
	  for(int index = 0 ; index < str2.length ; index++)
		  aEnable |= StringUtil.equalsIgnoreCase( str1 , str2[index] )?true:false; 
	  return aEnable; 
  }
  /***
   * 
   * @param str1
   * @param str2
   * @return
   */
  public static boolean contains( String str1 , String str2[] ){
	  boolean aEnable = false;
	  for(int index = 0 ; index < str2.length ; index++)
		  aEnable |= StringUtil.equals( str1 , str2[index] )?true:false; 
	  return aEnable; 
  }
  /***
   * 判断字符串在尾部是否以指定字符串
   * @param str1
   * @param str2
   * @return
   */
  public static boolean endsWith(String str1,String str2){
	if(str1==null||str2==null) return false;
	if(str1.length()<str2.length()) return  false;
	for(int index=0;index<str2.length();index++){
	   if(str1.charAt(str1.length()-index-1)!=str2.charAt(str2.length()-1-index))  return false;
	}
	return true;
  }
  /***
   * 判断字符串在尾部是否以指定字符串(忽虑字符大小写)
   * @param str1
   * @param str2
   * @return
   */
  public static boolean endsIgnoreCaseWith(String str1,String str2){
	  if(str1==null||str2==null) return false;
	  if(str1.length()<str2.length()) return  false;
	  return StringUtil.endsWith(str1.toUpperCase(),str2.toUpperCase());	
  }
  /***
   * 判断字符串在开头是否以指定字符串
   * @param str1
   * @param str2
   * @return
   */
  public static boolean startWith(String str1,String str2){
	if(str1==null||str2==null) return false;
	if(str1.length()<str2.length()) return false;
	for(int index=0;index<str2.length();index++)
	 if(str1.charAt(index)!=str2.charAt(index)) return false;
	return true;
  }
  /***
   * 判断字符串在开头是否以指定字符串(忽虑字符大小写)
   * @param str1
   * @param str2
   * @return
   */
  public static boolean startIgnoreCaseWith(String str1,String str2){
	  if(str1==null||str2==null) return false;
	  if(str1.length()<str2.length()) return false;
	  return StringUtil.startWith(str1.toUpperCase(),str2.toUpperCase());
  }
  /***
   * 判断字符串中是否包含指定字符串(忽虑字符大小写)
   * @param lpBuffer
   * @param containsbuff
   * @return
   */
  public static boolean containsIgnoreCase(String lpBuffer,String containsbuff){
	boolean retCode=false;
	if(containsbuff==null||containsbuff.length()<=0) return true;
	if(lpBuffer==null||lpBuffer.length()<=0||lpBuffer.length()<containsbuff.length()) return false;
	int index=0;
	String temp;
	while(index<lpBuffer.length()){
	   temp=StringUtil.mid(lpBuffer,index,containsbuff.length());
	   if(StringUtil.equalsIgnoreCase(temp,containsbuff)==true) return true;
	   index++;
	}
	return retCode;
  }
  /***
   * 
   * @param lpBuffer
   * @param containsbuff
   * @return
   */
  public static boolean containsIgnoreBlank(String lpBuffer,String containsbuff){
	  lpBuffer=StringUtil.remove(lpBuffer,' ');
	  containsbuff=StringUtil.remove(containsbuff,' ');
	  return StringUtil.contains(lpBuffer,containsbuff);
  }
  /***
   * 判断两个字符串大小
   * @param str1
   * @param str2
   * @return
   */
  public static int compare(String str1,String  str2){
	  return str1.compareTo(str2);
  }
  /***
   * 判断两个字符串大小(忽虑字符大小写)
   * @param str1
   * @param str2
   * @return
   */
  public static int compareIgnoreCase(String str1,String str2){
	  return str1.compareToIgnoreCase(str2);
  }
  /***
   * 按指定长度分隔字符串
   * @param str
   * @param length
   * @return
   */
  public static String[] split(String str, int length){
	  String retn[]=null;
	  int nCount=str.length()/length+1;
	  retn=new String[nCount];
	  for(int i=0;i<nCount;i++) retn[i]=StringUtil.substring(str,length*i,length*(i+1));
	  return retn;
  }
  /***
   * 根据分隔符提取字符串(不忽律空字符)
   * @param str
   * @param splitChar
   * @return
   */
  public static String[] splitNoIgnoreBlank(String str,String splitChar){
	  List elementLst = new ArrayList();
	  int index = 0,index1 = -splitChar.length();
	  while(index1<str.length()){
	     index = index1+splitChar.length();
	     index1 = StringUtil.indexOf(str,splitChar,index);
	     if(index1< 0) index1 = str.length();
	     elementLst.add( StringUtil.substring(str,index,index1) );
	  }
	  return (String[])elementLst.toArray(new String[]{});
  }
  /***
   * 
   * @param aITaskExpr
   * @return
   */
  public static String[][] splitExpr( String aITaskExpr ){
	  List aVector =  new java.util.Vector();
	  if( StringUtil.isBlank( aITaskExpr ) == false && StringUtil.contains( aITaskExpr, "=" ) ){
		  String aITaskExprL[] = StringUtil.split( aITaskExpr , ";" );
			for(int index = 0 ; index < aITaskExprL.length ; index++){
				String temp[] = StringUtil.split( aITaskExprL[index], "=" );
				if( temp != null && temp.length > 0 ){
					aVector.add( new String[]{ temp[0] , temp.length>1?temp[1]:""} );
				}
			}
	  }
	  return (String[][])aVector.toArray( new String[][]{});
  }
  /***
   * 
   * @param aRefeValue
   * @param aITaskExpr
   * @return
   */
  public static String splitExpr( String aRefeValue , String aITaskExpr ) {
	 String aValue = aITaskExpr;
	 String aITaskExprL[][] = StringUtil.splitExpr( aITaskExpr );
	 if( aITaskExprL != null && aITaskExprL.length > 0 ){
		 aValue = null;
		 for(int index = 0 ; index < aITaskExprL.length  ; index++){
			 if( StringUtil.equals( aITaskExprL[index][0], aRefeValue ) ){
				 aValue = aITaskExprL[index][1];break;
			 }
		 }
	 }
	return aValue ;
  }
  /***
   * 
   * @param aITaskExpr
   * @param aITaskPrefe
   */
  public static void splitExpr( String aITaskExpr , java.util.Map aITaskExprList ){
	  String aITaskExprL[][] = StringUtil.splitExpr( aITaskExpr );
	  if( aITaskExprL != null && aITaskExprL.length > 0 ){
		  for(int index = 0 ; index < aITaskExprL.length  ; index++)
			  aITaskExprList.put( aITaskExprL[index][0], aITaskExprL[index][1]);
	  }
  }
  /***
   * 用ch替换字符串中指定位置的字符
   * @param str
   * @param pos
   * @param ch
   */
   public static String replace(String str,int pos,char ch) throws Exception{
	  if(str==null||str.getBytes().length<=pos) 
		  throw new ArrayIndexOutOfBoundsException();
	  byte srcByte[]=str.getBytes();
	  srcByte[pos]=(byte)ch;
	  return new String(srcByte);
   }
   /***
	 * 加密
	 * @param str
	 * @return
	 */
	public static String DoEncrypt(String str)
	{
	    int i;
	    int tmpch;
	    StringBuffer enStrBuff = new StringBuffer();
	    for(i = 0;i <str.length();i++)
	    {
	       tmpch = (int)str.charAt(i);
	       tmpch = tmpch^0x01;
	       tmpch = tmpch^0x0a;
           enStrBuff.append(Integer.toHexString(tmpch));
	    }
        return enStrBuff.toString().toUpperCase();
	}
    /***
     * 解密
     * @param str
     * @return
     */
	public static String DoDecrypt(String str)
	{
        int tmpch;
	    String deStr = str.toLowerCase();
	    StringBuffer deStrBuff = new StringBuffer();
	    for (int i=0;i<deStr.length();i+=2)
	    {
	       String subStr  = deStr.substring(i,i+2);
	       tmpch = Integer.parseInt(subStr,16);
	       tmpch = tmpch^0x01;
	       tmpch = tmpch^0x0a;
	       deStrBuff.append((char)tmpch);
	    }
	    return deStrBuff.toString();
	}
	/**
	 * 判断是否相同
	 * @param str1
	 * @param str2
	 * @return 是否相同
	 */
	public static final boolean isSame( String str1 , String str2 ){
	   if( StringUtil.isBlank(str1) && StringUtil.isBlank(str2) ){
	      return true;
	   }else if( !StringUtil.isBlank(str1) && !StringUtil.isBlank(str2) && str1.equals(str2) ){
	      return true;
	   }else{
	      return false;
	   }
	}
	/**
	 * 判断字符串是否为空或空字符
	 * @param str
	 * @return 是否为空
	 */
	public static final boolean isNull( String str ){
	  if( str == null || str.trim().equals( "" ) ){
	      return true;
	  }else{
	      return false;
	  }
	}
	/***
	 * 根据加密算法计算密文
	 * @param algorithm 消息摘要MD5和SHA-1
	 * @param aEncryptString
	 * @return
	 */
	public static final byte[] DoEncrypt(String algorithm, String aEncryptString) throws Exception{
		MessageDigest messageDigest = null;
		try {
			messageDigest = MessageDigest.getInstance( algorithm );
			messageDigest.update(aEncryptString.getBytes());
			return messageDigest.digest();
		} catch (NoSuchAlgorithmException e) {
			log.error("根据加密算法计算密文错误" ,e);
			throw new Exception("根据加密算法计算密文错误",e);
		}
		finally{
			if( messageDigest != null){messageDigest.reset();messageDigest=null;}
		}
	}
	/***
	 * 
	 * @param aVariableValue
	 * @return
	 */
	public static final String DoEnginVariable( String aVariableValue ){
		if( aVariableValue == null ) return null;
		return "$"+aVariableValue;
	}
    /***
	 * 字符串通配符算法
	 * 1,通配符*号，表示可以匹配任意多个字符
	 * 2,通配符问号?表示匹配一个字符
	 * 举例:字符串test.txt,通配符为t?s*.txt为true
	 * @param pattern
	 * @param str
	 * @return
	 */
	public static final boolean wildcardMatch(String str , String pattern){
		int patternLength = pattern.length();
        int strLength = str.length();
        int strIndex = 0;
        char ch;
        for (int patternIndex = 0; patternIndex < patternLength; patternIndex++){
            ch = pattern.charAt(patternIndex);
            if (ch == '*') {
            	while(strIndex < strLength){
            		if (wildcardMatch( str.substring(strIndex) , pattern.substring(patternIndex + 1))) 
                        return true;
                    strIndex++;
                }
            } else if (ch == '?') {
                strIndex++;
                if (strIndex > strLength) 
                    return false;
            } else {
                if ((strIndex >= strLength || (ch != str.charAt(strIndex))))
                    return false;
                strIndex++;
            }
        }
        return (strIndex == strLength);
    }
	/***
	 * 
	 * @param aPackage
	 * @return
	 */
	public static final String wildcardRight( String aPackage , String aMatch ){
		String[] aWildCard = StringUtil.split( aPackage , aMatch );
		return aWildCard[ aWildCard.length - 1];
	}
	/***
	 * 
	 * @param aPackage
	 * @return
	 */
	public static final String wildcardLeft( String aPackage , String aMatch ){
		StringBuffer aWildCard = new StringBuffer();
		String[] aWildMatch = StringUtil.split( aPackage , aMatch );
		for(int index = 0 ; index < aWildMatch.length - 1 ; index++){
			aWildCard.append( aWildMatch[index] );
			if( index < aWildMatch.length - 2 ) aWildCard.append( aMatch );
		}
		return aWildCard.toString();
	}
	/***
	 * 
	 * @param aPlatformbin 字符串字节
	 * @return
	 */
	public static final StringBuffer concatBinary(byte[][] aBinary){
		StringBuffer aStringbin = new StringBuffer();
		for(int index  = 0 ; index < aBinary.length ; index++){
			aStringbin.append(new String(aBinary[index])).append( index != aBinary.length -1 ?"\n":"");
		}
		return aStringbin;
	}
	/***
	 * 右切位
	 * @param len
	 * @return
	 */
	public static final String trimRight( String str , int len ){
		if( str == null || str.length() < len || len < 0) return str;
		return StringUtil.substring( str , str.length() - len );  
	}
	/***
	 * 
	 * @param str
	 * @param len
	 * @return
	 */
	public static final String trimLeft( String str, int len ){
		if( str == null || str.length() < len || len < 0) return str;
		return StringUtil.substring( str , 0, len ); 
	}
	/***
	 * 
	 * @param t
	 * @return
	 */
	public static final String doThrowable( Throwable t , int aVM_MAX_BYTE ) {
		String aThrowable = null;
		try
		{
			Throwable tt = t;
			if( tt.getCause() != null ) tt = tt.getCause();
			StringWriter aWrite = new StringWriter();
			PrintWriter out = new PrintWriter( aWrite );
			tt.printStackTrace( out );
			out.flush();out.close();out  = null;
			aThrowable = aWrite.toString();
			aWrite.close();aWrite = null;
			if( aThrowable.getBytes().length > aVM_MAX_BYTE ){
				aThrowable = StringUtil.substring( aThrowable , 0, aVM_MAX_BYTE );
			}
		}
		catch(Throwable e){}
		return aThrowable;
	}
	
	public static String getEmptyIfNullObj(Object str) {
		return str == null ? "" : str.toString();
	}
	
	// 2011-07-07
	public static String getCurMonth(){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMM");
		String month =formatter.format(new Date());
		return month; 
	}
	
	// 2011-07-07
	public static String getDiffMonth(String inMonth, int i){  
		int iYear = Integer.valueOf(inMonth.substring(0, 4));
		int iMonth = Integer.valueOf(inMonth.substring(4, 6)); 
		int iMonthTmp = iMonth + i;  
		int m = iMonthTmp % 12; // 月
		int n = iMonthTmp / 12; // 年 
		
		if (m <= 0) {
			n--;
			m += 12;
		} 
		String sMonth = m < 10 ? "0" + m : String.valueOf(m);
		
		return (iYear + n) + "" + sMonth; 
	}
	 
	// MD5 加密算法
	public static String MD5(String inStr) {
		MessageDigest md5 = null;

		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}

		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++) {
			byteArray[i] = (byte) charArray[i];
		}

		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();

		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}

		return hexValue.toString();
	}

	
	   /**
     * 
     * 当字符串为空时,返回defaultValue,否则返回原字符串
     * 
     * @param str
     *            原字符串
     * 
     * @param defaultValue
     *            被替换的字符
     * 
     * @return String
     */

    public static String nvl(String str, String defaultValue) {

        if (str == null) {
            str = defaultValue;
        }
        return str;
    }
	
    /**
     * 
     * 判断两个字符串是否相等
     * 
     * @param str1
     *            字符串1
     * 
     * @param str2
     *            字符串2
     * 
     * @return boolean 是否相等
     */

    public static boolean equals(String str1, String str2) {

        if (str1 == null && str2 == null || str1 != null && str1.equals(str2))
            return true;

        else
            return false;

    }
    
	/***
	 * 
	 * @param argv
	 */
	public static void main(String argv[]){
		String str[][] = StringUtil.splitExpr("A=01;B=02;C=03");
		for(int index = 0 ; index < str.length ; index++)
			log.debug( str[index][0] + "\t" + str[index][1]);
	}
	
	public final static String getEmptyIfNull(String input) {
		return input == null ? "" : input;
	}
}
