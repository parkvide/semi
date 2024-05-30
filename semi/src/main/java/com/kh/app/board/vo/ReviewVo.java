package com.kh.app.board.vo;

public class ReviewVo {
	private String no;
	private String ticketingNo;
	private String movieNo;
	private String writerNo;
	private String id;
	private String content;
	private String delYn;
	public ReviewVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReviewVo(String no, String ticketingNo, String movieNo, String writerNo, String id, String content,
			String delYn) {
		super();
		this.no = no;
		this.ticketingNo = ticketingNo;
		this.movieNo = movieNo;
		this.writerNo = writerNo;
		this.id = id;
		this.content = content;
		this.delYn = delYn;
	}
	@Override
	public String toString() {
		return "ReviewVo [no=" + no + ", ticketingNo=" + ticketingNo + ", movieNo=" + movieNo + ", writerNo=" + writerNo
				+ ", id=" + id + ", content=" + content + ", delYn=" + delYn + "]";
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
	public String getWriterNo() {
		return writerNo;
	}
	public void setWriterNo(String writerNo) {
		this.writerNo = writerNo;
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
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	
	
}
