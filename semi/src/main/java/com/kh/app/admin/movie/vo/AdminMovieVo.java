package com.kh.app.admin.movie.vo;

public class AdminMovieVo {
	
	private String no;
	private String type;
	private String movieAge;
	private String summary;
	private String cast;
	private String director;
	private String runningTime;
	private String delYn;
	private String poster;
	
	@Override
	public String toString() {
		return "AdminMovieVo [no=" + no + ", type=" + type + ", movieAge=" + movieAge + ", summary=" + summary
				+ ", cast=" + cast + ", director=" + director + ", runningTime=" + runningTime + ", delYn=" + delYn
				+ ", poster=" + poster + "]";
	}
	public AdminMovieVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminMovieVo(String no, String type, String movieAge, String summary, String cast, String director,
			String runningTime, String delYn, String poster) {
		super();
		this.no = no;
		this.type = type;
		this.movieAge = movieAge;
		this.summary = summary;
		this.cast = cast;
		this.director = director;
		this.runningTime = runningTime;
		this.delYn = delYn;
		this.poster = poster;
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
	public String getMovieAge() {
		return movieAge;
	}
	public void setMovieAge(String movieAge) {
		this.movieAge = movieAge;
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

}
