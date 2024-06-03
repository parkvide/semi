<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
      integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
      crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="/app/resources/css/movie/movieDetail.css">
    <!-- <script src="/app/resources/js/detail/detail.js"></script> -->
    <script src="
    https://cdn.jsdelivr.net/npm/@splidejs/splide@4.1.4/dist/js/splide.min.js
    "></script>
    <link href="
    https://cdn.jsdelivr.net/npm/@splidejs/splide@4.1.4/dist/css/splide.min.css
    " rel="stylesheet">
    <script defer>
      document.addEventListener('DOMContentLoaded', function () {
        new Splide('#image-carousel', {
          perPage: 3,
          perMove: 1,
        }).mount();
      });
    </script>
	
	<script src="/app/resources/js/review/review.js"></script>
	
	
    <style>
      .splide__slide img {
        width: 200;
        height: 200;
      }
    </style>
    
    <%@ include file="/WEB-INF/views/layout/util.jsp" %>
  </head>

  <body>
    <%@ include file="/WEB-INF/views/layout/nav.jsp" %>

    <main>
      <div class="left"></div>
      <div class="prd-img">
        <img width="500" height="500" src="${vo.poster}" alt="">
      </div>
      <div class="detail">
        <p class="movie-title">
          <span>${vo.title}<button class="disabled-button" disabled>현재상영중</button></span>
        </p>
        <div>
          <span>예매율 95%</span>
          <div class="sep1"></div>
        </div>
        <div class="movie-detail">
          <div class="cast">
            <span>감독 : ${vo.director} | 출연진 : ${vo.cast}</span>
          </div>
          <div class="genre">
            <span>장르 : ${vo.type} | 러닝타임 : ${vo.runningTime}</span>
          </div>
          <div class="release">
            <span>${vo.releaseDate}</span>
          </div>
          <div class="sep2"></div>
        </div>

        <button onclick="">예매하기</button>
      </div>
      <div class="right"></div>
      <div class="synopsis">
        <h2>줄거리</h2>
        <div class="sep2"></div>
        <br>
        <p>
            ${vo.summary}
        </p>
        
    </div>

    </main>

<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
    
  </body>

  </html>