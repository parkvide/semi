<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
      integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
      crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="/app/resources/css/store/cart.css">
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

    <style>
      .splide__slide img {
        width: 200;
        height: 200;
      }
    </style>
  </head>

  <body>
  
    <%@ include file="/WEB-INF/views/layout/nav.jsp" %>
    
    <div class="store">
      <h3>장바구니</h3>
    </div>
    <div class="separator"></div>
    <div class="category-name">
      <ul class="c1">
        <li><a class="c-n" href="/app/store/package">패키지</a></li>
        <li><a class="c-n" href="/app/store/giftticket">영화관람권</a></li>
        <li><a class="c-n" href="/app/store/combo">콤보</a></li>
        <li><a class="c-n" href="/app/store/popcorn">팝콘</a></li>
        <li><a class="c-n" href="/app/store/drink">음료</a></li>
      </ul>
      <ul class="c2">
        <li><a href="">내관람권</a></li>
        <li><a href="">장바구니</a></li>
      </ul>
    </div>
    <main>

      <div class="left"></div>
      <div class="cart-container">
        <table class="cart-table">
            <thead>
                <tr>
                    <th><input type="checkbox" checked></th>
                    <th>상품명</th>
                    <th>판매금액</th>
                    <th>수량</th>
                    <th>구매금액</th>
                    <th>선택</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="checkbox" checked></td>
                    <td>
                        <img src="product1.jpg" alt="Product 1" class="product-image">
                        <div class="product-details">
                            <h2>좋은 날 패키지</h2>
                            <p>일반 영화 관람권 1매 + 스몰세트 1개</p>
                        </div>
                    </td>
                    <td>
                        <p class="current-price">18,000원</p>
                        <p class="original-price">20,000원</p>
                    </td>
                    <td>
                        <input type="number" value="1" class="product-quantity">
                        <button class="update-button">변경</button>
                    </td>
                    <td>
                        <p class="total-price">18,000원</p>
                    </td>
                    <td>
                        <button class="purchase-button">바로구매</button>
                        <button class="delete-button">삭제</button>
                    </td>
                </tr>
                <tr>
                    <td><input type="checkbox" checked></td>
                    <td>
                        <img src="product2.jpg" alt="Product 2" class="product-image">
                        <div class="product-details">
                            <h2>나랑 너 패키지</h2>
                            <p>일반 영화 관람권 2매+CGV콤보 1개</p>
                        </div>
                    </td>
                    <td>
                        <p class="current-price">34,000원</p>
                        <p class="original-price">36,000원</p>
                    </td>
                    <td>
                        <input type="number" value="1" class="product-quantity">
                        <button class="update-button">변경</button>
                    </td>
                    <td>
                        <p class="total-price">34,000원</p>
                    </td>
                    <td>
                        <button class="purchase-button">바로구매</button>
                        <button class="delete-button">삭제</button>
                    </td>
                </tr>
            </tbody>
        </table>
        <button class="delete-selected-button">선택상품 삭제</button>
        <p class="cart-info">장바구니에 담긴 상품은 최대 30일까지 보관됩니다.</p>
    </div>
      <div class="right"></div>
      
      
      
      <section id="image-carousel" class="splide" aria-label="Beautiful Images">
        <div class="with">
          <span>이 상품과 함께 본 상품</span>
          <div class="sep4"></div>
        </div>
        <div class="splide__track">
          <ul class="splide__list">
            <li class="splide__slide">
              <img src="/app/resources/img/팝콘/팝콘이미지1.jpg">
            </li>
            <li class="splide__slide">
              <img src="/app/resources/img/팝콘/팝콘이미지2.jpg">
            </li>
            <li class="splide__slide">
              <img src="/app/resources/img/팝콘/팝콘이미지3.jpg">
            </li>
            <li class="splide__slide">
              <img src="/app/resources/img/팝콘/팝콘이미지4.jpg">
            </li>
            <li class="splide__slide">
              <img src="/app/resources/img/팝콘/팝콘이미지5.jpg">
            </li>
            <li class="splide__slide">
              <img src="/app/resources/img/팝콘/팝콘이미지6.jpg">
            </li>
            <li class="splide__slide">
              <img src="/app/resources/img/팝콘/팝콘이미지7.jpg">
            </li>
            <li class="splide__slide">
              <img src="/app/resources/img/팝콘/팝콘이미지8.jpg">
            </li>
          </ul>
        </div>
      </section>
      <div></div>
    </main>

    <%@ include file="/WEB-INF/views/layout/footer.jsp" %>
  </body>

  </html>