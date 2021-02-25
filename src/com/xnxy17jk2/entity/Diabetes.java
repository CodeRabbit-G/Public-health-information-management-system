package com.xnxy17jk2.entity;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.entity
 * @类名: Diabetes
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月6日 下午4:17:30
 */
public class Diabetes {
	private String id;
	private String name;
	private String rId;
	private String sex;
	private String birthday;
	private String phone;
	private String address;
	private String type;
	private String testDate;

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

	public String getrId() {
		return rId;
	}

	public void setrId(String rId) {
		this.rId = rId;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTestDate() {
		return testDate;
	}

	public void setTestDate(String testDate) {
		this.testDate = testDate;
	}

	@Override
	public String toString() {
		return "Diabetes [id=" + id + ", name=" + name + ", rId=" + rId + ", sex=" + sex + ", birthday=" + birthday
				+ ", phone=" + phone + ", address=" + address + ", type=" + type + ", testDate=" + testDate + "]";
	}

	public String getAll() {
		String oper = "[ {label : '修改', onclick : function() { window.location.href='diabetes?action=revise&id=" + id
				+ "';}}, {label : '删除', onclick : function() {if(window.confirm('是否继续删除，一旦删除将不可恢复！')){ window.location.href='diabetes?action=delete&id="
				+ id + "&currentPage='+curPage;}}}]";

		return "[ \"" + id + "\", \"" + name + "\", \"" + rId + "\", \"" + sex + "\", \"" + birthday + "\", \"" + phone
				+ "\", \"" + address + "\", \"" + type + "\", \"" + testDate + "\", " + oper + " ]";
	}

}
