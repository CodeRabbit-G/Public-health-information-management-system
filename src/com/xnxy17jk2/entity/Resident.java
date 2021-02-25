package com.xnxy17jk2.entity;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.entity
 * @����: Resident
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��4��29�� ����12:38:38
 */
public class Resident {
	private String id;
	private String name;
	private String rId;
	private String sex;
	private String nation;
	private String birthday;
	private String phone;
	private String address;
	private String province;
	private String diploma;
	private String occupation;
	private String marriage;

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

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
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

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getDiploma() {
		return diploma;
	}

	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	@Override
	public String toString() {
		return "Resident [id=" + id + ", name=" + name + ", rId=" + rId + ", sex=" + sex + ", nation=" + nation
				+ ", birthday=" + birthday + ", phone=" + phone + ", address=" + address + ", province=" + province
				+ ", diploma=" + diploma + ", occupation=" + occupation + ", marriage=" + marriage + "]";
	}

	public String getAll() {
		String oper = "[ {label : '�޸�', onclick : function() { window.location.href='resident?action=revise&id=" + id
				+ "';}}, {label : 'ɾ��', onclick : function() { if(window.confirm('�Ƿ����ɾ����һ��ɾ�������ɻָ���')){ window.location.href='resident?action=delete&id="
				+ id + "&currentPage='+curPage;}}}]";

		return "[ \"" + id + "\", \"" + name + "\", \"" + rId + "\", \"" + sex + "\", \"" + nation + "\", \"" + birthday
				+ "\", \"" + phone + "\", \"" + address + "\", \"" + province + "\", \"" + diploma + "\", \""
				+ occupation + "\", \"" + marriage + "\", " + oper + " ]";
	}

}
