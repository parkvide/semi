package com.kh.app.movie.ticketing.vo;

public class TicketingVo {
	private String no;
	private String buyerNo;
	private String theaterNo;
	private String screenInfo;
	private String seat;
	private String headcount;
	private String reservationDate;
	private String price;
	public TicketingVo(String no, String buyerNo, String theaterNo, String screenInfo, String seat, String headcount,
			String reservationDate, String price) {
		super();
		this.no = no;
		this.buyerNo = buyerNo;
		this.theaterNo = theaterNo;
		this.screenInfo = screenInfo;
		this.seat = seat;
		this.headcount = headcount;
		this.reservationDate = reservationDate;
		this.price = price;
	}
	public TicketingVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getBuyerNo() {
		return buyerNo;
	}
	public void setBuyerNo(String buyerNo) {
		this.buyerNo = buyerNo;
	}
	public String getTheaterNo() {
		return theaterNo;
	}
	public void setTheaterNo(String theaterNo) {
		this.theaterNo = theaterNo;
	}
	public String getScreenInfo() {
		return screenInfo;
	}
	public void setScreenInfo(String screenInfo) {
		this.screenInfo = screenInfo;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getHeadcount() {
		return headcount;
	}
	public void setHeadcount(String headcount) {
		this.headcount = headcount;
	}
	public String getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ticketingVo [no=" + no + ", buyerNo=" + buyerNo + ", theaterNo=" + theaterNo + ", screenInfo="
				+ screenInfo + ", seat=" + seat + ", headcount=" + headcount + ", reservationDate=" + reservationDate
				+ ", price=" + price + "]";
	}
	
}
