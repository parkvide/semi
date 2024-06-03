<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-movieEdit.css">
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>영화 수정</span>
          </div>
          <div id="line"></div>
          <div id="title">
            <form action="/app/admin/movie/edit" method="post">
              <div><input type="hidden" name="no" value="${adminMovieList.no}"></div>
              <div><span>제목</span><input type="text" value="${adminMovieList.title}"></div>
              <div><span>내용</span><textarea name="summary" placeholder="${adminMovieList.summary}"></textarea></div>
              <div><span>나이</span><input type="text" value="${adminMovieList.age}"></div>
              <div><span>장르</span><input type="text" value="${adminMovieList.type}"></div>
              <div><span>배우</span><input type="text" value="${adminMovieList.cast}"></div>
              <div><span>감독</span><input type="text" value="${adminMovieList.director}"></div>
              <div><span>상영시간</span><input type="text" value="${adminMovieList.runningTime}"></div>
              <div><span>개봉일</span><input type="text" value="${adminMovieList.releaseDate}"></div>
              <input type="submit" value="수정하기">
            </form>
          </div>
          
        </div>
      </div>

  </body>

  </html>