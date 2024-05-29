<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
            integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
            crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="/app/resources/css/service/service-evt.css">
         <%@ include file="/WEB-INF/views/layout/util.jsp" %>
    </head>

    <body>
       
        <%@ include file="/WEB-INF/views/layout/nav.jsp" %>

        <div class="thick-line"></div> <!-- 두꺼운 줄 -->
        <div class="thin-line"></div> <!-- 얇은 줄 -->
        
        <main>
            <div class="side"></div>
            <div id="main">
                <div id="top">
                    <span>EVENT</span>
                    <div id="line"></div>
                    <div id="category">
                        <div><a href="" id="ca-1">SPECIAL</a></div>
                        <div><a href="" class="ca-2">영화/예매</a></div>
                        <div><a href="" class="ca-2">제휴할인</a></div>
                    </div>
                </div>
                <div id="menu">
                    <a class="evt-img" href="">
                        <img src="/app/resources/img/테스트123.PNG" alt="">
                        <span>글씨</span>
                    </a>
                    <a class="evt-img" href="">
                        <img src="/app/resources/img/테스트123.PNG" alt="">
                        <span>글씨</span>
                    </a>
                    <a class="evt-img" href="">
                        <img src="/app/resources/img/테스트123.PNG" alt="">
                        <span>글씨</span>
                    </a>
                    <a class="ad" href="">
                        <img src="/app/resources/img/광고1.png" alt="">
                    </a>
                    <a class="evt-img" href="">
                        <img src="/app/resources/img/테스트123.PNG" alt="">
                        <span>글씨</span>
                    </a>
                    <a class="evt-img" href="">
                        <img src="/app/resources/img/테스트123.PNG" alt="">
                        <span>글씨</span>
                    </a>
                    <a class="evt-img" href="">
                        <img src="/app/resources/img/테스트123.PNG" alt="">
                        <span>글씨</span>
                    </a>
                    <a class="ad" href="">
                        <img src="/app/resources/img/광고2.png" alt="">
                    </a>
                    <a class="evt-img" href="">
                        <img src="/app/resources/img/테스트123.PNG" alt="">
                        <span>글씨</span>
                    </a>
                    <a class="evt-img" href="">
                        <img src="/app/resources/img/테스트123.PNG" alt="">
                        <span>글씨</span>
                    </a>
                    <a class="evt-img" href="">
                        <img src="/app/resources/img/테스트123.PNG" alt="">
                        <span>글씨</span>
                    </a>
                </div>
            </div>
            <div class="side"></div>
        </main>

      <%@ include file="/WEB-INF/views/layout/footer.jsp" %>
      
    </body>

    </html>