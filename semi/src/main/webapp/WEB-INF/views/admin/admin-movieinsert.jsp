<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-movieinset.css">
    <script src="/app/resources/js/admin/admin-movieinset.js"></script>
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>영화 등록</span>
          </div>
          <div id="line"></div>
          <div>
            <form action="/app/admin/movie/insert" method="post" enctype="multipart/form-data">
              <input type="text" name="type" placeholder="장르">
              <input type="text" name="age" placeholder="관람연령가">
              <input type="text" name="summary" placeholder="내용" >
              <input type="text" name="cast" placeholder="출연배우">
              <input type="text" name="director" placeholder="감독">
              <input type="text" name="time" placeholder="상영시간">
              <input type="file" name="poster" >
              <input type="submit" value="등록하기">
            </form>
          </div>
          
        </div>
      </div>

  </body>

  </html>