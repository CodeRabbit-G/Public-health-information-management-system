package com.xnxy17jk2.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.util
 * @类名: BaseDao
 * @说明: 通用的Dao类，该类封装了一些所有DAO通用的方法,业务DAO类需要继承此类 约定前提：
 *      1）表名和javabean的名称保持一致！(手动补了TAB_) 2）表的字段名和javabean的属性名称保持一致！
 * @作者: Guo_SY
 * @创建时间: 2020年4月29日 下午12:39:10
 */
public abstract class BaseDao<T> {
	private String tableName;// 表名
	private Class<?> clazz;// 当前泛型的类型

	/**
	 * 得到T的类型，赋值给clazz
	 * 
	 */
	public BaseDao() {
		// 得到父类类型(参数化类型)
		Type parentType = this.getClass().getGenericSuperclass();
		// 转成参数类类型接口
		ParameterizedType paramterType = (ParameterizedType) parentType;
		// 得到参数化类型中的参数类型（泛型类型）
		Type[] types = paramterType.getActualTypeArguments();
		// 得到第一个（下标为0）
		clazz = (Class<?>) types[0];
		// 得到表名
		tableName = "TAB_" + clazz.getSimpleName().toLowerCase();

	}

	/**
	 * 获取单个对象
	 * 
	 */
	@SuppressWarnings("unchecked")
	public T findById(String id) {
		try {
			QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
			return (T) qr.query("select * from " + tableName + "  where id=?", new BeanHandler(clazz),
					new Object[] { id });
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 获取所有对象
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		try {
			QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
			return (List<T>) qr.query("select * from " + tableName + "", new BeanListHandler(clazz));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 条件搜索
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<T>  findCondition(String factor,String content) {
		try {
			QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
			return (List<T>) qr.query("select * from " + tableName + " WHERE " + factor + " like '" + content + "'", new BeanListHandler(clazz));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 分页获取获取
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<T> findRange(int curPage,int pageSize) {
		try {
			QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
			return (List<T>) qr.query("select * from (select t.*,rownum rn from " + tableName + " t) n where n.rn>" + curPage + " and n.rn<=" + pageSize + "", new BeanListHandler(clazz));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 删除
	 * 
	 */
	public void delete(String id) {
		try {
			QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
			qr.update("delete from " + tableName + " where id=?", id);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 获取总数
	 * 
	 */
	public int getCount() {
		try {
			QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
			Object obj = qr.query("select count(*) from " + tableName + "", new ScalarHandler());
			return Integer.parseInt(String.valueOf(obj));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
}
