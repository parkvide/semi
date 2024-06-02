<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/app/resources/css/admin/admin-movieList.css">
</head>
<body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>

            
            <div id="list">
                <div id="name">
                    <span>영화목록</span>
                </div>
                <div id="line"></div>
                <div id="list-main">
		            <div id="title">
		              <div>번호</div>
		              <div>장르</div>
		              <div>관람연령</div>
		              <div>내용</div>
		              <div>출연배우</div>
		              <div>감독</div>
		              <div>상영시간</div>
					  <div>수정하기</div>
					  <div>삭제하기</div>
		            </div>
		            <div id="content">
		              <c:forEach items="${adminMovieVoList}" var="vo">
		                <div>${vo.no}</div>
		                <div>${vo.type}</div>
		                <div>${vo.movieAge}</div>
		                <div>${vo.summary}</div>
		                <div>${vo.cast}</div>
		                <div>${vo.director}</div>
		                <div>${vo.runningTime}</div>
						<div>
							<form action="/app/admin/movie/edit" method="get">
								<input type="hidden" name="no" value="${vo.no}">
								<button type="submit">수정하기</button>
							</form>
						</div>
						<div>
							<form action="/app/admin/movie/delete" method="get">
							  <input type="hidden" name="no" value="${vo.no}">
							  <button type="submit">삭제하기</button>
							</form>
						  </div>
		              </c:forEach>
		            </div>
                </div>
            </div>
         </div>


         
</body>
</html>