package com.kh.app.theater.vo;

public class TheaterVo {
	private String no;
	private String type;
	private String cinemaNo;
	private String theaterName;
	public TheaterVo(String no, String type, String cinemaNo, String theaterName) {
		super();
		this.no = no;
		this.type = type;
		this.cinemaNo = cinemaNo;
		this.theaterName = theaterName;
	}
	public TheaterVo() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getCinemaNo() {
		return cinemaNo;
	}
	public void setCinemaNo(String cinemaNo) {
		this.cinemaNo = cinemaNo;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	@Override
	public String toString() {
		return "TheaterVo [no=" + no + ", type=" + type + ", cinemaNo=" + cinemaNo + ", theaterName=" + theaterName
				+ "]";
	}
	
	
}
