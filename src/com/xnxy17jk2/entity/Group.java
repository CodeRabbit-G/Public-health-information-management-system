package com.xnxy17jk2.entity;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.entity
 * @����: Group
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��6�� ����5:28:22
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
		String oper = "[ {label : '�޸�', onclick : function() { window.location.href='group?action=revise&id="
				+ id
				+ "';}}, {label : 'ɾ��', onclick : function() {if(window.confirm('�Ƿ����ɾ����һ��ɾ�������ɻָ���')){ window.location.href='group?action=delete&id="
				+ id + "&currentPage='+curPage;}}}]";

		return "[ \"" + id + "\", \"" + eduDate + "\", \"" + eduTheme + "\", \"" + eduType + "\", \"" + eduPlace
				+ "\", \"" + eduObject + "\", \"" + eduNumber + "\", \"" + eduContent + "\", " + oper + " ]";
	}
}
