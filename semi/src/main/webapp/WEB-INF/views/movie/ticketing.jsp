<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="/app/resources/css/movie/ticketing.css">
<script defer src="/app/resources/js/movie/ticketing.js"></script>
 
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css" integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<nav>
        <div class="left">
            <div class="logo">
                <a href="http://127.0.0.1:8888/app/home"><img src="/app/resources/img/logo.png" alt=""></a>
            </div>
            <div class="mobile-menu">�޴�</div>
            <ul class="menu-list">
                <li>
                    <a href="#">��ȭ</a>
                </li>
                <li>
                    <a href="#">��ȭ��</a>
                </li>
                <li>
                    <a href="http://127.0.0.1:8888/app/movie/ticketing">����</a>
                </li>
                <li>
                    <a href="http://127.0.0.1:8888/app/store">�����</a>
                </li>
                <li>
                    <a href="http://127.0.0.1/app/service/home">������</a>
                </li>
            </ul>
        </div>
        <div class="right">
           
            <div class="icon kids">
                <a href="http://127.0.0.1:8888/app/member/login">�α���</a>
            </div>
            <div class="icon bell">
                <a href="http://127.0.0.1:8888/app/member/join">ȸ�� ����</a>
            </div>
            
             <div class="icon search">
                <div class="search-bar">
                    <i class="fa-solid fa-magnifying-glass"></i>
                    <input type="text" placeholder="����, ���, �帣"/>
                </div>
            </div>
        </div>
    </nav>
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
				<!-- date �� -->


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

					<!-- �޾ƿ� ��ȭ���� -->
					
					<!-- ��ȭ���� ���� -->
					<div class="sname s">
						<table class="sul">
						<c:forEach items="${requestScope.voList}" var="vo">
								<tr class="movietitle">
									<td class="mtd1"><button class="titlebtn">${vo.title}</button></td>
								</tr>
						</c:forEach>
						</table>
					</div>


					<!-- ��ȭ �������� -->
					<div class="s s1">
						<table class="sul" id="theaterNameSelect">
						<c:forEach items="${requestScope.voList}" var="vo">
							
								<tr class="loc">
									<td class="mtd"></td>
								<tr>
							</c:forEach>
						</table>
					</div>



					<!-- ��ȭ ������ ���� ��ȭ�� ���� -->
					<div class="s3 s2">
						<table class="sul" id="cinemaNameSelect">
						</table>
					</div>


					<!-- ��¥����  -->
					<div class="s s4">
					<img class="corn3" alt="" src="/app/resources/img/pop_cornT.png">
						<table class="sul" id="movieDateSelect">
							<tr>
							<button class="btn1"></button>
							<button class="btn2"></button>
							<button class="btn3"></button>
							<button class="btn4"></button>
							<button class="btn5"></button>
							<button class="btn6"></button>
							<button class="btn7"></button>
							</tr>
						</table>
					</div>


					<!-- �ð�����  -->
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
		<footer>
        <div class="wrap">
            <div class="social-icons">
                <i class="fa-brands fa-facebook-square"></i>
                <i class="fa-brands fa-instagram"></i>
                <i class="fa-brands fa-twitter"></i>
                <i class="fa-brands fa-youtube"></i>
            </div>
            <div class="options">
                <div class="option">�ڸ� �� ����</div>
                <div class="option">���� ����</div>
                <div class="option">�� ����</div>
                <div class="option">����Ʈī��</div>
                <div class="option">�̵�� ����</div>
                <div class="option">���� ����(IR)</div>
                <div class="option">�Ի� ����</div>
                <div class="option">�̿� ���</div>
                <div class="option">���� ����</div>
                <div class="option">���� ����</div>
                <div class="option">��Ű ����</div>
                <div class="option">ȸ�� ����</div>
                <div class="option">�����ϱ�</div>
            </div>
        </div>
    </footer>


</body>
</html>