<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-cinemalist.css">
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
			<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>

        <div id="list">
          <div id="name">
            <span>영화관 목록</span>
          </div>
          <div id="line"></div>
          <div id="list-main">
            <div id="title">
              <div>번호</div>
              <div>상영관 이름</div>
              <div>주소</div>
              <div>전화번호</div>
              <div>지역</div>
              <div>수정하기</div>
            </div>
            <div id="content">
              <c:forEach items="${adminCinemavoList}" var="vo">
                <div>${vo.no}</div>
                <div>${vo.cinemaName}</div>
                <div>${vo.cinemaAddress}</div>
                <div>${vo.cinemaTel}</div>
                <div>${vo.cinemaLocation}</div>
                <div>
                  <form action="/app/admin/cinema/edit" method="get">
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