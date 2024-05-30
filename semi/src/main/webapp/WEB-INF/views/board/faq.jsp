<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
            integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
            crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="/app/resources/css/service/service-faq.css">
        <script defer src="/app/resources/js/service/service.js"></script>
        <%@ include file="/WEB-INF/views/layout/util.jsp" %>
    </head>

    <body>
        
        <%@ include file="/WEB-INF/views/layout/nav.jsp" %>

        <main>
            <div class="side"></div>
            <div id="main">
                <div id="top">
                    <span>자주찾는질문</span>
                    <div id="line"></div>
                </div>
                <div id="side-category">
                        <div><a href="/app/board/faqlist" class="ca">자주찾는질문</a></div>
                        <div><a href="/app/board/noticelist" class="ca">공지사항</a></div>
                        <div><a href="/app/board/rentlist" class="ca">대관문의</a></div>
                        <div><a href="/app/board/eventlist" class="ca">이벤트</a></div>
                        <a id="ca" href="">
                            <img src="/app/resources/img/광고1.png" alt="">       
                        </a>
                </div>
                <div id="main-list">
                  <div id="search">
                    <span id="title">자주찾는질문</span>
                    <span id="content">회원님들께서 가장 자주 검색하시는 질문을 모았습니다 
                      <br> 궁금하신 내용에 대해 검색해보세요</span>
                      <div id="search-1">
                        <input type="text" name="title" value="검색어를 입력하세요">
                        <input type="submit" value="검색">
                      </div>
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
                                  <td>${vo.no}</td> <!-- 여기 자바코드 -->
                                  <td><a href="/app/board/faq/detail?no=${vo.no}">${vo.title}</a></td> <!-- 여기 자바코드 -->
                                  <td>${vo.uploadDate}</td> <!-- 여기 자바코드 -->
                                  <td>${vo.views}</td> <!-- 여기 자바코드 -->
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