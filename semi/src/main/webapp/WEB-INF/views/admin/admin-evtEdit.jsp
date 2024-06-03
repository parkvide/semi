<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-evtEdit.css">
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>이벤트 수정</span>
          </div>
          <div id="line"></div>
          <div id="title">
            <form action="/app/admin/evt/edit" method="post">
              <input type="hidden" name="no" value="${adminEvtList.no}">
              <input type="text" name="title" placeholder="${adminEvtList.title}">
              <input type="text" value="${adminEvtList.contentImg}">
              <input type="text" value="${adminEvtList.uploadDate}">
              <input type="submit" value="수정하기">
            </form>
          </div>
          
        </div>
      </div>

  </body>

  </html>