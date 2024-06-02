<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-memberList.css">
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>회원목록</span>
          </div>
          <div id="line"></div>
          <div id="list-main">
            <div id="title">
              <div>번호</div>
              <div>아이디</div>
              <div>이름</div>
              <div>연락처</div>
              <div>이메일</div>
              <div>생년월일</div>
              <div>가입날짜</div>
              <div>상태</div>
              <div>탈퇴날짜</div>
            </div>
            <div id="content">
              <c:forEach items="${adminMemberVo}" var="vo">
                  <div>${vo.no}</div>
                  <div>${vo.id}</div>
                  <div>${vo.name}</div>
                  <div>${vo.phone}</div>
                  <div>${vo.email}</div>
                  <div>${vo.birth}</div>
                  <div>${vo.enrollDate}</div>
                  <div>${vo.quitYn}</div>
                  <div>${vo.modifyDate}</div>
              </c:forEach>
            </div>
          </div>
        </div>
      </div>

  </body>

  </html>