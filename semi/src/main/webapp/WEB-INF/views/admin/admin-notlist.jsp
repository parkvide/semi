<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
                <div>수정하기</div>
                <div>삭제하기</div>
	            </div>
	            <div id="content">
	              <c:forEach items="${adminNoticevoList}" var="vo">
	                <div>${vo.no}</div>
	                <div>${vo.writerNo}</div>
	                <div>${vo.title}</div>
	                <div>${fn:substring(vo.content, 0, 15)}</div>
	                <div>${vo.views}</div>
	                <div>${vo.uploadDate}</div>
                  <div>
                    <form action="/app/admin/notice/edit" method="get">
                      <input type="hidden" name="no" value="${vo.no}">
                      <button type="submit">수정하기</button>
                    </form>
                  </div>
                  <div>
                    <form action="/app/admin/notice/delete" method="get">
                      <input type="hidden" name="no" value="${vo.no}">
                      <button type="submit">삭제하기</button>
                    </form>
                  </div>
	              </c:forEach>
		         </div>
          </div>
        </div>
      </div>

  </body>

  </html>