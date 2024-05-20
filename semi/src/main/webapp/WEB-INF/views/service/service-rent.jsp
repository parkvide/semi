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

        <main>
            <div class="side"></div>
            <div id="main">
                <div id="top">
                    <span>대관문의</span>
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
                    <span id="title">단체/대관문의</span>
                    <span id="content">
                      개인이나 단체를 위한 대관서비스로 Four's의 넓고 쾌적한 극장에서 즐거운 추억을 만드실 수 있습니다
                      <br>단체/대관 문의 외 문의나 불편한 사항은 게시글 문의로 작성 부탁드립니다
                    </span>
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
        </main>
        

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