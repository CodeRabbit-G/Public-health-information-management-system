package com.xnxy17jk2.biz.education.group.service;

import java.util.List;

import com.xnxy17jk2.biz.education.group.dao.GroupDao;
import com.xnxy17jk2.entity.Group;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.education.group.service
 * @����: Group
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����9:46:13
 */
public class GroupService {
	private GroupDao dao = new GroupDao();
	
	public List<Group> query() {
		return dao.findAll();
	}
	
	public List<Group> query(int curPage,int pageSize) {
		return dao.findRange(curPage,pageSize);
	}
	
	public List<Group> search(String factor,String content) {
		return dao.findCondition(factor,content);
	}
	
	public int getCount() {
		return dao.getCount();
	}
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	public Group findById(String id) {
		return dao.findById(id);
	}
	
	public Boolean save(Group group) {
		return dao.insert(group);
	}
	
	public Boolean update(Group group) {
		return dao.update(group);
	}
}
