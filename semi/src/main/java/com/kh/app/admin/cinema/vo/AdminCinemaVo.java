package com.kh.app.admin.cinema.vo;

public class AdminCinemaVo {
	
	private String no;
	private String cinemaName;
	private String cinemaAddress;
	private String cinemaTel;
	private String delYn;
	private String cinemaImg;
	private String cinemaLocation;
	private String cinemaContent;
	public AdminCinemaVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdminCinemaVo [no=" + no + ", cinemaName=" + cinemaName + ", cinemaAddress=" + cinemaAddress
				+ ", cinemaTel=" + cinemaTel + ", delYn=" + delYn + ", cinemaImg=" + cinemaImg + ", cinemaLocation="
				+ cinemaLocation + ", cinemaContent=" + cinemaContent + "]";
	}
	public AdminCinemaVo(String no, String cinemaName, String cinemaAddress, String cinemaTel, String delYn,
			String cinemaImg, String cinemaLocation, String cinemaContent) {
		super();
		this.no = no;
		this.cinemaName = cinemaName;
		this.cinemaAddress = cinemaAddress;
		this.cinemaTel = cinemaTel;
		this.delYn = delYn;
		this.cinemaImg = cinemaImg;
		this.cinemaLocation = cinemaLocation;
		this.cinemaContent = cinemaContent;
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
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
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
	}