package com.xnxy17jk2.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.util
 * @����: MD5Util
 * @����: MD5���ܹ�����
 * @����: Guo_SY
 * @����ʱ��: 2020��4��29 ����1:02:51
 */
public class MD5Util {
	
	private static String[] hexs = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};

	/**
	 * md5���ܷ���
	 * @param password û�м���֮ǰ���ַ���
	 * @return ����md5����֮���16���Ƶ�32λ�ַ���
	 */
	public static String md5(String password){
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			//����
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
	 * �����ֽ���ת����һ����Ӧ����λ��ʮ�����Ƶ��ַ���
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
		
		//���̣�������һλ
		int first = num/16;
		
		//��ģ�������ڶ�λ
		int second = num%16; 

		return hexs[first]+hexs[second];
	}
	
}