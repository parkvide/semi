package com.kh.app.member.vo;

public class MemberVo {

	private String no;
	private String id;
	private String pwd;
	private String pwd2;
	private String name;
	private String birth;
	private String email;
	private String phone;
	private String quitYn;
	private String enrollDate;
	private String modifyDate;
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVo(String no, String id, String pwd, String pwd2, String name, String birth, String email,
			String phone, String quitYn, String enrollDate, String modifyDate) {
		super();
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.pwd2 = pwd2;
		this.name = name;
		this.birth = birth;
		this.email = email;
		this.phone = phone;
		this.quitYn = quitYn;
		this.enrollDate = enrollDate;
		this.modifyDate = modifyDate;
	}
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", id=" + id + ", pwd=" + pwd + ", pwd2=" + pwd2 + ", name=" + name + ", birth="
				+ birth + ", email=" + email + ", phone=" + phone + ", quitYn=" + quitYn + ", enrollDate=" + enrollDate
				+ ", modifyDate=" + modifyDate + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd2() {
		return pwd2;
	}
	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQuitYn() {
		return quitYn;
	}
	public void setQuitYn(String quitYn) {
		this.quitYn = quitYn;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	
}
