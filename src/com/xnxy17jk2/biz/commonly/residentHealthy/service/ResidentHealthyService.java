package com.xnxy17jk2.biz.commonly.residentHealthy.service;

import java.util.List;

import com.xnxy17jk2.biz.commonly.residentHealthy.dao.ResidentHealthyDao;
import com.xnxy17jk2.entity.ResidentHealthy;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.commonly.residentHealthy.service
 * @����: ResidentHealthyService
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����4:03:14
 */
public class ResidentHealthyService {
	private ResidentHealthyDao dao = new ResidentHealthyDao();
	
	public List<ResidentHealthy> query() {
		return dao.findAll();
	}
	
	public List<ResidentHealthy> query(int curPage,int pageSize) {
		return dao.findRange(curPage,pageSize);
	}
	
	public List<ResidentHealthy> search(String factor,String content) {
		return dao.findCondition(factor,content);
	}
	
	public int getCount() {
		return dao.getCount();
	}
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	public ResidentHealthy findById(String id) {
		return dao.findById(id);
	}
	
	public Boolean save(ResidentHealthy residentHealthy) {
		return dao.insert(residentHealthy);
	}
	
	public Boolean update(ResidentHealthy residentHealthy) {
		return dao.update(residentHealthy);
	}
}