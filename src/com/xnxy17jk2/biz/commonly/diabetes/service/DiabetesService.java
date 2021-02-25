package com.xnxy17jk2.biz.commonly.diabetes.service;

import java.util.List;

import com.xnxy17jk2.biz.commonly.diabetes.dao.DiabetesDao;
import com.xnxy17jk2.entity.Diabetes;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.commonly.diabetes.service
 * @类名: DiabetesService
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午6:59:40
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
