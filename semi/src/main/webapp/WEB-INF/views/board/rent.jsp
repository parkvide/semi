<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
            integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
            crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="/app/resources/css/service/service-rent.css">
        <script defer src="/app/resources/js/service/service.js"></script>
        <%@ include file="/WEB-INF/views/layout/util.jsp" %>
    </head>

    <body>
        
        <%@ include file="/WEB-INF/views/layout/nav.jsp" %>

        <main>
            <div class="side"></div>
            <div id="main">
                <div id="top">
                    <span>대관문의</span>
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
                    <span id="title">단체/대관문의</span> 
                    <span id="content">
                      개인이나 단체를 위한 대관서비스로 Four's의 넓고 쾌적한 극장에서 즐거운 추억을 만드실 수 있습니다
                      <br>단체/대관 문의 외 문의나 불편한 사항은 게시글 문의로 작성 부탁드립니다 <br> 
                      <br>
                      <button style="width: 120px;color: black;" onclick="location.href='/app/board/rent/insert'">문의하기</button>
                    </span>
                  </div>
                  <br>
                  <br>
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
                          <c:forEach items="${rentVoList}" var="vo">
                              <tr>
                                  <td>${vo.no}</td> 
                                  <td><a href="/app/board/rent/detail?no=${vo.no}">${vo.title}</a></td> 
                                  <td>${vo.uploadDate}</td> 
                                  <td>${vo.views}</td> 
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