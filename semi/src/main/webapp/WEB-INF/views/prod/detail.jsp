<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
      integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
      crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="/app/resources/css/detail/detail.css">
    <link rel="stylesheet" href="/app/resources/css/home.scss">
    
  </head>

  <body>
    <nav>
      <div class="left">
        <div class="logo">
          <a href="#"><img src="/app/resources/img/main.png" alt=""></a>
        </div>
        <div class="mobile-menu">메뉴</div>
        <ul class="menu-list">
          <li>
            <a href="#">영화</a>
          </li>
          <li>
            <a href="#">영화관</a>
          </li>
          <li>
            <a href="#">예매</a>
          </li>
          <li>
            <a href="#">스토어</a>
          </li>
          <li>
            <a href="#">고객센터</a>
          </li>
        </ul>
      </div>
      <div class="right">
        <div class="icon search">
          <div class="search-bar">
            <i class="fa-solid fa-magnifying-glass"></i>
            <input type="text" placeholder="제목, 사람, 장르" />
          </div>
        </div>
        <div class="icon kids">
          <a href="#">로그인</a>
          <a href="#">회원가입</a>
          <a href="#">마이페이지</a>
        </div>
      </div>
    </nav>
    <div class="store">
      <h3>스토어</h3>
    </div>
    <div class="separator"></div>
    <div class="category-name">
      <ul class="c1">
        <li><a href="">패키지</a></li>
        <li><a href="">영화관람권</a></li>
        <li><a href="">콤보</a></li>
        <li><a href="">팝콘</a></li>
        <li><a href="">음료</a></li>
      </ul>
      <ul class="c2">
        <li><a href="">내관람권</a></li>
        <li><a href="">장바구니</a></li>
      </ul>
    </div>
    <main>
      <div class="name">카라멜 팝콘</div>
      <div></div>
      <div class="prd-img">
        <img width="500" height="500" src="/app/resources/img/팝콘사진.jpg" alt="">
      </div>
      <div class="detail">
        <p class="prd-price">
          <span>가격</span>
        </p>
        <div class="sep1"></div>
        <dl>
          <dt>상품구성</dt><dd>이름</dd>
          <dt>유효기간</dt><dd>구매일로부터 ~</dd>
          <dt>원산지</dt><dd>팝콘(옥수수:~)</dd>
          <dt>상품교환</dt><dd><a href="">사용가능 ~보기</a></dd>
        </dl>
        <div class="sep2"></div>
        <div>
          <div class="cnt">
            <dl>
              <dt>개수</dt>
              <dd>가격</dd>
            </dl>
          </div>
          <div class="sep3"></div>
          <div class="total-price"><span>총 구매금액 ~ 원</span></div>
        </div>
        <div class="buy-btn">
          <button>장바구니</button>
          <button>선물하기</button>
          <button>구매하기</button>
        </div>
      </div>
      <div>

      </div>
    </main>
   
    <footer>
      <div class="wrap">
        <div class="social-icons">
          <i class="fa-brands fa-facebook-square"></i>
          <i class="fa-brands fa-instagram"></i>
          <i class="fa-brands fa-twitter"></i>
          <i class="fa-brands fa-youtube"></i>
        </div>
        <div class="options">
          <div class="option">자막 및 음성</div>
          <div class="option">음성 지원</div>
          <div class="option">고객 센터</div>
          <div class="option">기프트카드</div>
          <div class="option">미디어 센터</div>
          <div class="option">투자 정보(IR)</div>
          <div class="option">입사 정보</div>
          <div class="option">이용 약관</div>
          <div class="option">개인 정보</div>
          <div class="option">법적 고지</div>
          <div class="option">쿠키 설정</div>
          <div class="option">회사 정보</div>
          <div class="option">문의하기</div>
        </div>
      </div>
    </footer>
  </body>

  </html>