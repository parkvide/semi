<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
      integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
      crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="/app/resources/css/movie/movieDetail.css">
    <!-- <script src="/app/resources/js/detail/detail.js"></script> -->
    <script src="
    https://cdn.jsdelivr.net/npm/@splidejs/splide@4.1.4/dist/js/splide.min.js
    "></script>
    <link href="
    https://cdn.jsdelivr.net/npm/@splidejs/splide@4.1.4/dist/css/splide.min.css
    " rel="stylesheet">
    <script defer>
      document.addEventListener('DOMContentLoaded', function () {
        new Splide('#image-carousel', {
          perPage: 3,
          perMove: 1,
        }).mount();
      });
    </script>

    <style>
      .splide__slide img {
        width: 200;
        height: 200;
      }
    </style>
  </head>

  <body>
    <nav>
      <div class="left">
        <div class="logo">
          <a href="#"><img src="/app/resources/img/main.png" alt=""></a>
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
        <div class="icon search">
          <div class="search-bar">
            <i class="fa-solid fa-magnifying-glass"></i>
            <input type="text" placeholder="제목, 사람, 장르" />
          </div>
        </div>
        <div class="icon kids">
          <a href="#">로그인</a>
          <a href="#">회원가입</a>
          <a href="#">마이페이지</a>
        </div>
      </div>
    </nav>

    <main>
      <div class="left"></div>
      <div class="prd-img">
        <img width="500" height="500" src="/app/resources/img/포스터/혹성탈출 새로운시대 포스터.webp" alt="">
      </div>
      <div class="detail">
        <p class="movie-title">
          <span>혹성탈출 새로운시대 <button class="disabled-button" disabled>현재상영중</button></span>
        </p>
        <div>
          <span>예매율 ~ | 97%</span>
          <div class="sep1"></div>
        </div>
        <div class="movie-detail">
          <div class="cast">
            <span>감독:조지/배우:누구</span>
          </div>
          <div class="genre">
            <span>액션/기본정보:15세이상관람가,148분,미국</span>
          </div>
          <div class="release">
            <span>2024.05.22</span>
          </div>
          <div class="sep2"></div>
        </div>

        <button onclick="">예매하기</button>
      </div>
      <div class="right"></div>
      <div class="synopsis">
        <h2>줄거리</h2>
        <div class="sep2"></div>
        <br>
        <p>
            지구가 바이러스로 인해 멸망한 이후, 생존자들은 원숭이들과의 마지막 전투를 준비합니다. 
            새로운 리더가 된 시저는 인류와의 평화를 원하지만, 인간들 사이의 배신과 갈등이 깊어지면서 
            전쟁은 불가피해집니다. 과연 시저와 그의 동료들은 이 위기를 어떻게 극복할 것인가?
        </p>
        <div class="reviews">
          <h3>영화 리뷰</h3>
          <ul>
              <li>아이디 : 정말 재미있었습니다!</li>
              <li>아이디 : 기대했던 것보다 훨씬 좋았어요.</li>
              <li>아이디 : 시저의 연기가 대단했습니다.</li>
              <li>아이디 : 스토리가 탄탄하고 흥미진진했어요.</li>
              <li>아이디 : 다시 보고 싶은 영화입니다.</li>
              <li>아이디 : 가족 모두가 즐길 수 있는 영화였어요.</li>
              <li>아이디 : 액션 장면이 매우 인상적이었어요.</li>
              <li>리뷰 8: 다음 시리즈가 기대됩니다.</li>
              <li>리뷰 9: 원작 팬이라면 꼭 보세요.</li>
              <li>리뷰 10: 사운드와 영상미가 훌륭해요.</li>
              <li>리뷰 11: 중반부에 약간 지루했지만 전반적으로 좋았습니다.</li>
              <li>리뷰 12: 배우들의 케미가 돋보였어요.</li>
              <li>리뷰 13: 생각할 거리가 많은 영화입니다.</li>
              <li>리뷰 14: 감독의 연출력이 뛰어났어요.</li>
              <li>리뷰 15: 모든 연령층이 즐길 수 있을 것 같아요.</li>
              <li>리뷰 16: 결말이 아주 인상 깊었어요.</li>
          </ul>
          <div class="review-input">
            <h4>리뷰 작성</h4>
            <form id="review-form">
                <input type="text" placeholder="리뷰를 작성하세요..." id="new-review">
                <button type="submit">제출</button>
            </form>
        </div>
      </div>
    </div>

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