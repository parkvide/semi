<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/app/resources/css/service/service-rentInsert.css">
<%@ include file="/WEB-INF/views/layout/util.jsp" %>
</head>
<body>

  <%@ include file="/WEB-INF/views/layout/nav.jsp" %>
  <div class="thick-line"></div> <!-- 두꺼운 줄 -->
<div class="thin-line"></div> <!-- 얇은 줄 -->

<main>
  <div class="side"></div>
  <div id="main">
      <div id="top">
          <span>대관 문의</span>
          <div id="line"></div>
      </div>
      <div id="side-category">
              <div><a href="" class="ca">자주찾는질문</a></div>
              <div><a href="" class="ca">공지사항</a></div>
              <div><a href="" class="ca">대관문의</a></div>
              <div><a href="" class="ca">이벤트</a></div>
              <a id="ca" href="">
                  <img src="/app/resources/img/광고1.png" alt="">       
              </a>
      </div>
      <div id="main-list">
        <form action="/app/board/insert" method="post">
          <input style="width: 730px;" type="text" name="title" placeholder="제목">
          <br>
          <select name="category">
            <c:forEach var="cvo" items="${categoryVoList}">
                <option value="${cvo.no}">${cvo.name}</option>
            </c:forEach>
         </select>
          <br>
          <input type="date" name="rentalDate" placeholder="대관 날짜를 입력하세요">
          <br>
          <br>
          <textarea style="width: 730px; height: 382px;" name="content" placeholder="내용을 입력하세요"></textarea>
          <br>
          
          <br>
          <input type="submit" value="작성하기">
        </form>
      </div>
  <div class="side"></div>
</main>

	<%@ include file="/WEB-INF/views/layout/footer.jsp" %>

</body>
</html>