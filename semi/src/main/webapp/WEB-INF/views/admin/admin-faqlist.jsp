<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-ticketing.css">
    <script src="/app/resources/js/admin/admin-ticketing.js"></script>
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>예매 리스트</span>
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
              <div class="id">작성자</div>
              <div class="name">제목</div>
              <div class="name">내용</div>
              <div class="name">조회수</div>
              <div class="name">날짜</div>
              <div>삭제</div>
              <div>수정</div>
            </div>
            <div id="content">
              <c:forEach items="${adminFaqvoList}" var="vo">
                <div id="contentlist">
	              <div class="no">${vo.no}</div>
	              <div class="id">${vo.writerNo}</div>
	              <div class="name">${vo.title}</div>
	              <div class="name">${vo.content}</div>
	              <div class="name">${vo.views}</div>
	              <div class="name">${vo.uploadDate}</div>
	              <button></button>
	              <button onclick="">수정하기</button>
                </div>
              </c:forEach>
            </div>
          </div>
        </div>
      </div>

  </body>

  </html>