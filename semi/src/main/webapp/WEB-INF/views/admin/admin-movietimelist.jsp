<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-movietimelist.css">
    <script src="/app/resources/js/admin/admin-movietimelist.js"></script>
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>

        <div id="list">
          <div id="name">
            <span>상영시간 목록</span>
          </div>
          <div id="line"></div>
          <div id="list-main">
            <div id="title">
              <div>번호</div>
              <div>영화</div>
              <div>관</div>
              <div>상영시간</div>
              <div>수정하기</div>
            </div>
            <div id="content">
              <c:forEach items="${AdminMovieTimevoList}" var="vo">
               <div>${vo.no}</div>
               <div>${vo.name}</div>
               <div>${vo.theaterName}</div>
               <div>${vo.screeningDate}</div>
               <div>
                <form action="/app/admin/movie/time/edit" method="get">
                  <input type="hidden" name="no" value="${vo.no}">
                  <button type="submit">수정하기</button>
                </form>
                </div>
              </c:forEach>
            </div>
          </div>
        </div>
      </div>

  </body>

  </html>