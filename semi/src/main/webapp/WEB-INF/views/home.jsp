<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        <div class="video">
           	<iframe class="iframe" width="1650" height="315" src="https://www.youtube.com/embed/pMAPj6WVsT4" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
        </div>
        <div class="description">
            <h1>범죄도시 4</h1>
            <h3>메인 예고</h3>
            <p>
                4월 국경도 영역도 제한 없다. 싹 쓸어버린다
            </p>
            <div class="buttons">
                <button class="play"><i class="fa-regular fa-credit-card"></i><span>예매</span></button>
                <button class="detail"><i class="fa-solid fa-circle-info"></i>상세 정보</button>
            </div>
        </div>
       
    </main>
    <section>
        <div class="content-list">
            <h1>무비 차트</h1>
            <div class="slider">
            <img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/꼬마참새 리차드 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/내손끝에 너의 온도가 닿을때 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/디피컬트 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/모드 집에서의 하룻밤 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/별처럼 빛나는 너에게 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/비행사의 아내 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/클레르의 무릎 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
            
            </div>
            <div class="prev"><i class="fa-solid fa-angle-right prev-arrow"></i></div>
            <div class="next"><i class="fa-solid fa-angle-right"></i></div>
        </div>
        <div class="content-list">
        <h1>이벤트</h1>
        	<div class="slider">
        	<img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
            <img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
        	</div>
        	<div class="prev"><i class="fa-solid fa-angle-right prev-arrow"></i></div>
            <div class="next"><i class="fa-solid fa-angle-right"></i></div>
        </div>
        <div class="content">
         <h1>패키지 및 상품</h1>
         <br>
        	<ul class="prodview">
        	
        		<li>
        			<div class="package">
        			<h2>패키지</h2>
        			<div><a href="#"><img width="150" height="150" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt=""></a></div>
        			<div> dkdkd</div>
        			<div><a href="#"><img width="150" height="150" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt=""></a></div>
        			<div>adaa</div>
        			<div><a href="#"><img width="150" height="150" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt=""></a></div>
        			<div>adada</div>
        			
        			</div>
        		</li>
        		<li>
        			<div class="gift-ticket">
        			<img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
        			</div>
        		</li>
        		<li>
        			<div class="food">
        			<img width="300" height="400" src="/app/resources/img/포스터/범죄의도시4 포스터.jpg" alt="">
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