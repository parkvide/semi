<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="/app/resources/css/movie/ticketing.css">
<script defer src="/app/resources/js/movie/ticketing.js"></script>
 <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
  <script src='//cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/js/toastr.min.js'></script>
</head>
<body>
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


</body>
</html>