package com.xnxy17jk2.biz.commonly.resident.service;

import java.util.List;

import com.xnxy17jk2.biz.commonly.resident.dao.ResidentDao;
import com.xnxy17jk2.entity.Resident;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.commonly.resident.service
 * @类名: ResidentService
 * @说明: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年4月29日 下午9:20:29
 */
public class ResidentService {
	private ResidentDao dao = new ResidentDao();
	
	public List<Resident> query() {
		return dao.findAll();
	}
	
	public List<Resident> query(int curPage,int pageSize) {
		return dao.findRange(curPage,pageSize);
	}
	
	public List<Resident> search(String factor,String content) {
		return dao.findCondition(factor,content);
	}
	
	public int getCount() {
		return dao.getCount();
	}
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	public Resident findById(String id) {
		return dao.findById(id);
	}
	
	public Boolean save(Resident resident) {
		return dao.insert(resident);
	}
	
	public Boolean update(Resident resident) {
		return dao.update(resident);
	}
}
