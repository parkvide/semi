<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
            integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
            crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="/app/resources/css/service/serviceHome.css">
        <script defer src="/app/resources/js/service/service.js"></script>
        
        <%@ include file="/WEB-INF/views/layout/util.jsp" %>
    </head>

    <body>
        
        <%@ include file="/WEB-INF/views/layout/nav.jsp" %>
        
        <div class="thick-line"></div> <!-- 두꺼운 줄 -->
        <div class="thin-line"></div> <!-- 얇은 줄 -->
        
        <div class="main">
            <main>
                <div id="side-bar">
                    <div id="menu-box">
                        <div class="line-1">고객센터</div>
                        <div class="line"></div>
                        <div class="tag"><a href="">자주찾는질문</a></div>
                        <div class="tag"><a href="">공지사항</a></div>
                        <div class="tag"><a href="">대관문의</a></div>
                        <div class="tag"><a href="">이벤트</a></div>
                        <div id="tag2"><a href=""><img id="src" src="/app/resources/img/범죄의도시4 포스터.jpg" alt=""></a></div>
                    </div>
                </div>
                <div id="search-main">
                    <div id="search-top">
                        <div><img class="search-logo" src="/app/resources/img/대관.png" alt=""><a href="">대관문의 바로가기</a></div>
                        <div><img class="search-logo" src="/app/resources/img/공지사항.png" alt=""><a href="">공지사항 바로가기</a>
                        </div>
                        <div><img class="search-logo" src="/app/resources/img/자주찾는질문.png" alt=""><a href="">자주찾는질문 바로가기</a>
                        </div>
                    </div>
                    <div id="search-botm">
                        <div id="btom-1">
                            <span>자주찾는 서비스</span>
                            <div>
                                <a href="">아이디/
                                    <br>비밀번호 찾기
                                </a>
                                <span>></span>
                            </div>
                            <div>
                                <a href="">예매/
                                    <br>취소내역 확인
                                </a>
                                <span>></span>
                            </div>
                            <div>
                                <a href="">
                                    스토어 바로가기
                                </a>
                                <span>></span>
                            </div>
                        </div>
                        <div id="btom-2">
                            <span>이벤트/공지</span>
                            <ul>
                                <li>
                                    <a href="">범죄도시 천만관객</a>
                                    <span>날짜</span>
                                </li>
                                <li>
                                    <a href="">범죄도시 천만관객</a>
                                    <span>날짜</span>
                                </li>
                                <li>
                                    <a href="">범죄도시 천만관객</a>
                                    <span>날짜</span>
                                </li>
                                <li>
                                    <a href="">범죄도시 천만관객</a>
                                    <span>날짜</span>
                                </li>
                                <li>
                                    <a href="">범죄도시 천만관객</a>
                                    <span>날짜</span>
                                </li>
                                <li>
                                    <a href="">범죄도시 천만관객</a>
                                    <span>날짜</span>
                                </li>
                            </ul>
                        </div>
    
                    </div>
                </div>
            </main>
        </div>
        
    <%@ include file="/WEB-INF/views/layout/footer.jsp" %>
    </body>

    </html>