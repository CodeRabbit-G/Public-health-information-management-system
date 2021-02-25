package com.xnxy17jk2.biz.commonly.resident.service;

import java.util.List;

import com.xnxy17jk2.biz.commonly.resident.dao.ResidentDao;
import com.xnxy17jk2.entity.Resident;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.commonly.resident.service
 * @����: ResidentService
 * @˵��: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��4��29�� ����9:20:29
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
