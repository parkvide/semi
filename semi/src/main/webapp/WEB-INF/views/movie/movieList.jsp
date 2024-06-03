<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
      integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
      crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="/app/resources/css/movie/movieList.css">
    <!-- <script defer src="/app/resources/js/home.js"></script> -->
    <!-- <script  src="/app/resources/js/store.js"></script> -->

<%@ include file="/WEB-INF/views/layout/util.jsp" %>
  </head>

  <body>
   
   <%@ include file="/WEB-INF/views/layout/nav.jsp" %>
   
    <main>
<%@ include file="/WEB-INF/views/layout/video.jsp" %>

    </main>
    
    <div class="movie-list">
      <div class="prd-title">
        <span class="popcorn">무비차트</span>
      </div>
      <div class="sep2"></div>
      <ul class="list-style">
	      <c:forEach items="${movieListVo}" var="vo">
	        <li>
	          <a href="/app/movie/detail?no=${vo.no}">
	            <span><img height="220" width="220" src="${vo.poster}" alt=""></span>
	            <span style="font-weight: bolder;" class="list-title">${vo.title}</span>
	            <span class="list-name">${vo.director} 감독</span>
	            <span class="list-name">${vo.releaseDate} 개봉</span>
	          </a>
	        </li>
	      </c:forEach>
      </ul>
    </div>
    
    <div class="sep2"></div>

<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
   
  </body>

  </html>