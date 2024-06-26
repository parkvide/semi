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
<link rel="stylesheet" href="/app/resources/css/service/detail.css">
<script defer src="/app/resources/js/service/service.js"></script>

<%@ include file="/WEB-INF/views/layout/util.jsp"%>
</head>

<body>

	<%@ include file="/WEB-INF/views/layout/nav.jsp"%>

	<div class="thick-line"></div>
	<!-- 두꺼운 줄 -->
	<div class="thin-line"></div>
	<!-- 얇은 줄 -->

	<div class="main">
		<main>
			<div class="side"></div>
			<div id="main">

				<div id="top">
					<span>공지사항</span>
					<div id="line"></div>
				</div>
				<div id="side-category">
					<div>
						<a href="/app/board/faqlist" class="ca">자주찾는질문</a>
					</div>
					<div>
						<a href="/app/board/noticelist" class="ca">공지사항</a>
					</div>
					<div>
						<a href="/app/board/rentlist" class="ca">대관문의</a>
					</div>
					<div>
						<a href="/app/board/eventlist" class="ca">이벤트</a>
					</div>
					<a id="ca" href=""> <img src="/app/resources/img/광고1.png"
						alt="">
					</a>
				</div>
				<div id="main-list">
					<div id="search">
						<span id="title">공지사항</span>
					</div>


					<div id="list">
						<div style="font-weight: bolder;">${noticeVo.title}</div>
						<div style="display: flex; justify-content: end;">${noticeVo.uploadDate}</div>
						<div>${noticeVo.views}</div>
						<div>
							<table>
								<tr>
									<th>내용</th>
									<td>${noticeVo.content}</td>
								</tr>
							</table>
						</div>
					</div>



				</div>
				<div class="side"></div>
			</div>
		</main>
	</div>

	<%@ include file="/WEB-INF/views/layout/footer.jsp"%>
</body>

</html>