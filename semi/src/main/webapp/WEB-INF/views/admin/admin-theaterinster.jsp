<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet"
	href="/app/resources/css/admin/admin-theaterinsert.css">
</head>

<body>

	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp" %>
		
	<div id="main">
		<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


			<div id="list">
				<div id="name">
					<span>극장 등록</span>
					<form action="">
						<input type="text" placeholder="검색"> <select id="category">
							<option>닉네임</option>
							<option>아이디</option>
						</select>
						<button type="submit">🔍</button>
					</form>
				</div>
				<div id="line"></div>
				<div id="list-main">
					<div id="theater">
						<form action="/app/admin/theater/insert" method="post"
							enctype="multipart/form-data">
							<input type="text" name="type" placeholder="이름"> <input
								type="text" name="price" placeholder="가격"> <input
								type="file" name="img" placeholder="관사진"> <input
								type="submit" value="등록하기">
						</form>
					</div>
				</div>
			</div>
		</div>
</body>

</html>