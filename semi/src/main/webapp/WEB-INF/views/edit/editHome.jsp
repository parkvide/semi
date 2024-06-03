<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>개인정보 변경</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
    integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
    crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="/app/resources/css/member/edit.css">
  <script defer src="/app/resources/js/service/service.js"></script>
  <%@ include file="/WEB-INF/views/layout/util.jsp"%>
</head>

<body>
  <%@ include file="/WEB-INF/views/layout/nav.jsp"%>

  <div class="thick-line"></div> <!-- 두꺼운 줄 -->
  <div class="thin-line"></div> <!-- 얇은 줄 -->

  <div class="container">
    <div class="edit">
      <img style="height:100px " class="search-logo" src="/app/resources/img/user.png" alt="">

      <form action="/app/member/editHome" method="post">
        <input type="text" name="id" value="${sessionScope.id}" readonly>
        <input type="password" name="pwd" placeholder="변경할 비밀번호"><br>
        <input type="password" name="pwd2" placeholder="비밀번호 확인">
        <input type="text" name="email" value="${sessionScope.email}" readonly>
        <input type="text" name="phone" value="${sessionScope.phone}" readonly>
        <input type="submit" value="변경하기">
      </form>
    </div>
  </div>

  <%@ include file="/WEB-INF/views/layout/footer.jsp"%>

</body>

</html>