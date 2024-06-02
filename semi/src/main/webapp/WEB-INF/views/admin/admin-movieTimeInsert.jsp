<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-movietime.css">
    <script src="/app/resources/js/admin/admin-movietime.js"></script>
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>상영시간 등록</span>
          </div>
          <div id="line"></div>
          <div id="list-main">
            <form action="/app/admin/movie/time/insert" method="post">
              <input type="text" value="영화이름"> 
              <input type="text" value="관 이름">
              <input type="datetime" value="상영시간">
              <input type="submit" value="등록하기">
            </form>
          </div>
        </div>
      </div>

  </body>

  </html>