package com.xnxy17jk2.entity;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.entity
 * @类名: ChildrenHealthy
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月6日 下午4:21:41
 */
public class ChildrenHealthy {
	private String id;
	private String name;
	private String rId;
	private String sex;
	private String birthday;
	private String phone;
	private String address;
	private String infirmity;
	private String infirmityFactor;
	private int visit;
	private int oneYears;
	private int twoYears;
	private int sixYears;
	private String mother;
	private String father;

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

	public String getInfirmity() {
		return infirmity;
	}

	public void setInfirmity(String infirmity) {
		this.infirmity = infirmity;
	}

	public String getInfirmityFactor() {
		return infirmityFactor;
	}

	public void setInfirmityFactor(String infirmityFactor) {
		this.infirmityFactor = infirmityFactor;
	}

	public int getVisit() {
		return visit;
	}

	public void setVisit(int visit) {
		this.visit = visit;
	}

	public int getOneYears() {
		return oneYears;
	}

	public void setOneYears(int oneYears) {
		this.oneYears = oneYears;
	}

	public int getTwoYears() {
		return twoYears;
	}

	public void setTwoYears(int twoYears) {
		this.twoYears = twoYears;
	}

	public int getSixYears() {
		return sixYears;
	}

	public void setSixYears(int sixYears) {
		this.sixYears = sixYears;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	@Override
	public String toString() {
		return "ChildrenHealthy [id=" + id + ", name=" + name + ", rId=" + rId + ", sex=" + sex + ", birthday="
				+ birthday + ", phone=" + phone + ", address=" + address + ", infirmity=" + infirmity
				+ ", infirmityFactor=" + infirmityFactor + ", visit=" + visit + ", oneYears=" + oneYears + ", twoYears="
				+ twoYears + ", sixYears=" + sixYears + ", mother=" + mother + ", father=" + father + "]";
	}

	public String getAll() {
		String oper = "[ {label : '修改', onclick : function() { window.location.href='childrenHealthy?action=revise&id="
				+ id
				+ "';}}, {label : '删除', onclick : function() {if(window.confirm('是否继续删除，一旦删除将不可恢复！')){ window.location.href='childrenHealthy?action=delete&id="
				+ id + "&currentPage='+curPage;}}}]";

		return "[ \"" + id + "\", \"" + name + "\", \"" + rId + "\", \"" + sex + "\", \"" + birthday + "\", \"" + phone
				+ "\", \"" + address + "\", \"" + infirmity + "\", \"" + infirmityFactor + "\", \"" + visit + "\", \""
				+ oneYears + "\", \"" + twoYears + "\", \"" + sixYears + "\", \"" + mother + "\", \"" + father + "\", "
				+ oper + " ]";
	}
}
