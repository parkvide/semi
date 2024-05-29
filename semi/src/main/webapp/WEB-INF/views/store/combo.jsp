<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css" integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="/app/resources/css/store/store.css">
<!-- <script defer src="/app/resources/js/home.js"></script> -->
<!-- <script  src="/app/resources/js/store.js"></script> -->
<%@ include file="/WEB-INF/views/layout/util.jsp" %>

</head>
<body>

	<%@ include file="/WEB-INF/views/layout/nav.jsp" %>
	
    <main>
        <div class="video">
           	<iframe class="iframe" width="1650" height="315" src="https://www.youtube.com/embed/pMAPj6WVsT4" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
        </div>
        <div class="description">
            <h1>범죄도시 4</h1>
            
            <div class="buttons">
                <button class="play"><i class="fa-regular fa-credit-card"></i><span>예매</span></button>
                <button class="detail"><i class="fa-solid fa-circle-info"></i>상세 정보</button>
            </div>
        </div>
       
    </main>
    
    <%@ include file="/WEB-INF/views/layout/storeNav.jsp" %>
    
    <div class="prd-list">
        <div class="prd-title">
            <span class="popcorn">콤보</span>
            <span class="prd-detail">맛있으면 0칼로리, 아는 맛이 제일 맛있어요</span>
        </div>
        <div class="sep2"></div>
        <ul class="list-style">
            <li>
                <a href="">
                    <span><img height="270" width="270" src="vo의 이미지" alt=""></span>
                    <span class="list-title">vo.이름? 타입</span>
                    <span class="list-name">vo.디테일</span>
                    <span class="list-price-wrap">
                        <span class="detail-price">vo.가격</span>
                    </span>
                </a>
            </li>
            <li>
                <a href="">
                    <span><img height="270" width="270" src="/app/resources/img/콤보/더블콤보.jpg" alt=""></span>
                    <span class="list-title">더블콤보</span>
                    <span class="list-name">팝콘(M)2+탄산(M)2</span>
                    <span class="list-price-wrap">
                        <span class="detail-price">13,000원</span>
                    </span>
                </a>
            </li>
        </ul>
    </div>
    <div class="sep2"></div>

	<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
    
</body>
</html>