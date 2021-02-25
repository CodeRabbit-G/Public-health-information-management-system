package com.xnxy17jk2.biz.commonly.hypertension.service;

import java.util.List;

import com.xnxy17jk2.biz.commonly.hypertension.dao.HypertensionDao;
import com.xnxy17jk2.entity.Hypertension;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.commonly.hypertension.service
 * @����: HypertensionService
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����6:57:10
 */
public class HypertensionService {
	private HypertensionDao dao = new HypertensionDao();
	
	public List<Hypertension> query() {
		return dao.findAll();
	}
	
	public List<Hypertension> query(int curPage,int pageSize) {
		return dao.findRange(curPage,pageSize);
	}
	
	public List<Hypertension> search(String factor,String content) {
		return dao.findCondition(factor,content);
	}
	
	public int getCount() {
		return dao.getCount();
	}
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	public Hypertension findById(String id) {
		return dao.findById(id);
	}
	
	public Boolean save(Hypertension hypertension) {
		return dao.insert(hypertension);
	}
	
	public Boolean update(Hypertension hypertension) {
		return dao.update(hypertension);
	}
}