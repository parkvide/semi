package com.kh.app.admin.movie.vo;

public class PageVo {
	
	private int listCount;		// 총 게시글 갯수
	private int currentPage;	// 현재 페이지
	private int pageLimit;		// 페이징바 페이지 최대 갯수
	private int movieLimit;		// 한 페이지에 보여줄 게시글 갯수
	
	private int maxPage;		// 마지막 페이지
	private int startPage;		// 페이징바 시작
	private int endPage;		// 페이징바 마지막
	private int startNum;		// 조회할 ROWNUM 시작
	private int endNum;			// 조회할 ROWNUM 마지막

	
	public PageVo(int listCount , int currentPage, int pageLimit, int movieLimit) {

		this.listCount = listCount;
		this.currentPage = currentPage;
		this.pageLimit = pageLimit;
		this.movieLimit = movieLimit;
		
		this.maxPage = (int)Math.ceil((double)listCount / movieLimit);
		this.startPage = (currentPage-1) / pageLimit * pageLimit + 1;
		this.endPage = startPage + pageLimit - 1;
		if(endPage > maxPage) {
			endPage = maxPage;
		}
		this.startNum = (currentPage - 1) * movieLimit + 1;
		this.endNum = startNum + movieLimit - 1;
		
	}
	
	
	public int getListCount() {
		return listCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getPageLimit() {
		return pageLimit;
	}

	public int getBoardLimit() {
		return movieLimit;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public int getStartNum() {
		return startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	@Override
	public String toString() {
		return "PageVo [listCount=" + listCount + ", currentPage=" + currentPage + ", pageLimit=" + pageLimit
				+ ", movieLimit=" + movieLimit + ", maxPage=" + maxPage + ", startPage=" + startPage + ", endPage="
				+ endPage + ", startNum=" + startNum + ", endNum=" + endNum + "]";
	}

}