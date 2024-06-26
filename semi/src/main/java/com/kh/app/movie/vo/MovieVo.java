package com.kh.app.movie.vo;

public class MovieVo {
	
	private String no;
	private String title;
	private String type;
	private String movieAge;
	private String summary;
	private String cast;
	private String director;
	private String runningTime;
	private String delYn;
	private String poster;
	private String releaseDate;
	public MovieVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieVo(String no, String title, String type, String movieAge, String summary, String cast, String director,
			String runningTime, String delYn, String poster, String releaseDate) {
		super();
		this.no = no;
		this.title = title;
		this.type = type;
		this.movieAge = movieAge;
		this.summary = summary;
		this.cast = cast;
		this.director = director;
		this.runningTime = runningTime;
		this.delYn = delYn;
		this.poster = poster;
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return "MovieVo [no=" + no + ", title=" + title + ", type=" + type + ", movieAge=" + movieAge + ", summary="
				+ summary + ", cast=" + cast + ", director=" + director + ", runningTime=" + runningTime + ", delYn="
				+ delYn + ", poster=" + poster + ", releaseDate=" + releaseDate + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	
}
