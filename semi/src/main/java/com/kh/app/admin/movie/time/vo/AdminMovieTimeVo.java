package com.kh.app.admin.movie.time.vo;

public class AdminMovieTimeVo {
	
	private String no;
	private String movieNo;
	private String theaterNo;
	private String screeningDate;
	private String name;
	private String theaterName;
	public AdminMovieTimeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdminMovieTimeVo [no=" + no + ", movieNo=" + movieNo + ", theaterNo=" + theaterNo + ", screeningDate="
				+ screeningDate + ", name=" + name + ", theaterName=" + theaterName + "]";
	}
	public AdminMovieTimeVo(String no, String movieNo, String theaterNo, String screeningDate, String name,
			String theaterName) {
		super();
		this.no = no;
		this.movieNo = movieNo;
		this.theaterNo = theaterNo;
		this.screeningDate = screeningDate;
		this.name = name;
		this.theaterName = theaterName;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

}
