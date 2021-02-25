package com.xnxy17jk2.biz.special.childrenVaccine.service;

import java.util.List;

import com.xnxy17jk2.biz.special.childrenVaccine.dao.ChildrenVaccineDao;
import com.xnxy17jk2.entity.ChildrenVaccine;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.special.childrenVaccine.service
 * @����: ChildrenVaccineService
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����8:51:11
 */
public class ChildrenVaccineService {
	private ChildrenVaccineDao dao = new ChildrenVaccineDao();
	
	public List<ChildrenVaccine> query() {
		return dao.findAll();
	}
	
	public List<ChildrenVaccine> query(int curPage,int pageSize) {
		return dao.findRange(curPage,pageSize);
	}
	
	public List<ChildrenVaccine> search(String factor,String content) {
		return dao.findCondition(factor,content);
	}
	
	public int getCount() {
		return dao.getCount();
	}
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	public ChildrenVaccine findById(String id) {
		return dao.findById(id);
	}
	
	public Boolean save(ChildrenVaccine childrenVaccine) {
		return dao.insert(childrenVaccine);
	}
	
	public Boolean update(ChildrenVaccine childrenVaccine) {
		return dao.update(childrenVaccine);
	}
}
