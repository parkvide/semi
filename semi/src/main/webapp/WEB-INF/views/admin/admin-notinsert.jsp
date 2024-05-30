<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-notinsert.css">
    <script src="/app/resources/js/admin/admin-notinsert.js"></script>
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>공지사항 등록</span>
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
            <div id="theater">
              <form action="/app/admin/not/insert" method="post" enctype="multipart/form-data">
                <input type="text" name="writerNo" placeholder="작성자">
                <input type="text" name="title" placeholder="제목">
                <input type="text" name="content" placeholder="내용">
              </form>
          </div>
        </div>
      </div>

  </body>

  </html>