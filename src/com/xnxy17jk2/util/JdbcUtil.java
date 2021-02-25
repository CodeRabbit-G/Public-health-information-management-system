package com.xnxy17jk2.util;

import java.sql.Connection;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.util
 * @����: JdbcUtil
 * @˵��: JdbcUtil������
 * @����: Guo_SY
 * @����ʱ��: 2020��4��29�� ����13:01:42
 */
public class JdbcUtil {
	//�������ӳع��߶���ʹ��c3p0���ӳ�
	private static ComboPooledDataSource ds = new ComboPooledDataSource();
	
	//��ȡ���ӳض���ķ���
	public static DataSource getDataSource(){
		return ds;
	}
	
	//�ر���Դ
	public static void close(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
}
