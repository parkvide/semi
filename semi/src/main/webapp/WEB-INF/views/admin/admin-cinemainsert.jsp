<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-cinemainsert.css">
    <script src="/app/resources/js/admin/admin-cinameinsert.js"></script>
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>영화관 등록</span>
          </div>
          <div id="line"></div>
          <div id="list-main">
            <div>
              <form action="/app/admin/cinema/insert" method="post" enctype="multipart/form-data">
                <input type="text" name="name" placeholder="영화지점 이름">
                <input type="text" name="location" placeholder="지역"> 
                <input type="text" name="address" placeholder="주소">
                <input type="text" name="tel" placeholder="전화번호">
                <input type="text" name="content"  placeholder="상세글">
                <input type="file" name="img" >
                <input type="submit" value="등록하기">
              </form>
            </div>
          </div>
        </div>
      </div>

  </body>

  </html>