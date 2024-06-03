<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin.css">
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
			<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>

          

        <div id="list">
          <div id="name">
            <span>홈 화면</span>
          </div>
          <div id="line"></div>
          <div id="list-main">
            <div id="title">
              <div><a href="/app/admin/member/list"><img src="/app/resources/img/adminHome.png" alt=""></a></div>
              <div><a href="/app/admin/movie/list"><img src="/app/resources/img/adminHome2.png" alt=""></a></div>
              <div><a href="/app/admin/notice/list"><img src="/app/resources/img/adminHome3.png" alt=""></a></div>
              <div><a href="/app/admin/store/list"><img src="/app/resources/img/adminHome4.png" alt=""></a></div>
            </div>
          </div>
        </div>
      </div>

  </body>

  </html>