<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="/app/resources/css/movie/ticketing.css">
<script defer src="/app/resources/js/movie/ticketing.js"></script>
 
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
	<section>
		<div id="sec">

				<!-- date -->
				<div>
					<div class="swiper-container">
						<div class="swiper-wrapper">
						</div>
						<!-- Add Pagination -->
						<div class="swiper-pagination"></div>
					</div>
				</div>
				<!-- date 끝 -->


				<div id="secMidTitle">
					<div class="dname">
						<img alt="" src="/app/resources/img/ms1.png">
					</div>
					<div class="divc">
						<img alt="" src="/app/resources/img/ms2.png">
					</div>
					<div class="divT">
						<img alt="" src="/app/resources/img/ms3.png">
					</div>
					<div class="divT2">
						<img alt="" src="/app/resources/img/ms4.png">
					</div>
				</div>


				<div id="secMain">

					<!-- 받아온 영화제목 -->
					<c:if test="${not empty movieInfo_name}">
						<input type="hidden" value="${movieInfo_name}" id="selectMovieName">
					</c:if>

					<!-- 영화제목 선택 -->
					<div class="sname s">
						<table class="sul">
							<c:forEach items="${movieTitle}" var="title">
								<tr class="movietitle">
									<td class="mtd1">
									<c:choose>
											<c:when test="${title.movieInfo_grade eq '전체 관람가'}">
												<img class="age" alt=""
													src="/app/resources/img/m1.png">
											</c:when>
											<c:when test="${title.movieInfo_grade eq '12세 관람가'}">
												<img class="age" alt=""
													src="/app/resources/img/m2.png">
											</c:when>
											<c:when test="${title.movieInfo_grade eq '15세 관람가'}">
												<img class="age" alt=""
													src="/app/resources/img/m3.png">
											</c:when>
											<c:when test="${title.movieInfo_grade eq '청소년 관람불가'}">
												<img class="age" alt=""
													src="/app/resources/img/m4.png">
											</c:when>
										</c:choose></td>

									<td class="mtitle mtd" title="${title.movieInfo_num}">${title.movieInfo_title}</td>

								</tr>
							</c:forEach>
						</table>
					</div>


					<!-- 영화 지역선택 -->
					<div class="s s1">
						<table class="sul" id="theaterNameSelect">
							<c:forEach items="${movieLoc}" var="loc">
								<tr class="loc">
									<td class="mtd">${loc.cinema_loc}</td>
								<tr>
							</c:forEach>
						</table>
					</div>



					<!-- 영화 지역에 따른 영화관 선택 -->
					<div class="s3 s2">
						<table class="sul" id="cinemaNameSelect">
						</table>
					</div>


					<!-- 날짜선택  -->
					<div class="s s4">
					<img class="corn3" alt="" src="/app/resources/img/pop_cornT.png">
						<table class="sul" id="movieDateSelect">
						</table>
					</div>


					<!-- 시간선택  -->
					<div class="s s5">
					<img class="corn4" alt="" src="/app/resources/img/pop_corn_D.png">
						<table class="sul" id="movieTimeSelect">
						
						</table>
					</div>

					<form action="../member/movieLogin" id="frm" method="post">
						 <img id="btn" alt="" src="/app/resources/img/seat.png"> 
					</form>


				</div>
			</div>
		</section>
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