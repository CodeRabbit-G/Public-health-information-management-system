package com.xnxy17jk2.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.util
 * @类名: MD5Util
 * @描述: MD5加密工具类
 * @作者: Guo_SY
 * @创建时间: 2020年4月29 下午1:02:51
 */
public class MD5Util {
	
	private static String[] hexs = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};

	/**
	 * md5加密方法
	 * @param password 没有加密之前的字符串
	 * @return 经过md5加密之后的16进制的32位字符串
	 */
	public static String md5(String password){
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			//加密
			byte[] byteArray = md.digest(password.getBytes());
			
			StringBuffer sb = new StringBuffer();
			
			for(byte b:byteArray){
				//System.out.print(b+" ");
				sb.append(byteToHexString(b));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 根据字节数转换成一个对应的两位的十六进制的字符串
	 * @param b
	 * @return
	 */
	private static String byteToHexString(byte b){

		int num = 0;
		if(b<0){
			num=256+b;
		}else{
			num=b;
		}
		
		//求商，除数第一位
		int first = num/16;
		
		//求模，余数第二位
		int second = num%16; 

		return hexs[first]+hexs[second];
	}
	
}