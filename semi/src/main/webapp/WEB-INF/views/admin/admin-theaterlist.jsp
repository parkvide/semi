<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-theaterlist.css">
    <script src="/app/resources/js/admin/admin-theaterlist.js"></script>
  </head>

  <body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


        <div id="list">
          <div id="name">
            <span>극장 목록</span>
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
          	<div>번호</div>
          	<div>관 이름</div>
          	<div>가격</div>
       	 </div>
          <div id="content">
          	<c:forEach items="${admintheaterVoList}" var="vo">
            	<div>${vo.no}</div>
            	<div>${vo.type}</div>
            	<div>${vo.price}</div>
		     </c:forEach>
		  </div>
          </div>
        </div>
     </div>

  </body>

  </html>