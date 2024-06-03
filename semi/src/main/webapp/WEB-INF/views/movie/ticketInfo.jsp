<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/app/resources/css/movie/ticketInfo.css">
<script defer src="/app/resources/js/movie/ticketInfo.js"></script>
 
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css" integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw==" crossorigin="anonymous" referrerpolicy="no-referrer" />

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
                    <a href="http://127.0.0.1:8888/app/movie/ticketing">예매</a>
                </li>
                <li>
                    <a href="http://127.0.0.1:8888/app/store">스토어</a>
                </li>
                <li>
                    <a href="http://127.0.0.1/app/service/home">고객센터</a>
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
		    <div class="edit">
		      <img style="height:100px " class="search-logo" src="/app/resources/img/ticket.png" alt="">
		      <h1>예매가 되었습니다</h1>
		      <hr><hr>
			<table>
			<tr>
				<th>영화 제목</th>
				<td id="title"></td>
			</tr>
			<tr>
				<th>영화관</th>
				<td id="cinema"></td>
			</tr>
			<tr>
				<th>상영관</th>
				<td id="theater"></td>
			</tr>
			<tr>
				<th>좌석</th>
				<td id="seat"></td>
			</tr>
			<tr>
				<th>청소년 인원</th>
				<td id="teen"></td>
			</tr>
			<tr>
				<th>성인 인원</th>
				<td id="general"></td>
			</tr>
			<tr>
				<th>상영 날짜</th>
				<td id="date"></td>
			</tr>
			<tr>
				<th>상영 시간</th>
				<td id="time"></td>
			</tr>
			<tr>
				<th>총 가격</th>
				<td id="price"></td>
			</tr>
			</table>
		     
		    </div>
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