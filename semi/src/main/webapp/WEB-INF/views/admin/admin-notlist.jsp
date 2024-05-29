<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-notlist.css">
    <script src="/app/resources/js/admin/admin-notlist.js"></script>
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>공지사항 목록</span>
            <form action="">
              <input type="text" placeholder="검색">
              <select id="category">
                <option>닉네임</option>
                <option>아이디</option>
              </select>
              <button type="submit">🔍</button>
            </form>
          </div>
          <div id="line"></div>
          <div id="list-main">
              <div id="list-main">
	            <div id="title">
	              <div>번호</div>
	              <div>작성자</div>
	              <div>제목</div>
	              <div>내용</div>
	              <div>조회수</div>
	              <div>날짜</div>
	            </div>
	            <div id="content">
	              <c:forEach items="${adminNoticevoList}" var="vo">
	                <div>${vo.no}</div>
	                <div>${vo.writerNo}</div>
	                <div>${vo.title}</div>
	                <div>${vo.content}</div>
	                <div>${vo.views}</div>
	                <div>${vo.uploadDate}</div>
	              </c:forEach>
		         </div>
          </div>
        </div>
      </div>

  </body>

  </html>