<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>

		<%@ include file="/WEB-INF/views/layout/util.jsp" %>

	</head>

	<body>
		<%@ include file="/WEB-INF/views/layout/nav.jsp" %>
			<main>
				<%@ include file="/WEB-INF/views/layout/video.jsp" %>
			</main>
			<section>

				<div class="content-list">
					<h1>무비 차트</h1>
					<div class="slider">
						<c:forEach items="${movieImgList}" var="vo">
							<a href="/app/movie/ticketing"><img width="300" height="400" src="${vo.poster}"> </a>
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
						<c:forEach items="${eventImgList}" var="vo">
							<a href="/app/board/eventlist"><img width="300" height="400" src="${vo.contentImg}"></a>
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
									<div class="item">
										<a href="/app/store/package"><img width="150" height="150" src="${vo.productImg}" alt="">
											<span>${vo.price} 원</span>
										</a>
									</div>
								</c:forEach>
							</div>
						</li>
						<li>
							<div class="package">
								<h2>콤보</h2>
								<c:forEach items="${comboList}" var="vo">
									<div class="item">
										<a href="/app/store/combo"><img width="150" height="150" src="${vo.productImg}" alt="">
											<span>${vo.price} 원</span>
										</a>
									</div>
								</c:forEach>
							</div>
						</li>
						<li>
							<div class="package">
								<h2>영화관람권</h2>
								<c:forEach items="${gtList}" var="vo">
									<div class="item">
										<a href="/app/store/giftticket"><img width="150" height="150" src="${vo.productImg}" alt="">
											<span>${vo.price} 원</span>
										</a>
									</div>
								</c:forEach>
							</div>
						</li>

					</ul>
				</div>
			</section>
			<br>
			<br>
			<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
	</body>

	</html>