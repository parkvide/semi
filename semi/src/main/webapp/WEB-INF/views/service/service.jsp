<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
            integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
            crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="/app/resources/css/service/service.css">
        <script defer src="/app/resources/js/service/service.js"></script>
    </head>

    <body>
        <nav>
            <div class="left">
                <div class="logo">
                    <a href="#"><img src="/app/resources/img/logo.png" alt=""></a>
                </div>
                <div class="mobile-menu">메뉴</div>
                <ul class="menu-list">
                    <li>
                        <a href="#">영화</a>
                    </li>
                    <li>
                        <a href="#">영화관</a>
                    </li>
                    <li>
                        <a href="#">예매</a>
                    </li>
                    <li>
                        <a href="#">스토어</a>
                    </li>
                    <li>
                        <a href="#">고객센터</a>
                    </li>
                </ul>
            </div>
            <div class="right">

                <div class="icon kids">
                    <a href="http://127.0.0.1:8888/app/member/login">로그인</a>
                </div>
                <div class="icon bell">
                    <a href="#">회원 가입</a>
                </div>

                <div class="icon search">
                    <div class="search-bar">
                        <i class="fa-solid fa-magnifying-glass"></i>
                        <input type="text" placeholder="제목, 사람, 장르" />
                    </div>
                </div>
            </div>
        </nav>

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
        

        <footer>
            <div class="wrap">
                <div class="social-icons">
                    <i class="fa-brands fa-facebook-square"></i>
                    <i class="fa-brands fa-instagram"></i>
                    <i class="fa-brands fa-twitter"></i>
                    <i class="fa-brands fa-youtube"></i>
                </div>
                <div class="options">
                    <div class="option">자막 및 음성</div>
                    <div class="option">음성 지원</div>
                    <div class="option">고객 센터</div>
                    <div class="option">기프트카드</div>
                    <div class="option">미디어 센터</div>
                    <div class="option">투자 정보(IR)</div>
                    <div class="option">입사 정보</div>
                    <div class="option">이용 약관</div>
                    <div class="option">개인 정보</div>
                    <div class="option">법적 고지</div>
                    <div class="option">쿠키 설정</div>
                    <div class="option">회사 정보</div>
                    <div class="option">문의하기</div>
                </div>
            </div>
        </footer>
    </body>

    </html>