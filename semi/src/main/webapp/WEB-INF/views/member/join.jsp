<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css" integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="/app/resources/css/member/join.css">
</head>
<body>
	<nav>
        <div class="left">
            <div class="logo">
                <a href="http://127.0.0.1:8888/app/home"><img src="/app/resources/img/logo.png" alt=""></a>
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
           
            <div class="icon kids">
                <a href="http://127.0.0.1:8888/app/member/login">로그인</a>
            </div>
            <div class="icon bell">
                <a href="http://127.0.0.1:8888/app/member/join">회원 가입</a>
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
    <div class="container">
            <span class="error animated tada" id="msg"></span>
            <form name="form1" class="box" onsubmit="return checkStuff()">
              <h4>SIGN UP</h4>
                <input type="text" name="id" placeholder="ID" autocomplete="off">
                <i class="typcn typcn-eye" id="eye"></i>
                <input type="password" name="password" placeholder="PASSWORD" id="pwd" autocomplete="off">
                <input type="password" name="passwordCheck" placeholder="PASSWORD CHECK"autocomplete="off">
                <input type="text" name="name" placeholder="NAME" id="pwd" autocomplete="off">
                <input type="text" name="birth" placeholder="BIRTH" id="pwd" autocomplete="off">
                <input type="text" name="nick" placeholder="NICK" id="pwd" autocomplete="off">
                <input type="text" name="email" placeholder="E-MAIL" id="pwd" autocomplete="off">
                <input type="text" name="phone" placeholder="PHONE NUMBER" id="pwd" autocomplete="off">
                <input type="submit" value="SIGN UP" class="btn1">
              </form>   
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