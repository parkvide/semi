<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-member.css">
    <script src="/app/resources/js/admin/admin-member.js"></script>
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>회원목록</span>
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
            <div id="title">
              <div class="no">번호</div>
              <div class="id">아이디</div>
              <div class="name">이름</div>
              <div class="num">연락처</div>
              <div class="email">이메일</div>
              <div class="birth">생년월일</div>
              <div class="date">가입날짜</div>
              <div class="ny">상태</div>
              <div class="modify">탈퇴날짜</div>
            </div>
            <div id="content">
              <c:forEach items="${voList}" var="vo">
                <div id="contentlist">
                  <div class="no">번호 자바코드임</div>
                  <div class="id">아이디 자바코드임</div>
                  <div class="name">이름 자바코드임</div>
                  <div class="num">연락처 자바코드임</div>
                  <div class="email">이메일 자바코드임</div>
                  <div class="birth">생년월일 자바코드임</div>
                  <div class="date">가입날짜 자바코드임</div>
                  <div class="ny">상태 자바코드임</div>
                  <div class="modify">탈퇴날짜 자바코드임</div>
                </div>
              </c:forEach>
            </div>
          </div>
        </div>
      </div>

  </body>

  </html>