<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/app/resources/css/movie/seatSelect.css">
<script defer src="/app/resources/js/movie/seatSelect.js"></script>
 
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
                    <a href="/app/movie/list">영화</a>
                </li>
                <li>
                    <a href="/app/cinema">영화관</a>
                </li>
                <li>
                    <a href="/app/movie/ticketing">예매</a>
                </li>
                <li>
                    <a href="/app/store">스토어</a>
                </li>
                <li>
                    <a href="/app/board/home">고객센터</a>
                </li>
            </ul>
        </div>
        <div class="right">
           
            <div class="icon kids">
                <a href="/app/member/login">로그인</a>
            </div>
            <div class="icon bell">
                <a href="/app/member/join">회원 가입</a>
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
    <div class="title">
        <h2>인원 / 좌석</h2>
    </div>
    <div class="seats-selection">
        <div>
            <label>일반</label>
            <select id="general">
                <option value="0">0</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
            </select>
        </div>
        <div>
            <label>청소년</label>
            <select id="teen">
                <option value="0">0</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
            </select>
        </div>
        
 		<div class="price"><h2>총 0 원</h2></div>
    </div>
 	<br><br>
 	<div class="movietitle"><h1 id="selectMovie">asdjkfhkjalsdf</h1></div>
 	
 	<br><br>
    <div class="screen">SCREEN</div>
    <div class="seating-chart">
        <!-- Column Labels -->
        <div></div>
        <div class="col-label">1</div>
        <div class="col-label">2</div>
        <div class="col-label">3</div>
        <div class="col-label">4</div>
        <div class="col-label">5</div>
        <div class="col-label">6</div>
        <div class="col-label">7</div>
        <div class="col-label">8</div>
        <div class="col-label">9</div>
        <div class="col-label">10</div>
        

        <!-- Seating Rows -->
        <!-- Row A -->
        <div class="row-label">A</div>
        <div class="seat a1"></div>
        <div class="seat a2"></div>
        <div class="seat a3"></div>
        <div class="seat a4"></div>
        <div class="seat a5"></div>
        <div class="seat a6"></div>
        <div class="seat a7"></div>
        <div class="seat a8"></div>
        <div class="seat a9"></div>
        <div class="seat a10"></div>

        <!-- Row B -->
        <div class="row-label">B</div>
       	<div class="seat b1"></div>
       	<div class="seat b2"></div>
		<div class="seat b3"></div>
		<div class="seat b4"></div>
		<div class="seat b5"></div>
		<div class="seat b6"></div>
        <div class="seat b7"></div>
        <div class="seat b8"></div>
        <div class="seat b9"></div>
        <div class="seat b10"></div>
       
       

        <!-- Row C -->
        <div class="row-label">C</div>
      	<div class="seat c1"></div>
        <div class="seat c2"></div>
        <div class="seat c3"></div>
        <div class="seat c4"></div>
        <div class="seat c5"></div>
        <div class="seat c6"></div>
        <div class="seat c7"></div>
        <div class="seat c8"></div>
        <div class="seat c9"></div>
        <div class="seat c10"></div>

        <!-- Row D -->
        <div class="row-label">D</div>
        <div class="seat d1"></div>
        <div class="seat d2"></div>
        <div class="seat d3"></div>
        <div class="seat d4"></div>
        <div class="seat d5"></div>
        <div class="seat d6"></div>
        <div class="seat d7"></div>
        <div class="seat d8"></div>
        <div class="seat d9"></div>
        <div class="seat d10"></div>

        <!-- Row E -->
        <div class="row-label">E</div>
        <div class="seat e1"></div>
        <div class="seat e2"></div>
        <div class="seat e3"></div>
        <div class="seat e4"></div>
        <div class="seat e5"></div>
        <div class="seat e6"></div>
        <div class="seat e7"></div>
        <div class="seat e8"></div>
        <div class="seat e9"></div>
        <div class="seat e10"></div>

        <!-- Row F -->
        <div class="row-label">F</div>
        <div class="seat f1"></div>
        <div class="seat f2"></div>
        <div class="seat f3"></div>
        <div class="seat f4"></div>
        <div class="seat f5"></div>
        <div class="seat f6"></div>
        <div class="seat f7"></div>
        <div class="seat f8"></div>
        <div class="seat f9"></div>
        <div class="seat f10"></div>

        <!-- Row G -->
        <div class="row-label">G</div>
        <div class="seat g1"></div>
        <div class="seat g2"></div>
        <div class="seat g3"></div>
        <div class="seat g4"></div>
        <div class="seat g5"></div>
        <div class="seat g6"></div>
        <div class="seat g7"></div>
        <div class="seat g8"></div>
        <div class="seat g9"></div>
        <div class="seat g10"></div>

        <!-- Row H -->
        <div class="row-label">H</div>
        <div class="seat h1"></div>
        <div class="seat h2"></div>
        <div class="seat h3"></div>
        <div class="seat h4"></div>
        <div class="seat h5"></div>
        <div class="seat h6"></div>
        <div class="seat h7"></div>
        <div class="seat h8"></div>
        <div class="seat h9"></div>
        <div class="seat h10"></div>

        <!-- Row I -->
        <div class="row-label">I</div>
        <div class="seat i1"></div>
        <div class="seat i2"></div>
        <div class="seat i3"></div>
        <div class="seat i4"></div>
        <div class="seat i5"></div>
        <div class="seat i6"></div>
        <div class="seat i7"></div>
        <div class="seat i8"></div>
        <div class="seat i9"></div>
        <div class="seat i10"></div>

        <!-- Row J -->
        <div class="row-label">J</div>
        <div class="seat j1"></div>
        <div class="seat j2"></div>
        <div class="seat j3"></div>
        <div class="seat j4"></div>
        <div class="seat j5"></div>
        <div class="seat j6"></div>
        <div class="seat j7"></div>
        <div class="seat j8"></div>
        <div class="seat j9"></div>
        <div class="seat j10"></div>
   </div>
   	<div class="checkout">
    	<button id="checkoutBtn" onclick="window.location.href='/app/movie/ticketinfo'">결제하기</button>
	</div>
   </div>
    </main>
    <div class="line"></div>
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
    
    <!-- <script type="text/javascript">
    
    	const x = localStorage.getItem("movietitle");
    	const target = document.querySelector("#selectMovie");
    	target.innerText = x;
    
    </script> -->
    
</body>
</html>



