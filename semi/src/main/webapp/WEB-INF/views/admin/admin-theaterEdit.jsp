<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-theaterEdit.css">
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>상영관 수정</span>
          </div>
          <div id="line"></div>
          <div id="title">
            <form action="/app/admin/theater/edit" method="post">
              <input type="hidden"  name="no" value="${adminTheaterList.no}">
              <input type="text" name="type" placeholder="${adminTheaterList.type}">
              <input type="submit" value="수정하기">
            </form>
          </div>
          
        </div>
      </div>

  </body>

  </html>