<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
      integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
      crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="/app/resources/css/cinema/cinema.css">
    <script src="/app/resources/js/cinema.js"></script>
    <!-- <script defer src="/app/resources/js/home.js"></script> -->
    <!-- <script  src="/app/resources/js/store.js"></script> -->

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
            <a href="/app/store">스토어</a>
          </li>
          <li>
            <a href="#">고객센터</a>
          </li>
        </ul>
      </div>
      <div class="right">

        <div class="icon-kids">
          <a href="http://127.0.0.1:8888/app/member/login">로그인</a>
        </div>
        <div class="icon-bell">
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
      <div class="left"></div>
      <div class="cinema">
        <div class="cinema_loc">
          <ul>
            <li><a href="">서울</a></li>
            <li><a href="">경기</a></li>
            <li><a href="">인천</a></li>
            <li><a href="">강원</a></li>
            <li><a href="">대전/충청</a></li>
            <li><a href="">대구</a></li>
            <li><a href="">부산/울산</a></li>
            <li><a href="">경상</a></li>
            <li><a href="">광주/전라/제주</a></li>
          </ul>
        </div>
        <div class="cinema_name">
          <ul>
            <li><a href="">강남</a></li>
            <li><a href="">강변</a></li>
            <li><a href="">건대입구</a></li>
            <li><a href="">구로</a></li>
            <li><a href="">대학로</a></li>
            <li><a href="">동대문</a></li>
            <li><a href="">등촌</a></li>
            <li><a href="">명동</a></li>
            <li><a href="">명동역 씨네라이브러리</a></li>
            <li><a href="">미아</a></li>
            <li><a href="">방학</a></li>
            <li><a href="">블광</a></li>
            <li><a href="">상봉</a></li>
            <li><a href="">성신여대입구</a></li>
            <li><a href="">송파</a></li>
            <li><a href="">수유</a></li>
            <li><a href="">신촌아트레온</a></li>
            <li><a href="">압구정</a></li>
            <li><a href="">여의도</a></li>
            <li><a href="">연남</a></li>
            <li><a href="">영등포</a></li>
            <li><a href="">왕십리</a></li>
            <li><a href="">용산아이파크몰</a></li>
            <li><a href="">중계</a></li>
            <li><a href="">천호</a></li>
            <li><a href="">청담씨네시티</a></li>
            <li><a href="">피카디리1958</a></li>
            <li><a href="">하계</a></li>
            <li><a href="">홍대</a></li>
            <li><a href="">용사아안</a></li>
          </ul>
        </div>
        <div class="cinema_img">
          <img src="/app/resources/img/cinema.jpg" alt="Cinema Image">
        </div>
        <span class="name">FOURS 강남</span>
        <button class="rent-btn">대관문의</button>
        <div class="cinema_img">

          <img src="/app/resources/img/지점사진/강남.jpg" alt="강남 Cinema Image">
        </div>
        <div class="cinema_detail">
          <div class="address">
            
            <pre>
              <h3>
                  서울특별시 강남구 역삼동 814-6 스타플렉스 
                  서울특별시 강남구 강남대로 438 (역삼동)
                  1544-1122
                  6관 / 874석
              </h3>
            </pre>
          </div>
          <div class="parking_detail">
            <pre>
          # 주차정보
          - 위치: 건물 지하2F ~ 지하4F

          # 주차요금
          - CGV 영화 관람 시 주차 3시간 6,000원
          - 주차시간 (3시간) 초과 시 10분 당 1,000원
          ※ 발렛서비스 운영시간 : 오전 8시 이후 ~ 오후 20시

          ※ 발렛 무료 서비스는 영화 관람 고객 한 함. (영화 미관람 시 건물 주차장에서 별도 정산)
          ※ 20시 이후 입차 차량은 발렛서비스 이용이 제한될 수 있으며, 별도 운영되는 주차팀의 사정에 따라 변경될 수 있습니다.

          # 이용안내
          - 주차공간이 협소하여 평일 오후/주말은 주차가 어렵습니다.
          - 편리한 대중교통 이용을 이용하여 주시기 바랍니다.
            </pre>
          </div>
        </div>
      </div>
      <div class="right"></div>


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