<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Fours 매장</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
	integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="/app/resources/css/cinema/cinema.css">
<script src="/app/resources/js/cinema/cinema.js"></script>
<!-- <script defer src="/app/resources/js/home.js"></script> -->
<!-- <script  src="/app/resources/js/store.js"></script> -->
<%@ include file="/WEB-INF/views/layout/util.jsp"%>
</head>

<body>
	<%@ include file="/WEB-INF/views/layout/nav.jsp"%>


	<main>
		<div class="left"></div>
		<div class="cinema">
			<div class="cinema_loc">
				<ul>
					<button onclick="loadCinemaList("서울");">서울</button>
					<button onclick="loadCinemaList("경기");">경기</button>
					<button onclick="loadCinemaList("인천");">인천</button>
					<button onclick="loadCinemaList("강원");">강원</button>
					<button onclick="loadCinemaList("대전");">대전</button>
					<button onclick="loadCinemaList("충청");">충청</button>
					<button onclick="loadCinemaList("대구");">대구</button>
					<button onclick="loadCinemaList("부산");">부산</button>
					<button onclick="loadCinemaList("울산");">울산</button>
					<button onclick="loadCinemaList("경상");">경상</button>
					<button onclick="loadCinemaList("광주");">광주</button>
					<button onclick="loadCinemaList("전라");">전라</button>
					<button onclick="loadCinemaList("제주");">제주</button>
				</ul>
			</div>
			<div class="cinema_name">
				<ul>
					<li><a href="">강남</a></li>
					<li><a href="">강변</a></li>
					<li><a href="">건대입구</a></li>
					<li><a href="">구로</a></li>
					<li><a href="">대학로</a></li>
					<li><a href="">동대문</a></li>
					<li><a href="">등촌</a></li>
					<li><a href="">명동</a></li>
					<li><a href="">명동역 씨네라이브러리</a></li>
					<li><a href="">미아</a></li>
					<li><a href="">방학</a></li>
					<li><a href="">블광</a></li>
					<li><a href="">상봉</a></li>
					<li><a href="">성신여대입구</a></li>
					<li><a href="">송파</a></li>
					<li><a href="">수유</a></li>
					<li><a href="">신촌아트레온</a></li>
					<li><a href="">압구정</a></li>
					<li><a href="">여의도</a></li>
					<li><a href="">연남</a></li>
					<li><a href="">영등포</a></li>
					<li><a href="">왕십리</a></li>
					<li><a href="">용산아이파크몰</a></li>
					<li><a href="">중계</a></li>
					<li><a href="">천호</a></li>
					<li><a href="">청담씨네시티</a></li>
					<li><a href="">피카디리1958</a></li>
					<li><a href="">하계</a></li>
					<li><a href="">홍대</a></li>
					<li><a href="">용사아안</a></li>
				</ul>
			</div>
			<div class="cinema_img">
				<img src="/app/resources/img/cinema.jpg" alt="Cinema Image">
			</div>
			<div class="detail_area">
				<span class="name">FOURS 강남</span>
				<button class="rent-btn">대관문의</button>
				<div class="cinema_img">
					<img src="/app/resources/img/지점사진/강남.jpg" alt="강남 Cinema Image">
				</div>
				<div class="cinema_detail">
					<div class="address">
						<pre>
			              <h3>
			                  주소 
			                  전화번호
			                  4관 / 400석
			              </h3>
	            		</pre>
					</div>
					<div class="parking_detail">
						<pre>
					         콘텐트
	           			</pre>
					</div>
				</div>
			</div>
			
		</div>
		<div class="right"></div>


	</main>

	<%@ include file="/WEB-INF/views/layout/footer.jsp"%>
</body>

</html>