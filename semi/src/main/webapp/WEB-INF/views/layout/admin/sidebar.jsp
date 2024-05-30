<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div id="side-bar">
	<ul>
		<li id="side-menu"><img src="/app/resources/img/logo.png" alt=""></li>
		<li class="side-menu"><a href="/app/admin/home">관리자 메인</a></li>
		<li class="side-menu"><a href="/app/admin/member">회원 목록</a></li>
		<li class="side-menu"><a href="/app/admin/ticketing">예매 리스트</a></li>
		<li class="side-menu"><a href="/app/admin/rent">대관문의</a></li>
		
		
		<li class="side-menu side-menu-movies">영화</li>

		<div class="menu-lists hidden">
			<li class="side-menu menu-list"><a href="/app/admin/movie/list">영화
					목록</a></li>
			<li class="side-menu menu-list"><a
				href="/app/admin/movie/insert">영화 등록</a></li>
			<li class="side-menu menu-list"><a href="/app/admin/movie/timeinsert">상영시간
					등록</a></li>
			<li class="side-menu menu-list"><a
				href="/app/admin/movie/timelist">상영시간 목록</a></li>
		</div>

		<li class="side-menu side-menu-theater">극장</li>

		<div class="theater-lists hidden">
			<li class="side-menu theater-list"><a
				href="/app/admin/cinema/insert">영화관 등록</a></li>
			<li class="side-menu theater-list"><a
				href="/app/admin/cinema/list">영화관 목록</a></li>
			<li class="side-menu theater-list"><a
				href="/app/admin/theater/insert">상영관 등록</a></li>
			<li class="side-menu theater-list"><a
				href="/app/admin/theater/list">상영관 리스트</a></li>
		</div>

		<li class="side-menu side-menu-evt">이벤트</li>

		<div class="evt-lists hidden">
			<li class="side-menu evt-list"><a href="/app/admin/evt/insert">이벤트
					등록</a></li>
			<li class="side-menu evt-list"><a href="/app/admin/evt/list">이벤트
					목록</a></li>
		</div>

		<li class="side-menu side-menu-not">공지사항</li>

		<div class="not-lists hidden">
			<li class="side-menu not-list"><a href="/app/admin/notice/insert">공지사항
					등록</a></li>
			<li class="side-menu not-list"><a href="/app/admin/notice/list">공지사항
					목록</a></li>
		</div>
		
		<li class="side-menu side-menu-faq">자주묻는질문</li>

		<div class="faq-lists hidden">
			<li class="side-menu faq-list"><a href="/app/admin/faq/insert">자주묻는질문
					등록</a></li>
			<li class="side-menu faq-list"><a href="/app/admin/faq/list">자주묻는질문
					목록</a></li>
		</div>

		<li class="side-menu side-menu-store">스토어</li>

		<div class="store-lists hidden">
			<li class="side-menu store-list"><a
				href="/app/admin/store/insert">상품 등록</a></li>
			<li class="side-menu store-list"><a href="/app/admin/store/list">상품
					목록</a></li>
		</div>
	</ul>
</div>


<script defer src="/app/resources/js/admin/sidebar.js"></script>