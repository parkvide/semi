<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css" integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="/app/resources/css/store/store.css">
<script defer src="/app/resources/js/store/store.js"></script>
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
                    <a href="#">홈</a>
                </li>
                <li>
                    <a href="#">시리즈</a>
                </li>
                <li>
                    <a href="#">영화</a>
                </li>
                <li>
                    <a href="#">NEW! 요즘 대세 콘텐츠</a>
                </li>
                <li>
                    <a href="#">내가 찜한 콘텐츠</a>
                </li>
            </ul>
        </div>
        <div class="right">
            <div class="icon search">
                <div class="search-bar">
                    <i class="fa-solid fa-magnifying-glass"></i>
                    <input type="text" placeholder="제목, 사람, 장르"/>
                </div>
            </div>
        </div>
    </nav>
    <main>
        <div class="video">
              <iframe class="iframe" width="100%" height="315" src="https://www.youtube.com/embed/pMAPj6WVsT4" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
        </div>
        <div class="description">
            <h1>범죄도시 4</h1>
            <h3>메인 예고</h3>
            <p>
                4월 국경도 영역도 제한 없다. 싹 쓸어버린다
            </p>
            <div class="buttons">
                <button class="play"><i class="fa-regular fa-credit-card"></i><span>예매</span></button>
                <button class="detail"><i class="fa-solid fa-circle-info"></i>상세 정보</button>
            </div>
        </div>
    </main>

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