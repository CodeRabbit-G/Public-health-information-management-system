package com.xnxy17jk2.entity;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.entity
 * @����: Infectious
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��6�� ����5:31:26
 */
public class Infectious {
	private String id;
	private String name;
	private String rId;
	private String birthday;
	private String phone;
	private String address;
	private String startDate;
	private String diagnosisDate;
	private String cardType;
	private String type;
	private String category;
	private String occupation;
	private String doctorReport;
	private String registrationDate;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getDiagnosisDate() {
		return diagnosisDate;
	}

	public void setDiagnosisDate(String diagnosisDate) {
		this.diagnosisDate = diagnosisDate;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDoctorReport() {
		return doctorReport;
	}

	public void setDoctorReport(String doctorReport) {
		this.doctorReport = doctorReport;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "Infectious [id=" + id + ", name=" + name + ", rId=" + rId + ", birthday=" + birthday
				+ ", phone=" + phone + ", address=" + address + ", startDate=" + startDate + ", diagnosisDate="
				+ diagnosisDate + ", cardType=" + cardType + ", type=" + type + ", classification=" + category
				+ ", occupation=" + occupation + ", doctorReport=" + doctorReport + ", registrationDate="
				+ registrationDate + "]";
	}

	public String getAll() {
		String oper = "[ {label : '�޸�', onclick : function() { window.location.href='infectious?action=revise&id="
				+ id
				+ "';}}, {label : 'ɾ��', onclick : function() {if(window.confirm('�Ƿ����ɾ����һ��ɾ�������ɻָ���')){ window.location.href='infectious?action=delete&id="
				+ id + "&currentPage='+curPage;}}}]";

		return "[ \"" + id + "\", \"" + name + "\", \"" + rId + "\", \"" + birthday + "\", \"" + phone + "\", \""
				+ address + "\", \"" + startDate + "\", \"" + diagnosisDate + "\", \"" + cardType + "\", \"" + type
				+ "\", \"" + category + "\", \"" + occupation + "\", \"" + doctorReport + "\", \""
				+ registrationDate + "\", " + oper + " ]";
	}
}
