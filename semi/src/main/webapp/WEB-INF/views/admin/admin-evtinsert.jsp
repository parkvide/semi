<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-evtinsert.css">
    <script src="/app/resources/js/admin/admin-evtinsert.js"></script>
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
			<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>이벤트 등록</span>
          </div>
          <div id="line"></div>
          <div id="list-main">
            <div>
              <form action="/app/admin/movie/insert" method="post" enctype="multipart/form-data">
                <input type="text" name="type" placeholder="작성자">
                <input type="text" name="age" placeholder="제목">
                <input type="file" name="img" >
                <input type="submit" value="등록하기">
              </form>
            </div>
          </div>
        </div>
      </div>

  </body>

  </html>