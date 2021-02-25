package com.xnxy17jk2.entity;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.entity
 * @����: Personal
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��6�� ����4:54:03
 */
public class Personal {
	private String id;
	private String name;
	private String rId;
	private String birthday;
	private String phone;
	private String eduDoctor;
	private String eduDate;
	private String eduMode;
	private String eduTheme;
	private String eduContent;

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

	public String getEduDoctor() {
		return eduDoctor;
	}

	public void setEduDoctor(String eduDoctor) {
		this.eduDoctor = eduDoctor;
	}

	public String getEduDate() {
		return eduDate;
	}

	public void setEduDate(String eduDate) {
		this.eduDate = eduDate;
	}

	public String getEduMode() {
		return eduMode;
	}

	public void setEduMode(String eduMode) {
		this.eduMode = eduMode;
	}

	public String getEduTheme() {
		return eduTheme;
	}

	public void setEduTheme(String eduTheme) {
		this.eduTheme = eduTheme;
	}

	public String getEduContent() {
		return eduContent;
	}

	public void setEduContent(String eduContent) {
		this.eduContent = eduContent;
	}

	@Override
	public String toString() {
		return "Personal [id=" + id + ", name=" + name + ", rId=" + rId + ", birthday=" + birthday + ", phone="
				+ phone + ", eduDoctor=" + eduDoctor + ", eduDate=" + eduDate + ", eduMode=" + eduMode + ", eduTheme="
				+ eduTheme + ", eduContent=" + eduContent + "]";
	}

	public String getAll() {
		String oper = "[ {label : '�޸�', onclick : function() { window.location.href='personal?action=revise&id="
				+ id
				+ "';}}, {label : 'ɾ��', onclick : function() {if(window.confirm('�Ƿ����ɾ����һ��ɾ�������ɻָ���')){ window.location.href='personal?action=delete&id="
				+ id + "&currentPage='+curPage;}}}]";

		return "[ \"" + id + "\", \"" + name + "\", \"" + rId + "\", \"" + birthday + "\", \"" + phone + "\", \""
				+ eduDoctor + "\", \"" + eduDate + "\", \"" + eduMode + "\", \"" + eduTheme + "\", \"" + eduContent
				+ "\", " + oper + " ]";
	}
}
