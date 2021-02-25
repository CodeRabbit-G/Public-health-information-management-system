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
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.util
 * @����: BaseDao
 * @˵��: ͨ�õ�Dao�࣬�����װ��һЩ����DAOͨ�õķ���,ҵ��DAO����Ҫ�̳д��� Լ��ǰ�᣺
 *      1��������javabean�����Ʊ���һ�£�(�ֶ�����TAB_) 2������ֶ�����javabean���������Ʊ���һ�£�
 * @����: Guo_SY
 * @����ʱ��: 2020��4��29�� ����12:39:10
 */
public abstract class BaseDao<T> {
	private String tableName;// ����
	private Class<?> clazz;// ��ǰ���͵�����

	/**
	 * �õ�T�����ͣ���ֵ��clazz
	 * 
	 */
	public BaseDao() {
		// �õ���������(����������)
		Type parentType = this.getClass().getGenericSuperclass();
		// ת�ɲ��������ͽӿ�
		ParameterizedType paramterType = (ParameterizedType) parentType;
		// �õ������������еĲ������ͣ��������ͣ�
		Type[] types = paramterType.getActualTypeArguments();
		// �õ���һ�����±�Ϊ0��
		clazz = (Class<?>) types[0];
		// �õ�����
		tableName = "TAB_" + clazz.getSimpleName().toLowerCase();

	}

	/**
	 * ��ȡ��������
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
	 * ��ȡ���ж���
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
	 * ��������
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
	 * ��ҳ��ȡ��ȡ
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
	 * ɾ��
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
	 * ��ȡ����
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
