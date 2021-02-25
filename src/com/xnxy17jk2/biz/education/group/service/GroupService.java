package com.xnxy17jk2.biz.education.group.service;

import java.util.List;

import com.xnxy17jk2.biz.education.group.dao.GroupDao;
import com.xnxy17jk2.entity.Group;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.education.group.service
 * @类名: Group
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午9:46:13
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
