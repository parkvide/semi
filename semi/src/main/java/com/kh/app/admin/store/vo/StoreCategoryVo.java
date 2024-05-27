package com.kh.app.admin.store.vo;

public class StoreCategoryVo {
	
	private String no;
	private String type;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public StoreCategoryVo(String no, String type) {
		super();
		this.no = no;
		this.type = type;
	}
	@Override
	public String toString() {
		return "StoreCategoryVo [no=" + no + ", type=" + type + "]";
	}
	public StoreCategoryVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
