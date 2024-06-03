package com.kh.app.admin.movie.vo;

public class AdminMovieVo {
	
	private String no;
	private String type;
	private String age;
	private String title;
	private String summary;
	private String cast;
	private String director;
	private String runningTime;
	private String delYn;
	private String poster;
	private String releaseDate;
	public AdminMovieVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdminMovieVo [no=" + no + ", type=" + type + ", age=" + age + ", title=" + title + ", summary="
				+ summary + ", cast=" + cast + ", director=" + director + ", runningTime=" + runningTime + ", delYn="
				+ delYn + ", poster=" + poster + ", releaseDate=" + releaseDate + "]";
	}
	public AdminMovieVo(String no, String type, String age, String title, String summary, String cast, String director,
			String runningTime, String delYn, String poster, String releaseDate) {
		super();
		this.no = no;
		this.type = type;
		this.age = age;
		this.title = title;
		this.summary = summary;
		this.cast = cast;
		this.director = director;
		this.runningTime = runningTime;
		this.delYn = delYn;
		this.poster = poster;
		this.releaseDate = releaseDate;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

}
