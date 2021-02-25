package com.xnxy17jk2.entity;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.entity
 * @����: ChildrenVaccine
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��6�� ����4:29:22
 */
public class ChildrenVaccine {
	private String id;
	private String name;
	private String rId;
	private String sex;
	private String birthday;
	private String relatives;
	private String phone;
	private String address;
	private String inoculationDate;
	private String inoculationContent;

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

	public String getRelatives() {
		return relatives;
	}

	public void setRelatives(String relatives) {
		this.relatives = relatives;
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

	public String getInoculationDate() {
		return inoculationDate;
	}

	public void setInoculationDate(String inoculationDate) {
		this.inoculationDate = inoculationDate;
	}

	public String getInoculationContent() {
		return inoculationContent;
	}

	public void setInoculationContent(String inoculationContent) {
		this.inoculationContent = inoculationContent;
	}

	@Override
	public String toString() {
		return "ChildrenVaccine [id=" + id + ", name=" + name + ", rId=" + rId + ", sex=" + sex + ", birthday="
				+ birthday + ", relatives=" + relatives + ", phone=" + phone + ", address=" + address
				+ ", inoculationDate=" + inoculationDate + ", inoculationContent=" + inoculationContent + "]";
	}

	public String getAll() {
		String oper = "[ {label : '�޸�', onclick : function() { window.location.href='childrenVaccine?action=revise&id="
				+ id
				+ "';}}, {label : 'ɾ��', onclick : function() {if(window.confirm('�Ƿ����ɾ����һ��ɾ�������ɻָ���')){ window.location.href='childrenVaccine?action=delete&id="
				+ id + "&currentPage='+curPage;}}}]";

		return "[ \"" + id + "\", \"" + name + "\", \"" + rId + "\", \"" + sex + "\", \"" + birthday + "\", \""
				+ relatives + "\", \"" + phone + "\", \"" + address + "\", \"" + inoculationDate + "\", \""
				+ inoculationContent + "\", " + oper + " ]";
	}
}
