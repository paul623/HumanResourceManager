package com.paul623.javaweb.ex.humanresourcemanagement.entity;

import java.io.Serializable;

public class Employee implements Serializable {
	private Integer id;
	private Integer jobId;
	private Integer deptId;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	private Dept dept;
	private Job job;
	private String name;
	private String cardId;
	private String address;
	private String phone;
	private String qqNum;
	private String email;
	private Integer sex;
	private String party;
	
	private String birthday;
	private String education;
	private String speciality;
	private String hobby;
	private String createDate;
	private String sexStr;

	public String getSexStr() {
		if(sex==1){
			return "男";
		}else {
			return "女";
		}
	}

	public void setSexStr(String sexStr) {
		this.sexStr = sexStr;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQqNum() {
		return qqNum;
	}

	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", jobId=" + jobId +
				", deptId=" + deptId +
				", password='" + password + '\'' +
				", dept=" + dept +
				", job=" + job +
				", name='" + name + '\'' +
				", cardId='" + cardId + '\'' +
				", address='" + address + '\'' +
				", phone='" + phone + '\'' +
				", qqNum='" + qqNum + '\'' +
				", email='" + email + '\'' +
				", sex=" + sex +
				", party='" + party + '\'' +
				", birthday='" + birthday + '\'' +
				", education='" + education + '\'' +
				", speciality='" + speciality + '\'' +
				", hobby='" + hobby + '\'' +
				", createDate='" + createDate + '\'' +
				", sexStr='" + sexStr + '\'' +
				'}';
	}
}
