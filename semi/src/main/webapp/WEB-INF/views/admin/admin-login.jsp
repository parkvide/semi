<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="/app/resources/css/admin/admin-login.css">
  <title>Document</title>
</head>
<body>
  
  <div id="main">
    <h1>ADMIN LOGIN</h1>
    <form action="/app/admin/login" method="post">
      <span>아이디</span>
      <input type="text" name="id" placeholder="아이디를 입력하세요" class="login">
      <br>
      <span>비밀번호</span>
      <input type="password" name="pwd" placeholder="비밀번호를 입력하세요" class="login">
      <br>
      <input type="submit" value="로그인" id="btn">
    </form>

</body>
</html>