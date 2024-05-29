package com.kh.app.seat.vo;

public class SeatVo {
	private String no;
	private String theaterNo;
	public SeatVo(String no, String theaterNo) {
		super();
		this.no = no;
		this.theaterNo = theaterNo;
	}
	public SeatVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTheaterNo() {
		return theaterNo;
	}
	public void setTheaterNo(String theaterNo) {
		this.theaterNo = theaterNo;
	}
	@Override
	public String toString() {
		return "SeatVo [no=" + no + ", theaterNo=" + theaterNo + "]";
	}
	
	
}
