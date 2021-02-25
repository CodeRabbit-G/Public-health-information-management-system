package com.xnxy17jk2.util;

import java.sql.Connection;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.util
 * @类名: JdbcUtil
 * @说明: JdbcUtil工具类
 * @作者: Guo_SY
 * @创建时间: 2020年4月29日 下午13:01:42
 */
public class JdbcUtil {
	//创建连接池工具对象，使用c3p0连接池
	private static ComboPooledDataSource ds = new ComboPooledDataSource();
	
	//获取连接池对象的方法
	public static DataSource getDataSource(){
		return ds;
	}
	
	//关闭资源
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
