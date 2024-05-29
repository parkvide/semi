package com.kh.app.admin.theater.vo;

public class AdminTheaterVo {

	private String no;
	private String type;
	private String theaterImg;
	private String price;
	@Override
	public String toString() {
		return "AdminTheaterVo [no=" + no + ", type=" + type + ", theaterImg=" + theaterImg + ", price=" + price + "]";
	}
	public AdminTheaterVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminTheaterVo(String no, String type, String theaterImg, String price) {
		super();
		this.no = no;
		this.type = type;
		this.theaterImg = theaterImg;
		this.price = price;
	}
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
	public String getTheaterImg() {
		return theaterImg;
	}
	public void setTheaterImg(String theaterImg) {
		this.theaterImg = theaterImg;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	
}
