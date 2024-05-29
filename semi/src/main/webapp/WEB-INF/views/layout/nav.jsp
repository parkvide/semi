<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <nav>
        <div class="left">
            <div class="logo">
                <a href="#"><img src="/app/resources/img/logo.png" alt=""></a>
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
                    <a href="/app/service/home">고객센터</a>
                </li>
            </ul>
        </div>
        <div class="right">
        <c:choose>
           <c:when test="${sessionScope.loginMemberVo != null}">
	            <div class="icon kids">
	                <a href="/app/member/editHome">마이페이지</a>
	            </div>
	            <div class="icon bell">
	                <a href="/app/member/logout">로그아웃</a>
	            </div>
           </c:when>
            <c:otherwise>
	              <div class="icon kids">
	                <a href="/app/member/login">로그인</a>
	            </div>
	            <div class="icon bell">
	                <a href="/app/member/join">회원가입</a>
	            </div>
            </c:otherwise>
        </c:choose>
             <div class="icon search">
                <div class="search-bar">
                    <i class="fa-solid fa-magnifying-glass"></i>
                    <input type="text" placeholder="제목, 사람, 장르"/>
                </div>
            </div>
        </div>
</nav>