package com.kh.app.cinema.vo;

public class CinemaVo {
	
	 private String no;
	 private String cinemaName;
	 private String cinemaAddress;
	 private String cinemaTel;
	 private String cinemaImg;
	 private String cinemaLocation;
	 private String cinemaContent;
	 private String delYn;
	public CinemaVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CinemaVo(String no, String cinemaName, String cinemaAddress, String cinemaTel, String cinemaImg,
			String cinemaLocation, String cinemaContent, String delYn) {
		super();
		this.no = no;
		this.cinemaName = cinemaName;
		this.cinemaAddress = cinemaAddress;
		this.cinemaTel = cinemaTel;
		this.cinemaImg = cinemaImg;
		this.cinemaLocation = cinemaLocation;
		this.cinemaContent = cinemaContent;
		this.delYn = delYn;
	}
	@Override
	public String toString() {
		return "CinemaVo [no=" + no + ", cinemaName=" + cinemaName + ", cinemaAddress=" + cinemaAddress + ", cinemaTel="
				+ cinemaTel + ", cinemaImg=" + cinemaImg + ", cinemaLocation=" + cinemaLocation + ", cinemaContent="
				+ cinemaContent + ", delYn=" + delYn + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public String getCinemaAddress() {
		return cinemaAddress;
	}
	public void setCinemaAddress(String cinemaAddress) {
		this.cinemaAddress = cinemaAddress;
	}
	public String getCinemaTel() {
		return cinemaTel;
	}
	public void setCinemaTel(String cinemaTel) {
		this.cinemaTel = cinemaTel;
	}
	public String getCinemaImg() {
		return cinemaImg;
	}
	public void setCinemaImg(String cinemaImg) {
		this.cinemaImg = cinemaImg;
	}
	public String getCinemaLocation() {
		return cinemaLocation;
	}
	public void setCinemaLocation(String cinemaLocation) {
		this.cinemaLocation = cinemaLocation;
	}
	public String getCinemaContent() {
		return cinemaContent;
	}
	public void setCinemaContent(String cinemaContent) {
		this.cinemaContent = cinemaContent;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	
	
	 
}
