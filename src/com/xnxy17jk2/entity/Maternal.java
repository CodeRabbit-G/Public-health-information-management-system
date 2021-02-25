package com.xnxy17jk2.entity;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.entity
 * @类名: Maternal
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月6日 下午4:43:56
 */
public class Maternal {
	private String id;
	private String name;
	private String rId;
	private String birthday;
	private String phone;
	private String address;
	private String expected;
	private String deliveryRecord;
	private String oneVisit;
	private String gestationalAge;
	private String twoVisit;
	private String postpartumVisit;
	private String postpartum42Day;
	private String deliveryMode;
	private String deliveryDate;
	private String babyName;
	private String babySex;
	private String husband;
	private String healthCard;
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

	public String getExpected() {
		return expected;
	}

	public void setExpected(String expected) {
		this.expected = expected;
	}

	public String getDeliveryRecord() {
		return deliveryRecord;
	}

	public void setDeliveryRecord(String deliveryRecord) {
		this.deliveryRecord = deliveryRecord;
	}

	public String getOneVisit() {
		return oneVisit;
	}

	public void setOneVisit(String oneVisit) {
		this.oneVisit = oneVisit;
	}

	public String getGestationalAge() {
		return gestationalAge;
	}

	public void setGestationalAge(String gestationalAge) {
		this.gestationalAge = gestationalAge;
	}

	public String getTwoVisit() {
		return twoVisit;
	}

	public void setTwoVisit(String twoVisit) {
		this.twoVisit = twoVisit;
	}

	public String getPostpartumVisit() {
		return postpartumVisit;
	}

	public void setPostpartumVisit(String postpartumVisit) {
		this.postpartumVisit = postpartumVisit;
	}

	public String getPostpartum42Day() {
		return postpartum42Day;
	}

	public void setPostpartum42Day(String postpartum42Day) {
		this.postpartum42Day = postpartum42Day;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getBabyName() {
		return babyName;
	}

	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}

	public String getBabySex() {
		return babySex;
	}

	public void setBabySex(String babySex) {
		this.babySex = babySex;
	}

	public String getHusband() {
		return husband;
	}

	public void setHusband(String husband) {
		this.husband = husband;
	}

	public String getHealthCard() {
		return healthCard;
	}

	public void setHealthCard(String healthCard) {
		this.healthCard = healthCard;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "Maternal [id=" + id + ", name=" + name + ", rId=" + rId + ", birthday=" + birthday + ", phone=" + phone
				+ ", address=" + address + ", expected=" + expected + ", deliveryRecord=" + deliveryRecord
				+ ", oneVisit=" + oneVisit + ", gestationalAge=" + gestationalAge + ", twoVisit=" + twoVisit
				+ ", postpartumVisit=" + postpartumVisit + ", postpartum42day=" + postpartum42Day + ", deliveryMode="
				+ deliveryMode + ", deliveryDate=" + deliveryDate + ", babyName=" + babyName + ", babySex=" + babySex
				+ ", husband=" + husband + ", healthCard=" + healthCard + ", registrationDate=" + registrationDate
				+ "]";
	}

	public String getAll() {
		String oper = "[ {label : '修改', onclick : function() { window.location.href='maternal?action=revise&id=" + id
				+ "';}}, {label : '删除', onclick : function() {if(window.confirm('是否继续删除，一旦删除将不可恢复！')){ window.location.href='maternal?action=delete&id="
				+ id + "&currentPage='+curPage;}}}]";

		return "[ \"" + id + "\", \"" + name + "\", \"" + rId + "\", \"" + birthday + "\", \"" + phone + "\", \""
				+ address + "\", \"" + expected + "\", \"" + deliveryRecord + "\", \"" + oneVisit + "\", \""
				+ gestationalAge + "\", \"" + twoVisit + "\", \"" + postpartumVisit + "\", \"" + postpartum42Day
				+ "\", \"" + deliveryMode + "\", \"" + deliveryDate + "\", \"" + babyName + "\", \"" + babySex
				+ "\", \"" + husband + "\", \"" + healthCard + "\", \"" + registrationDate + "\", " + oper + " ]";
	}
}
