<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
            integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
            crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="/app/resources/css/service/service-notice.css">
        <script defer src="/app/resources/js/service/service.js"></script>
        <%@ include file="/WEB-INF/views/layout/util.jsp" %>
    </head>

    <body>
       
       <%@ include file="/WEB-INF/views/layout/nav.jsp" %>
       
        <main>
            <div class="side"></div>
            <div id="main">
                <div id="top">
                    <span>공지사항</span>
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
                    <span id="title">공지사항</span>
                    <span id="content">Four's Movie의 중요한 이슈 및 여러가지 소식들을 확인하실 수 있습니다</span>
                  </div>
                  <div id="list">
                    <table class="list">
                      <thead>
                          <tr>
                              <th>번호</th>
                              <th>제목</th>
                              <th>날짜</th>
                              <th>조회수</th>
                          </tr>
                      </thead>
                      <tbody>
                          <c:forEach items="${voList}" var="vo">
                              <tr>
                                  <td>${vo.number}</td> <!-- 여기 자바코드 -->
                                  <td>${vo.title}</td> <!-- 여기 자바코드 -->
                                  <td>${vo.views}</td> <!-- 여기 자바코드 -->
                                  <td>${vo.date}</td> <!-- 여기 자바코드 -->
                              </tr>
                          </c:forEach>
                      </tbody>
                  </table>
                  
                  </div>
                </div>
            <div class="side"></div>
            </div>
        </main>
        
	<%@ include file="/WEB-INF/views/layout/footer.jsp" %>
       
    </body>

    </html>