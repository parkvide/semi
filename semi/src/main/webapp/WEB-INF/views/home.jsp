<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%@ include file="/WEB-INF/views/layout/util.jsp"%>

</head>
<body>
	<%@ include file="/WEB-INF/views/layout/nav.jsp"%>
	<main>
		<div class="video">
			<iframe class="iframe" width="1650" height="315"
				src="https://www.youtube.com/embed/pMAPj6WVsT4" frameborder="0"
				allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
				allowfullscreen></iframe>
		</div>
		<div class="description">
			<h1>범죄도시 4</h1>
			<h3>메인 예고</h3>
			<p>4월 국경도 영역도 제한 없다. 싹 쓸어버린다</p>
			<div class="buttons">
				<button class="play">
					<i class="fa-regular fa-credit-card"></i><span>예매</span>
				</button>
				<button class="detail">
					<i class="fa-solid fa-circle-info"></i>상세 정보
				</button>
			</div>
		</div>

	</main>
	<section>

		<div class="content-list">
			<h1>무비 차트</h1>
			<div class="slider">
				<c:forEach items="${movieImgList}" var="vo">
					<a href="/app/movie/ticketing"><img width="300" height="400"
						src="${vo.poster}"> </a>
				</c:forEach>
			</div>
			<div class="prev">
				<i class="fa-solid fa-angle-right prev-arrow"></i>
			</div>
			<div class="next">
				<i class="fa-solid fa-angle-right"></i>
			</div>
		</div>

		<div class="content-list">
			<h1>이벤트</h1>
			<div class="slider">
				<c:forEach items="eventImgList" var="vo">
					<a href="/app/board/eventlist"><img width="300" height="400"
						src="${vo.contentImg}"> </a>
				</c:forEach>
			</div>
			<div class="prev">
				<i class="fa-solid fa-angle-right prev-arrow"></i>
			</div>
			<div class="next">
				<i class="fa-solid fa-angle-right"></i>
			</div>
		</div>
		<div class="content">
			<h1>패키지 및 상품</h1>
			<br>
			<ul class="prodview">

				<li>
					<div class="package">
						<h2>패키지</h2>
						<c:forEach items="${packList}" var="vo">
							<div>
								<a href="/app/store/package"><img width="150" height="150"
									src="${vo.productImg}" alt=""></a>
							</div>
						</c:forEach>
					</div>
				</li>
				<li>
					<div class="package">
						<h2>콤보</h2>
						<c:forEach items="${comboList}" var="vo">
							<div>
								<a href="/app/store/package"><img width="150" height="150"
									src="${vo.productImg}" alt=""></a>
							</div>
						</c:forEach>
					</div>
				</li>
				<li>
					<div class="package">
						<h2>영화관람권</h2>
						<c:forEach items="${gtList}" var="vo">
							<div>
								<a href="/app/store/package"><img width="150" height="150"
									src="${vo.productImg}" alt=""></a>
							</div>
						</c:forEach>
					</div>
				</li>
				
			</ul>
		</div>
	</section>
	<br>
	<br>
	<%@ include file="/WEB-INF/views/layout/footer.jsp"%>
</body>
</html>