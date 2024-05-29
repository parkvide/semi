<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/app/resources/css/admin/admin-movielist.css">
<script src="/app/resources/js/admin/admin-movielist.js"></script>
</head>
<body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>

            
            <div id="list">
                <div id="name">
                    <span>영화목록</span>
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
		              <div>장르</div>
		              <div>관람연령</div>
		              <div>내용</div>
		              <div>감독</div>
		              <div>상영시간</div>
		            </div>
		            <div id="content">
		              <c:forEach items="${adminMovievoList}" var="vo">
		                <div>${vo.no}</div>
		                <div>${vo.type}</div>
		                <div>${vo.movieAge}</div>
		                <div>${vo.summary}</div>
		                <div>${vo.cast}</div>
		                <div>${vo.director}</div>
		                <div>${vo.runningTime}</div>
		              </c:forEach>
		            </div>
                </div>
            </div>
         </div>


         
</body>
</html>