package com.xnxy17jk2.entity;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.entity
 * @类名: Personal
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月6日 下午4:54:03
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
		String oper = "[ {label : '修改', onclick : function() { window.location.href='personal?action=revise&id="
				+ id
				+ "';}}, {label : '删除', onclick : function() {if(window.confirm('是否继续删除，一旦删除将不可恢复！')){ window.location.href='personal?action=delete&id="
				+ id + "&currentPage='+curPage;}}}]";

		return "[ \"" + id + "\", \"" + name + "\", \"" + rId + "\", \"" + birthday + "\", \"" + phone + "\", \""
				+ eduDoctor + "\", \"" + eduDate + "\", \"" + eduMode + "\", \"" + eduTheme + "\", \"" + eduContent
				+ "\", " + oper + " ]";
	}
}
