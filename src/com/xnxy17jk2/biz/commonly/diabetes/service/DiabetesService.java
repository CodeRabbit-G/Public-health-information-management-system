package com.xnxy17jk2.biz.commonly.diabetes.service;

import java.util.List;

import com.xnxy17jk2.biz.commonly.diabetes.dao.DiabetesDao;
import com.xnxy17jk2.entity.Diabetes;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.commonly.diabetes.service
 * @����: DiabetesService
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����6:59:40
 */
public class DiabetesService {
	private DiabetesDao dao = new DiabetesDao();
	
	public List<Diabetes> query() {
		return dao.findAll();
	}
	
	public List<Diabetes> query(int curPage,int pageSize) {
		return dao.findRange(curPage,pageSize);
	}
	
	public List<Diabetes> search(String factor,String content) {
		return dao.findCondition(factor,content);
	}
	
	public int getCount() {
		return dao.getCount();
	}
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	public Diabetes findById(String id) {
		return dao.findById(id);
	}
	
	public Boolean save(Diabetes diabetes) {
		return dao.insert(diabetes);
	}
	
	public Boolean update(Diabetes diabetes) {
		return dao.update(diabetes);
	}
}
