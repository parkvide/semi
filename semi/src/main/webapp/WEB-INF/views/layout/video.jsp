<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="video">
	<video class="iframe" width="100%" height="500px" autoplay controls>
		<source src="/app/resources/img/Disney.mp4" type="video/mp4">
	</video>
	<div class="description">
		<h1 style="color: white;">모아나</h1>
		<h3 style="color: white;">메인 예고</h3>
		<p style="color: white;">7년만에 돌아오는 모아나 11월 대 개봉</p>
		<div class="buttons">
			<button class="play" onclick="location.href='/app/movie/ticketing'">
				<i class="fa-regular fa-credit-card"></i><span>예매</span>
			</button>
			<button class="detail" onclick="location.href='/app/movie/list'">
				<i class="fa-solid fa-circle-info"></i>상세 정보
			</button>
		</div>
	</div>
</div>