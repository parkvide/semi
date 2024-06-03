<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
	integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="/app/resources/css/store/storeDetail.css">
<!-- <script src="/app/resources/js/detail/detail.js"></script> -->
<script
	src="
    https://cdn.jsdelivr.net/npm/@splidejs/splide@4.1.4/dist/js/splide.min.js
    "></script>
<link
	href="
    https://cdn.jsdelivr.net/npm/@splidejs/splide@4.1.4/dist/css/splide.min.css
    "
	rel="stylesheet">
<script src="/app/resources/js/store/storeDetail.js"></script>
<script defer>
	document.addEventListener('DOMContentLoaded', function() {
		new Splide('#image-carousel', {
			perPage : 3,
			perMove : 1,
		}).mount();
	});
</script>

<style>
.splide__slide img {
	width: 200;
	height: 200;
}
</style>

<%@ include file="/WEB-INF/views/layout/util.jsp"%>

</head>

<body>

	<%@ include file="/WEB-INF/views/layout/nav.jsp"%>

	<%@ include file="/WEB-INF/views/layout/storeNav.jsp"%>

	<main>
		<div class="name">${vo.name}</div>
		<div></div>
		<div class="prd-img">
			<img width="500" height="500" src="${vo.productImg}" alt="">
		</div>
		<div class="detail">
			<p class="prd-price">
				<span id="prod-price">${vo.price}</span><span>원</span>
			</p>
			<div class="sep1"></div>
			<dl>
				<dt>상품구성</dt>
				<dd>${vo.name}</dd>
				<dt>유효기간</dt>
				<dd>구매일로부터 1년</dd>
				<dt>원산지</dt>
				<dd>${vo.type}(${vo.originCountry})</dd>
				<dt>상품교환</dt>
				<dd>
					<a href="">각 매장 스토어</a>
				</dd>
			</dl>
			<div class="sep2"></div>
			<div>
				<div class="cnt">
					<dl>
						<dt>개수</dt>
						<dd id="quantity">1</dd>
						<dt id="price">${vo.price}</dt>
						<dd></dd>
					</dl>
					<div class="button-container">
						<button id="increment" onclick="increaseAndMultiply(${vo.price})">+</button>
					</div>
				</div>
				<div class="sep3"></div>
				<div class="total-price">
					<span id="total-price">${vo.price}</span>
				</div>

			</div>
			<div class="buy-btn">
				<button onclick="addToCart(${vo.no})">장바구니</button>

				<button>구매하기</button>
			</div>
		</div>
		<div></div>
		<div></div>
		<section id="image-carousel" class="splide"
			aria-label="Beautiful Images">
			<div class="with">
				<span>이 상품과 함께 본 상품</span>
				<div class="sep4"></div>
			</div>
			<div class="splide__track">
				<ul class="splide__list">
					<li class="splide__slide"><img
						src="/app/resources/img/pop/팝콘사진.jpg"></li>
					<li class="splide__slide"><img
						src="/app/resources/img/pop/팝콘이미지2.jpg"></li>
					<li class="splide__slide"><img
						src="/app/resources/img/pop/팝콘이미지3.jpg"></li>
					<li class="splide__slide"><img
						src="/app/resources/img/pop/팝콘이미지4.jpg"></li>
					<li class="splide__slide"><img
						src="/app/resources/img/pop/팝콘이미지5.jpg"></li>
					<li class="splide__slide"><img
						src="/app/resources/img/pop/팝콘이미지6.jpg"></li>
					<li class="splide__slide"><img
						src="/app/resources/img/pop/팝콘이미지7.jpg"></li>
					<li class="splide__slide"><img
						src="/app/resources/img/pop/팝콘이미지8.jpg"></li>
				</ul>
			</div>
		</section>
		<div></div>
	</main>

	<%@ include file="/WEB-INF/views/layout/footer.jsp"%>
</body>

</html>