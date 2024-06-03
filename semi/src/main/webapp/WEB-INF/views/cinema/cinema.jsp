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
				
					<button onclick="loadCinemaList('서울');">서울</button>
					<button onclick="loadCinemaList('경기');">경기</button>
					<button onclick="loadCinemaList('인천');">인천</button>
					<button onclick="loadCinemaList('강원');">강원</button>
					<button onclick="loadCinemaList('대전');">대전</button>
					<button onclick="loadCinemaList('충청');">충청</button>
					<button onclick="loadCinemaList('대구');">대구</button>
					<button onclick="loadCinemaList('부산');">부산</button>
					<button onclick="loadCinemaList('울산');">울산</button>
					<button onclick="loadCinemaList('경상');">경상</button>
					<button onclick="loadCinemaList('광주');">광주</button>
					<button onclick="loadCinemaList('전라');">전라</button>
					<button onclick="loadCinemaList('제주');">제주</button>

				
			</div>
			<div class="cinema_name">
				<ul>
					<li><button type="button">강남</button></li>
					<li><button type="button">강변</button></li>
					<li><button type="button">건대입구</button></li>
					<li><button type="button">구로</button></li>
					<li><button type="button">대학로</button></li>
					<li><button type="button">동대문</button></li>
					<li><button type="button">등촌</button></li>
					<li><button type="button">명동</button></li>
					<li><button type="button">명동역</button></li>
					<li><button type="button">미아</button></li>
					<li><button type="button">방학</button></li>
					<li><button type="button">블광</button></li>
					<li><button type="button">상봉</button></li>
					<li><button type="button">성신</button></li>
					<li><button type="button">송파</button></li>
					<li><button type="button">수유</button></li>
					<li><button type="button">신촌</button></li>
					<li><button type="button">압구정</button></li>
					<li><button type="button">여의도</button></li>
					<li><button type="button">연남</button></li>

					
				</ul>
			</div>
			<div class="cinema_img">
				<img src="/app/resources/img/cinema.jpg" alt="Cinema Image">
			</div>
			<div class="detail_area">
				<span class="name">FOURS 강남</span>
				<button class="rent-btn">대관문의</button>
				<div class="cinema_img">
					<img src="/app/resources/img/cinemaImg/강남.jpg" alt="강남 Cinema Image">
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