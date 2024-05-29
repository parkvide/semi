<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
      integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
      crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="/app/resources/css/store/store.css">
    <!-- <script defer src="/app/resources/js/home.js"></script> -->
    <!-- <script  src="/app/resources/js/store.js"></script> -->
<%@ include file="/WEB-INF/views/layout/util.jsp" %>
  </head>

  <body>
 <%@ include file="/WEB-INF/views/layout/nav.jsp" %>
    <main>
      <div class="video">
        <iframe class="iframe" width="1650" height="315" src="https://www.youtube.com/embed/pMAPj6WVsT4" frameborder="0"
          allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
          allowfullscreen></iframe>
      </div>
      <div class="description">
        <h1>범죄도시 4</h1>

        <div class="buttons">
          <button class="play"><i class="fa-regular fa-credit-card"></i><span>예매</span></button>
          <button class="detail"><i class="fa-solid fa-circle-info"></i>상세 정보</button>
        </div>
      </div>

    </main>
   	
   	<%@ include file="/WEB-INF/views/layout/storeNav.jsp" %>
   	
    <div class="prd-list">
      <div class="prd-title">
        <span class="popcorn"><a href="/app/store/combo">패키지</a></span>
        <span class="prd-detail"></span>
      </div>
      <div class="sep2"></div>
      <ul class="list-style">
        <li>
          <a href="">
            <span><img height="220" width="220" src="/app/resources/img/패키지/나랑너패키지.jpg" alt=""></span>
            <span class="list-title">나랑 너 패키지</span>
            <span class="list-name">일반 영화 관람권 2매+FOURS콤보 1개</span>
            <span class="list-price-wrap">
              <span class="detail-price">34,000원</span>
            </span>
          </a>
        </li>
        <li>
          <a href="">
            <span><img height="220" width="220" src="/app/resources/img/패키지/우리패키지.jpg" alt=""></span>
            <span class="list-title">우리 패키지</span>
            <span class="list-name">일반 영화관람권 4매+더블콤보 1개</span>
            <span class="list-price-wrap">
              <span class="detail-price">61,000원</span>
            </span>
          </a>
        </li>
        <li>
          <a href="">
            <span><img height="220" width="220" src="/app/resources/img/패키지/좋은날패키지.jpg" alt=""></span>
            <span class="list-title">좋은 날 패키지</span>
            <span class="list-name">일반 영화 관람권 1매+스몰콤보 1개</span>
            <span class="list-price-wrap">
              <span class="detail-price">18,000원</span>
            </span>
          </a>
        </li>

      </ul>
    </div>
    <div class="prd-list">
      <div class="prd-title">
        <span class="popcorn"><a href="/app/store/combo">콤보</a></span>
        <span class="prd-detail"></span>
      </div>
      <div class="sep2"></div>
      <ul class="list-style">
        <li>
          <a href="">
              <span><img height="220" width="220" src="/app/resources/img/콤보/더블콤보.jpg" alt=""></span>
              <span class="list-title">더블콤보</span>
              <span class="list-name">팝콘(M)2+탄산(M)2</span>
              <span class="list-price-wrap">
                  <span class="detail-price">13,000원</span>
              </span>
          </a>
      </li>
      <li>
          <a href="">
              <span><img height="220" width="220" src="/app/resources/img/콤보/라지콤보.jpg" alt=""></span>
              <span class="list-title">라지콤보</span>
              <span class="list-name">팝콘(L)2+탄산음료(L)2</span>
              <span class="list-price-wrap">
                  <span class="detail-price">15,000원</span>
              </span>
          </a>
      </li>
      <li>
          <a href="">
              <span><img height="220" width="220" src="/app/resources/img/콤보/스몰콤보.jpg" alt=""></span>
              <span class="list-title">스몰콤보</span>
              <span class="list-name">팝콘(M)1+탄산음료(M)1</span>
              <span class="list-price-wrap">
                  <span class="detail-price">7,000원</span>
              </span>
          </a>
      </li>
      <li>
        <a href="">
            <span><img height="220" width="220" src="/app/resources/img/콤보/cgv콤보.jpg" alt=""></span>
            <span class="list-title">FOURS콤보</span>
            <span class="list-name">팝콘(L)1+탄산음료(M)2</span>
            <span class="list-price-wrap">
                <span class="detail-price">10,000원</span>
            </span>
        </a>
    </li>
      </ul>
    </div>
    <div class="prd-list">
      <div class="prd-title">
        <span class="popcorn"><a href="/app/store/giftticket">영화관람권</a></span>
        <span class="prd-detail"></span>
      </div>
      <div class="sep2"></div>
      <ul class="list-style">
        <li>
          <a href="">
            <span><img height="220" width="220" src="/app/resources/img/관람권/4dx관람권.jpg" alt=""></span>
            <span class="list-title">4DX 영화관람권</span>
            <span class="list-name"></span>
            <span class="list-price-wrap">
              <span class="detail-price">19,000원</span>
            </span>
          </a>
        </li>
        <li>
          <a href="">
            <span><img height="220" width="220" src="/app/resources/img/관람권/imax관람권.jpg" alt=""></span>
            <span class="list-title">IMAX 영화관람권</span>
            <span class="list-name"></span>
            <span class="list-price-wrap">
              <span class="detail-price">18,000원</span>
            </span>
          </a>
        </li>
        <li>
          <a href="">
            <span><img height="220" width="220" src="/app/resources/img/관람권/기본관람권.jpg" alt=""></span>
            <span class="list-title">FOURS 영화관람권</span>
            <span class="list-name"></span>
            <span class="list-price-wrap">
              <span class="detail-price">13,000원</span>
            </span>
          </a>
        </li>

      </ul>
    </div>
    <div class="sep2"></div>


   <%@ include file="/WEB-INF/views/layout/footer.jsp" %>
  </body>

  </html>