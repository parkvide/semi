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
            <span class="popcorn">영화관람권</span>
            <span class="prd-detail">영화, 모두에게 즐거운 경험</span>
        </div>
        <div class="sep2"></div>
        <ul class="list-style">
        	<c:forEach items="${voList}" var="vo">
	           <li>
	                <a href="/app/store/detail?no=${vo.no}&categoryNo=${vo.categoryNo}">
	                    <span><img height="270" width="270" src="${vo.productImg}" alt=""></span>
	                    <span class="list-title">${vo.name}</span>
	                    <span class="list-name"></span>
	                    <span class="list-price-wrap">
	                        <span class="detail-price">${vo.price}</span>
	                    </span>
	                </a>
	            </li>
            </c:forEach>
         </ul>
    </div>
    <div class="sep2"></div>


       <%@ include file="/WEB-INF/views/layout/footer.jsp" %>
</body>
</html>