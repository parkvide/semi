<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
      integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
      crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="/app/resources/css/service/detail.css">
    <script defer src="/app/resources/js/service/service.js"></script>

    <%@ include file="/WEB-INF/views/layout/util.jsp" %>
  </head>

  <body>

    <%@ include file="/WEB-INF/views/layout/nav.jsp" %>

      <div class="thick-line"></div> <!-- 두꺼운 줄 -->
      <div class="thin-line"></div> <!-- 얇은 줄 -->

      <div class="main">
        <main>
          <div class="side"></div>
          <div id="main">

            <div id="top">
              <span>자주찾는질문</span>
              <div id="line"></div>
            </div>
            <div id="side-category">
              <div><a href="" class="ca">자주찾는질문</a></div>
              <div><a href="" class="ca">공지사항</a></div>
              <div><a href="" class="ca">대관문의</a></div>
              <div><a href="" class="ca">이벤트</a></div>
              <a id="ca" href="">
                <img src="/app/resources/img/광고1.png" alt="">
              </a>
            </div>
            <div id="main-list">
              <div id="search">
                <span id="title">자주찾는질문</span>
                
              </div>
              <div id="list">
              <span>${vo.title}</span><span>${vo.uploadDate}</span><span>${vo.views}</span>
              <div class="sep"></div>
			  <div class="title">
			  	<span>${vo.content}</span>
			  </div>			
              </div>
            </div>
            <div class="side"></div>
            </div>
        </main>
      </div>

      <%@ include file="/WEB-INF/views/layout/footer.jsp" %>
  </body>

  </html>