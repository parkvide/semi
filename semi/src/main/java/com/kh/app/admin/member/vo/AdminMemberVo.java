package com.kh.app.admin.member.vo;

public class AdminMemberVo {
	
	private String no;
	private String id;
	private String pwd;
	private String name;
	private String birth;
	private String email;
	private String phone;
	private String enrollDate;
	private String quitYn;
	private String modifyDate;
	
	public AdminMemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdminMemberVo [no=" + no + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", birth=" + birth
				+ ", email=" + email + ", phone=" + phone + ", enrollDate=" + enrollDate + ", quitYn=" + quitYn
				+ ", modifyDate=" + modifyDate + "]";
	}
	public AdminMemberVo(String no, String id, String pwd, String name, String birth, String email, String phone,
			String enrollDate, String quitYn, String modifyDate) {
		super();
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.birth = birth;
		this.email = email;
		this.phone = phone;
		this.enrollDate = enrollDate;
		this.quitYn = quitYn;
		this.modifyDate = modifyDate;
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
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getQuitYn() {
		return quitYn;
	}
	public void setQuitYn(String quitYn) {
		this.quitYn = quitYn;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

}
