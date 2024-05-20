<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css" integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="/app/resources/css/store/store.css">


</head>
<body>
<nav>
        <div class="left">
            <div class="logo">
                <a href="#"><img src="/app/resources/img/logo.png" alt=""></a>
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
                  <a href="/app/store">스토어</a>
                </li>
                <li>
                    <a href="#">고객센터</a>
                </li>
            </ul>
        </div>
        <div class="right">
           
            <div class="icon kids">
                <a href="http://127.0.0.1:8888/app/member/login">로그인</a>
            </div>
            <div class="icon bell">
                <a href="#">회원 가입</a>
            </div>
            
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
           	<iframe class="iframe" width="1650" height="315" src="https://www.youtube.com/embed/pMAPj6WVsT4" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
        </div>
        <div class="description">
            <h1>범죄도시 4</h1>
            
            <div class="buttons">
                <button class="play"><i class="fa-regular fa-credit-card"></i><span>예매</span></button>
                <button class="detail"><i class="fa-solid fa-circle-info"></i>상세 정보</button>
            </div>
        </div>
       
    </main>
    <div class="store-nav">
        <div class="store">
          <h3>스토어</h3>
        </div>
        <div class="sep1"></div>
        <div class="category-name">
          <ul class="c1">
            <li><a class="c-n" href="/app/store/package">패키지</a></li>
          <li><a class="c-n" href="/app/store/giftticket">영화관람권</a></li>
          <li><a class="c-n" href="/app/store/combo">콤보</a></li>
          <li><a class="c-n" href="/app/store/popcorn">팝콘</a></li>
          <li><a class="c-n" href="/app/store/drink">음료</a></li>
          </ul>
          <ul class="c2">
            <li><a class="c-n" href="">내관람권</a></li>
            <li><a class="c-n" href="">장바구니</a></li>
          </ul>
        </div>
        <div class="sep1"></div>
      </div>
    
    <div class="prd-list">
        <div class="prd-title">
            <span class="popcorn">음료</span>
            <span class="prd-detail">탄산음료부터 에이드까지, 마시는 즐거움!</span>
        </div>
        <div class="sep2"></div>
        <ul class="list-style">
            <li>
                <a href="">
                    <span><img height="270" width="270" src="/app/resources/img/음료/에이드.jpg" alt=""></span>
                    <span class="list-title">에이드</span>
                    <span class="list-name">에이드 1</span>
                    <span class="list-price-wrap">
                        <span class="detail-price">5,500원</span>
                    </span>
                </a>
            </li>
            <li>
                <a href="">
                    <span><img height="270" width="270" src="/app/resources/img/음료/아메리카노(ice).jpg" alt=""></span>
                    <span class="list-title">아메리카노(ICE)</span>
                    <span class="list-name">아메리카노(ICE) 1</span>
                    <span class="list-price-wrap">
                        <span class="detail-price">4,500원</span>
                    </span>
                </a>
            </li>
            <li>
                <a href="">
                    <span><img height="270" width="270" src="/app/resources/img/음료/아메리카노(hot).jpg" alt=""></span>
                    <span class="list-title">아메리카노(HOT)</span>
                    <span class="list-name">아메리카노(HOT) 1</span>
                    <span class="list-price-wrap">
                        <span class="detail-price">4,000원</span>
                    </span>
                </a>
            </li>
            <li>
                <a href="">
                    <span><img height="270" width="270" src="/app/resources/img/음료/탄산음료(L).jpg" alt=""></span>
                    <span class="list-title">탄산음료(L)</span>
                    <span class="list-name">탄산음료(L)</span>
                    <span class="list-price-wrap">
                        <span class="detail-price">3,500원</span>
                    </span>
                </a>
            </li>
            <li>
                <a href="">
                    <span><img height="270" width="270" src="/app/resources/img/음료/탄산음료(M).jpg" alt=""></span>
                    <span class="list-title">탄산음료(M)</span>
                    <span class="list-name">탄산음료(M)</span>
                    <span class="list-price-wrap">
                        <span class="detail-price">3,000원</span>
                    </span>
                </a>
            </li>
            
        </ul>
    </div>
    <div class="sep2"></div>


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