<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-storeinsert.css">
    <script src="/app/resources/js/admin/admin-storeinsert.js"></script>
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>상품 등록</span>
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
          <div id="store">
            <form action="/app/admin/store/insert" method="post" enctype="multipart/form-data">
              <input type="text" name="category" placeholder="카테고리">
              <input type="text" name="name" placeholder="이름">
              <input type="text" name="price" placeholder="가격">
              <input type="text" name="origin" placeholder="원산지">
              <input type="file" name="nutrientne" placeholder="영양성분표">
              <input type="file" name="product" placeholder="상품사진">
              <input type="submit" value="등록하기">
            </form>
          </div>
          </div>
        </div>
      </div>

  </body>

  </html>