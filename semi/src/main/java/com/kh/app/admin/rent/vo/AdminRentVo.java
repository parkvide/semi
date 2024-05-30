package com.kh.app.admin.rent.vo;

public class AdminRentVo {
	
	private String no;
	private String writerNo;
	private String cinemaNo;
	private String managerNo;
	private String title;
	private String content;
	private String rentalDate;
	private String uploadDate;
	private String delYn;
	private String answerTitle;
	private String answerContent;
	public AdminRentVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdminRentVo [no=" + no + ", writerNo=" + writerNo + ", cinemaNo=" + cinemaNo + ", managerNo="
				+ managerNo + ", title=" + title + ", content=" + content + ", rentalDate=" + rentalDate
				+ ", uploadDate=" + uploadDate + ", delYn=" + delYn + ", answerTitle=" + answerTitle
				+ ", answerContent=" + answerContent + "]";
	}
	public AdminRentVo(String no, String writerNo, String cinemaNo, String managerNo, String title, String content,
			String rentalDate, String uploadDate, String delYn, String answerTitle, String answerContent) {
		super();
		this.no = no;
		this.writerNo = writerNo;
		this.cinemaNo = cinemaNo;
		this.managerNo = managerNo;
		this.title = title;
		this.content = content;
		this.rentalDate = rentalDate;
		this.uploadDate = uploadDate;
		this.delYn = delYn;
		this.answerTitle = answerTitle;
		this.answerContent = answerContent;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getWriterNo() {
		return writerNo;
	}
	public void setWriterNo(String writerNo) {
		this.writerNo = writerNo;
	}
	public String getCinemaNo() {
		return cinemaNo;
	}
	public void setCinemaNo(String cinemaNo) {
		this.cinemaNo = cinemaNo;
	}
	public String getManagerNo() {
		return managerNo;
	}
	public void setManagerNo(String managerNo) {
		this.managerNo = managerNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRentalDate() {
		return rentalDate;
	}
	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}
	public String getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	public String getAnswerTitle() {
		return answerTitle;
	}
	public void setAnswerTitle(String answerTitle) {
		this.answerTitle = answerTitle;
	}
	public String getAnswerContent() {
		return answerContent;
	}
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	


}
