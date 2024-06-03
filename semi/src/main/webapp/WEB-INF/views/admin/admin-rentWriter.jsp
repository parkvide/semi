<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/app/resources/css/admin/admin-rentWriter.css">
</head>
<body>
	<div id="view">
		<%@ include file="/WEB-INF/views/layout/admin/sidebar.jsp"%>

		<div id="main">
			<%@ include file="/WEB-INF/views/layout/admin/nav.jsp"%>


			<div id="list">
				<div id="name">
					<span>대관문의 작성</span>
				</div>
				<div class="line"></div>
				<div id="title">
					<div>제목 : <input type="text" value="${adminVoList.title}"></div>
					<div>대관 문의 날짜 : <input type="text" value="${adminVoList.rentalDate}"></div>
					<div>내 용 : <input type="text" value="${adminVoList.content}"></div>
				</div>
				<div id="content">
					<div class="line"></div>
					<form action="/app/admin/rent/writer" method="post">
						<input type="hidden" name="no" value="${adminVoList.no}">
						<div>제목</div>
						<div><input type="text"  name="answerTitle" id="rentTitle"></div>
						<div>내용</div>
						<div><textarea name="answerContent" id="rentcontent"></textarea></div>
						<div><input type="submit" value="작성하기" id="button"></div>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>