package com.kh.app.admin.notice.vo;

public class AdminNoticeVo {
	
	private String no;
	private String writerNo;
	private String title;
	private String content;
	private String uploadDate;
	private String views;
	private String delYn;
	
	public AdminNoticeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdminNoticeVo [no=" + no + ", writerNo=" + writerNo + ", title=" + title + ", content=" + content
				+ ", uploadDate=" + uploadDate + ", views=" + views + ", delYn=" + delYn + "]";
	}
	public AdminNoticeVo(String no, String writerNo, String title, String content, String uploadDate, String views,
			String delYn) {
		super();
		this.no = no;
		this.writerNo = writerNo;
		this.title = title;
		this.content = content;
		this.uploadDate = uploadDate;
		this.views = views;
		this.delYn = delYn;
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
	public String getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getViews() {
		return views;
	}
	public void setViews(String views) {
		this.views = views;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

}
