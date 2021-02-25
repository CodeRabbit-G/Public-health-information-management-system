package com.xnxy17jk2.biz.commonly.residentHealthy.service;

import java.util.List;

import com.xnxy17jk2.biz.commonly.residentHealthy.dao.ResidentHealthyDao;
import com.xnxy17jk2.entity.ResidentHealthy;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.commonly.residentHealthy.service
 * @类名: ResidentHealthyService
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午4:03:14
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