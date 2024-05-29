package com.kh.app.board.vo;

public class RentVo {

    private String no;
    private String writerNo;
    private String writerId;
    private String cinemaName;
    private String cinemaNo;
    private String type;
    private String theaterName;
    private String adminId;
    private String title;
    private String content;
    private String rentalDate;
    private String uploadDate;
    private String delYn;  // 추가된 필드
	public RentVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RentVo(String no, String writerNo, String writerId, String cinemaName, String cinemaNo, String type,
			String theaterName, String adminId, String title, String content, String rentalDate, String uploadDate,
			String delYn) {
		super();
		this.no = no;
		this.writerNo = writerNo;
		this.writerId = writerId;
		this.cinemaName = cinemaName;
		this.cinemaNo = cinemaNo;
		this.type = type;
		this.theaterName = theaterName;
		this.adminId = adminId;
		this.title = title;
		this.content = content;
		this.rentalDate = rentalDate;
		this.uploadDate = uploadDate;
		this.delYn = delYn;
	}
	@Override
	public String toString() {
		return "RentVo [no=" + no + ", writerNo=" + writerNo + ", writerId=" + writerId + ", cinemaName=" + cinemaName
				+ ", cinemaNo=" + cinemaNo + ", type=" + type + ", theaterName=" + theaterName + ", adminId=" + adminId
				+ ", title=" + title + ", content=" + content + ", rentalDate=" + rentalDate + ", uploadDate="
				+ uploadDate + ", delYn=" + delYn + "]";
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
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public String getCinemaNo() {
		return cinemaNo;
	}
	public void setCinemaNo(String cinemaNo) {
		this.cinemaNo = cinemaNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
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
	
    
	
}
