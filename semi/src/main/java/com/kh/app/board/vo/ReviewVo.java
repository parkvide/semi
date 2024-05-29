package com.kh.app.board.vo;

public class ReviewVo {
	private String no;
	private String ticketingNo;
	private String movieNo;
	private String id;
	private String content;
	private String starRating;
	private String enrollDate;
	private String modifyDate;
	private String delYn;
	public ReviewVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReviewVo(String no, String ticketingNo, String movieNo, String id, String content, String starRating,
			String enrollDate, String modifyDate, String delYn) {
		super();
		this.no = no;
		this.ticketingNo = ticketingNo;
		this.movieNo = movieNo;
		this.id = id;
		this.content = content;
		this.starRating = starRating;
		this.enrollDate = enrollDate;
		this.modifyDate = modifyDate;
		this.delYn = delYn;
	}
	@Override
	public String toString() {
		return "ReviewVo [no=" + no + ", ticketingNo=" + ticketingNo + ", movieNo=" + movieNo + ", id=" + id
				+ ", content=" + content + ", starRating=" + starRating + ", enrollDate=" + enrollDate + ", modifyDate="
				+ modifyDate + ", delYn=" + delYn + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTicketingNo() {
		return ticketingNo;
	}
	public void setTicketingNo(String ticketingNo) {
		this.ticketingNo = ticketingNo;
	}
	public String getMovieNo() {
		return movieNo;
	}
	public void setMovieNo(String movieNo) {
		this.movieNo = movieNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStarRating() {
		return starRating;
	}
	public void setStarRating(String starRating) {
		this.starRating = starRating;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	
	
	
}
