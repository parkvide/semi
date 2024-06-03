<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-faqEdit.css">
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>자주묻는질문 수정</span>
          </div>
          <div id="line"></div>
          <div id="title">
            <form action="/app/admin/faq/edit" method="post">
              <input type="hidden" name="no" value="${adminFaqList.no}">
              <input type="text" name="title" placeholder="${adminFaqList.title}">
              <input type="text" value="${adminFaqList.content}">
              <input type="submit" value="수정하기">
            </form>
          </div>
          
        </div>
      </div>

  </body>

  </html>