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
      <c:forEach items="${packList}" var="vo">
        <li>
          <a href="/app/store/detail?no=${vo.no}&categoryNo=${vo.categoryNo}">
            <span><img height="220" width="220" src="${vo.productImg}" alt=""></span>
            <span class="list-title">${vo.name}</span>
            <span class="list-name">${vo.detail}</span>
            <span class="list-price-wrap">
              <span class="detail-price">${vo.price}원</span>
            </span>
          </a>
        </li>
      </c:forEach>
      </ul>
    </div>
    
    <div class="prd-list">
      <div class="prd-title">
        <span class="popcorn"><a href="/app/store/combo">콤보</a></span>
        <span class="prd-detail"></span>
      </div>
      <div class="sep2"></div>
      <ul class="list-style">
      <c:forEach items="${comboList}" var="vo">
        <li>
          <a href="/app/store/detail?no=${vo.no}&categoryNo=${vo.categoryNo}">
              <span><img height="220" width="220" src="${vo.productImg}" alt=""></span>
              <span class="list-title">${vo.name}</span>
              <span class="list-name">${vo.detail}</span>
              <span class="list-price-wrap">
                  <span class="detail-price">${vo.price}원</span>
              </span>
          </a>
      </li>
      </c:forEach>
     
      </ul>
    </div>
    
    <div class="prd-list">
      <div class="prd-title">
        <span class="popcorn"><a href="/app/store/giftticket">영화관람권</a></span>
        <span class="prd-detail"></span>
      </div>
      <div class="sep2"></div>
      <ul class="list-style">
      <c:forEach items="${ticketList}" var="vo">
        <li>
          <a href="/app/store/detail?no=${vo.no}&categoryNo=${vo.categoryNo}">
            <span><img height="220" width="220" src="${vo.productImg}" alt=""></span>
            <span class="list-title">${vo.name}</span>
            <span class="list-name"></span>
            <span class="list-price-wrap">
              <span class="detail-price">${vo.price}원</span>
            </span>
          </a>
        </li>
     </c:forEach>   
        </ul>
    </div>
    <div class="sep2"></div>


   <%@ include file="/WEB-INF/views/layout/footer.jsp" %>
  </body>

  </html>