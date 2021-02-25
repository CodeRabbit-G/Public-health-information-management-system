package com.xnxy17jk2.entity;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.entity
 * @类名: User
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月6日 下午5:35:20
 */
public class User {
	private String id;
	private String name;
	private String password;
	private String rights;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRights() {
		return rights;
	}

	public void setRights(String rights) {
		this.rights = rights;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", rights=" + rights + "]";
	}

	public String getAll() {
		String oper = "[ {label : '删除', onclick : function() {if(window.confirm('是否继续删除，一旦删除将不可恢复！')){ window.location.href='user?action=delete&id="
				+ id + "&currentPage='+curPage;}}}]";

		return "[ \"" + id + "\", \"" + name + "\", \"" + rights + "\", " + oper + " ]";
	}
}
