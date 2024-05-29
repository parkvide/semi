package com.kh.app.screeninfo.vo;

public class ScreenInfoVo {
	private String no;
	private String movieNo;
	private String theaterNo;
	private String screeningDate;
	public ScreenInfoVo(String no, String movieNo, String theaterNo, String screeningDate) {
		super();
		this.no = no;
		this.movieNo = movieNo;
		this.theaterNo = theaterNo;
		this.screeningDate = screeningDate;
	}
	public ScreenInfoVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMovieNo() {
		return movieNo;
	}
	public void setMovieNo(String movieNo) {
		this.movieNo = movieNo;
	}
	public String getTheaterNo() {
		return theaterNo;
	}
	public void setTheaterNo(String theaterNo) {
		this.theaterNo = theaterNo;
	}
	public String getScreeningDate() {
		return screeningDate;
	}
	public void setScreeningDate(String screeningDate) {
		this.screeningDate = screeningDate;
	}
	@Override
	public String toString() {
		return "ScreenInfoVo [no=" + no + ", movieNo=" + movieNo + ", theaterNo=" + theaterNo + ", screeningDate="
				+ screeningDate + "]";
	}
	
	
	
	
}
