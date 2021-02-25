package com.xnxy17jk2.entity;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.entity
 * @类名: Group
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月6日 下午5:28:22
 */
public class Group {
	private String id;
	private String eduDate;
	private String eduTheme;
	private String eduType;
	private String eduPlace;
	private String eduObject;
	private int eduNumber;
	private String eduContent;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEduDate() {
		return eduDate;
	}

	public void setEduDate(String eduDate) {
		this.eduDate = eduDate;
	}

	public String getEduTheme() {
		return eduTheme;
	}

	public void setEduTheme(String eduTheme) {
		this.eduTheme = eduTheme;
	}

	public String getEduType() {
		return eduType;
	}

	public void setEduType(String eduType) {
		this.eduType = eduType;
	}

	public String getEduPlace() {
		return eduPlace;
	}

	public void setEduPlace(String eduPlace) {
		this.eduPlace = eduPlace;
	}

	public String getEduObject() {
		return eduObject;
	}

	public void setEduObject(String eduObject) {
		this.eduObject = eduObject;
	}

	public int getEduNumber() {
		return eduNumber;
	}

	public void setEduNumber(int eduNumber) {
		this.eduNumber = eduNumber;
	}

	public String getEduContent() {
		return eduContent;
	}

	public void setEduContent(String eduContent) {
		this.eduContent = eduContent;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", eduDate=" + eduDate + ", eduTheme=" + eduTheme + ", eduType=" + eduType
				+ ", eduPlace=" + eduPlace + ", eduObject=" + eduObject + ", eduNumber=" + eduNumber + ", eduContent="
				+ eduContent + "]";
	}

	public String getAll() {
		String oper = "[ {label : '修改', onclick : function() { window.location.href='group?action=revise&id="
				+ id
				+ "';}}, {label : '删除', onclick : function() {if(window.confirm('是否继续删除，一旦删除将不可恢复！')){ window.location.href='group?action=delete&id="
				+ id + "&currentPage='+curPage;}}}]";

		return "[ \"" + id + "\", \"" + eduDate + "\", \"" + eduTheme + "\", \"" + eduType + "\", \"" + eduPlace
				+ "\", \"" + eduObject + "\", \"" + eduNumber + "\", \"" + eduContent + "\", " + oper + " ]";
	}
}
