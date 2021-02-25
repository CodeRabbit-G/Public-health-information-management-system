package com.xnxy17jk2.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.util
 * @����: WebUtil
 * @˵��: web������һЩ���߷���
 * @����: Guo_SY
 * @����ʱ��: 2020��4��29�� ����9:15:47
 */
public class WebUtil {
	/**
	 * ���������ݿ�����javabean��
	 * <T> T: ����һ�����ͷ���ֵ����
	 */
	public static <T> T copyRequestToBean(HttpServletRequest request,Class<T> clazz){
		try {
			T obj = clazz.newInstance();
			//ȡ����������
			Map<?, ?> map = request.getParameterMap();
			//ʹ��beanutils���߰�map���ݿ�����javabean����
			BeanUtils.copyProperties(obj, map);
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * �����жϱ����Ƿ�Ϊ�գ�null �� ���ַ�����
	 * true: ��
	 * false: ��Ϊ��
	 */
	public static boolean isEmpty(String str){
		return str==null || str.trim().equals("");
	}
	
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddhhmmss");
	/**
	 * ��ȡ��ǰʱ����ַ���
	 */
	public static String getDateStr(){
		return sdf.format(new Date());
	}
	
	/**
	 * ���ɵ�����
	 */
	public static String getIdNo(){
		Date date = new Date();
		String string  = sdf2.format(date);
		return string;
	}
}
