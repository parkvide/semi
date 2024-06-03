<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/app/resources/css/movie/ticketInfo.css">
<script defer src="/app/resources/js/movie/ticketInfo.js"></script>
 
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css" integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<%@ include file="/WEB-INF/views/layout/util.jsp"%>
</head>
<body>
	
	<%@ include file="/WEB-INF/views/layout/nav.jsp"%>
	
	<main>	
		  <div class="container">
		    <div class="edit">
		      <img style="height:100px " class="search-logo" src="/app/resources/img/ticket.png" alt="">
		      <h1>예매가 되었습니다</h1>
		      <hr><hr>
			<table>
			<tr>
				<th>영화 제목</th>
				<td id="title"></td>
			</tr>
			<tr>
				<th>영화관</th>
				<td id="cinema"></td>
			</tr>
			<tr>
				<th>상영관</th>
				<td id="theater"></td>
			</tr>
			<tr>
				<th>좌석</th>
				<td id="seat"></td>
			</tr>
			<tr>
				<th>청소년 인원</th>
				<td id="teen"></td>
			</tr>
			<tr>
				<th>성인 인원</th>
				<td id="general"></td>
			</tr>
			<tr>
				<th>상영 날짜</th>
				<td id="date"></td>
			</tr>
			<tr>
				<th>상영 시간</th>
				<td id="time"></td>
			</tr>
			<tr>
				<th>총 가격</th>
				<td id="price"></td>
			</tr>
			</table>
		     
		    </div>
		  </div>
		

	</main>

	<%@ include file="/WEB-INF/views/layout/footer.jsp"%>
	
</body>
</html>