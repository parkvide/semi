package com.kh.app.admin.movie.vo;

public class AdminMovieVo {
	
	private String no;
	private String type;
	private String movie_age;
	private String summary;
	private String cast;
	private String director;
	private String running_time;
	private String del_yn;
	private String poster;
	
	public AdminMovieVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdminMovieVo [no=" + no + ", type=" + type + ", movie_age=" + movie_age + ", summary=" + summary
				+ ", cast=" + cast + ", director=" + director + ", running_time=" + running_time + ", del_yn=" + del_yn
				+ ", poster=" + poster + "]";
	}
	public AdminMovieVo(String no, String type, String movie_age, String summary, String cast, String director,
			String running_time, String del_yn, String poster) {
		super();
		this.no = no;
		this.type = type;
		this.movie_age = movie_age;
		this.summary = summary;
		this.cast = cast;
		this.director = director;
		this.running_time = running_time;
		this.del_yn = del_yn;
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
	public String getMovie_age() {
		return movie_age;
	}
	public void setMovie_age(String movie_age) {
		this.movie_age = movie_age;
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
	public String getRunning_time() {
		return running_time;
	}
	public void setRunning_time(String running_time) {
		this.running_time = running_time;
	}
	public String getDel_yn() {
		return del_yn;
	}
	public void setDel_yn(String del_yn) {
		this.del_yn = del_yn;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}

}
