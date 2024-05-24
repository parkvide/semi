package com.kh.app.member.vo;

public class EditVo {

	private String type;
	private String value;
	public EditVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EditVo(String type, String value) {
		super();
		this.type = type;
		this.value = value;
	}
	@Override
	public String toString() {
		return "EditVo [type=" + type + ", value=" + value + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
