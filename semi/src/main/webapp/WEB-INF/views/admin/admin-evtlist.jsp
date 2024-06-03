<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-evtlist.css">
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>이벤트 목록</span>
          </div>
          <div id="line"></div>
          <div id="list-main">
            <div id="title">
              <div>번호</div>
              <div>작성자 이름</div>
              <div>제목</div>
              <div>날짜</div>
              <div>조회수</div>
              <div>수정하기</div>
              <div>삭제하기</div>
            </div>
            <div id="content">
              <c:forEach items="${adminEventvoList}" var="vo">
                <div>${vo.no}</div>
                <div>${vo.writerNo}</div>
                <div>${vo.title}</div>
                <div>${vo.uploadDate}</div>
                <div>${vo.views}</div>
                <div>
                  <form action="/app/admin/evt/edit" method="get">
                    <input type="hidden" name="no" value="${vo.no}">
                    <button type="submit">수정하기</button>
                  </form>
                </div>
                <div>
                  <form action="/app/admin/evt/delete" method="get">
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