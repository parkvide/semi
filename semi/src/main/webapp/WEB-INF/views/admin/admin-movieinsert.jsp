<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-movieinset.css">
    <script src="/app/resources/js/admin/admin-movieinset.js"></script>
  </head>

  <body>

    <div id="view">
      <div id="side-bar">
        <ul>
          <li id="side-menu"><img src="/app/resources/img/logo.png" alt=""></li>
          <li class="side-menu"><a href="/app/admin/home">관리자 메인</a></li>
          <li class="side-menu"><a href="/app/admin/member">회원 목록</a></li>
          <li class="side-menu"><a href="/app/admin/ticketing">예매 리스트</a></li>
          <li class="side-menu"><a href="/app/admin/lent">대관문의</a></li>
          <li class="side-menu side-menu-movies">영화</li>

          <div class="menu-lists hidden">
            <li class="side-menu menu-list"><a href="/app/admin/movie/list">영화 목록</a></li>
            <li class="side-menu menu-list"><a href="/app/admin/movie/insert">영화 등록</a></li>
            <li class="side-menu menu-list"><a href="/app/admin/movie/time">상영시간 등록</a></li>
            <li class="side-menu menu-list"><a href="/app/admin/movie/timelist">상영시간 목록</a></li>
          </div>

          <li class="side-menu side-menu-theater">극장</li>

          <div class="theater-lists hidden">
            <li class="side-menu theater-list"><a href="/app/admin/theater/list">극장 목록</a></li>
            <li class="side-menu theater-list"><a href="/app/admin/theater/insert">극장 등록</a></li>
            <li class="side-menu theater-list"><a href="/app/admin/theater/price">가격 등록</a></li>
            <li class="side-menu theater-list"><a href="/app/admin/theater/pricelist">가격 목록</a></li>
          </div>

          <li class="side-menu side-menu-evt">이벤트</li>

          <div class="evt-lists hidden">
            <li class="side-menu evt-list"><a href="/app/admin/evt/insert">이벤트 등록</a></li>
            <li class="side-menu evt-list"><a href="/app/admin/evt/list">이벤트 목록</a></li>
          </div>

          <li class="side-menu side-menu-not">공지사항</li>

          <div class="not-lists hidden">
            <li class="side-menu not-list"><a href="/app/admin/not/insert">공지사항 등록</a></li>
            <li class="side-menu not-list"><a href="/app/admin/not/list">공지사항 목록</a></li>
          </div>

          <li class="side-menu side-menu-store">스토어</li>

          <div class="store-lists hidden">
            <li class="side-menu store-list"><a href="/app/admin/store/insert">상품 등록</a></li>
            <li class="side-menu store-list"><a href="/app/admin/store/list">상품 목록</a></li>
          </div>
        </ul>
      </div>
      <div id="main">
        <div id="nav">
          <span>어서오세요 관리자님 환영합니다 :) </span>
          <input type="button" value="관리자 나가기" onclick="">
        </div>
        <div id="insert">
          <form action="" method="post">
            <input type="text" placeholder="장르">
            <input type="text" placeholder="나이">
            <input type="text" placeholder="내용">
            <input type="text" placeholder="주연">
            <input type="text" placeholder="시간">
            <input type="file" placeholder="이미지">
          </form>

        </div>

    
      </div>

  </body>

  </html>