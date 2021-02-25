package com.xnxy17jk2.entity;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.entity
 * @����: ResidentsHealth
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��4��27�� ����14:42:15
 */
public class ResidentHealthy {
	private String id;
	private String name;
	private String rId;
	private String sex;
	private String birthday;
	private String phone;
	private String address;
	private int pulse;
	private int height;
	private int weight;
	private int bloodPressure;
	private String healtAssessment;
	private String responsibleDoctor;
	private String allergy;
	private String disease;
	private String surgery;
	private String family;
	private String disability;
	
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

	public int getPulse() {
		return pulse;
	}

	public void setPulse(int pulse) {
		this.pulse = pulse;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(int bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public String getHealtAssessment() {
		return healtAssessment;
	}

	public void setHealtAssessment(String healtAssessment) {
		this.healtAssessment = healtAssessment;
	}

	public String getResponsibleDoctor() {
		return responsibleDoctor;
	}

	public void setResponsibleDoctor(String responsibleDoctor) {
		this.responsibleDoctor = responsibleDoctor;
	}

	public String getAllergy() {
		return allergy;
	}

	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getSurgery() {
		return surgery;
	}

	public void setSurgery(String surgery) {
		this.surgery = surgery;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

	@Override
	public String toString() {
		return "ResidentHealthy [id=" + id + ", name=" + name + ", rId=" + rId + ", sex=" + sex + ", birthday="
				+ birthday + ", phone=" + phone + ", address=" + address + ", pulse=" + pulse + ", height=" + height
				+ ", weight=" + weight + ", bloodPressure=" + bloodPressure + ", healtAssessment=" + healtAssessment
				+ ", responsibleDoctor=" + responsibleDoctor + ", allergy=" + allergy + ", disease=" + disease
				+ ", surgery=" + surgery + ", family=" + family + ", disability=" + disability + "]";
	}

	public String getAll() {
		String oper = "[ {label : '�޸�', onclick : function() { window.location.href='residentHealthy?action=revise&id=" + id
				+ "';}}, {label : 'ɾ��', onclick : function() {if(window.confirm('�Ƿ����ɾ����һ��ɾ�������ɻָ���')){ window.location.href='residentHealthy?action=delete&id="
				+ id + "&currentPage='+curPage;}}}]";

		return "[ \"" + id + "\", \"" + name + "\", \"" + rId + "\", \"" + sex + "\", \"" + birthday + "\", \"" + phone
				+ "\", \"" + address + "\", \"" + pulse + "\", \"" + height + "\", \"" + weight + "\", \""
				+ bloodPressure + "\", \"" + healtAssessment + "\", \"" + responsibleDoctor + "\", \"" + allergy
				+ "\", \"" + disease + "\", \"" + surgery + "\", \"" + family + "\", \"" + disability + "\", " + oper
				+ " ]";
	}

}
