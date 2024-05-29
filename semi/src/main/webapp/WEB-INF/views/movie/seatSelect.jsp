<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="/app/resources/css/movie/seatSelect.css">
<script defer src="/app/resources/js/movie/seatSelect.js"></script>
 
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css" integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw==" crossorigin="anonymous" referrerpolicy="no-referrer" />

</head>
<body>
<nav>
        <div class="left">
            <div class="logo">
                <a href="http://127.0.0.1:8888/app/home"><img src="/app/resources/img/logo.png" alt=""></a>
            </div>
            <div class="mobile-menu">�޴�</div>
            <ul class="menu-list">
                <li>
                    <a href="#">��ȭ</a>
                </li>
                <li>
                    <a href="#">��ȭ��</a>
                </li>
                <li>
                    <a href="http://127.0.0.1:8888/app/movie/ticketing">����</a>
                </li>
                <li>
                    <a href="http://127.0.0.1:8888/app/store">�����</a>
                </li>
                <li>
                    <a href="http://127.0.0.1/app/service/home">������</a>
                </li>
            </ul>
        </div>
        <div class="right">
           
            <div class="icon kids">
                <a href="http://127.0.0.1:8888/app/member/login">�α���</a>
            </div>
            <div class="icon bell">
                <a href="http://127.0.0.1:8888/app/member/join">ȸ�� ����</a>
            </div>
            
             <div class="icon search">
                <div class="search-bar">
                    <i class="fa-solid fa-magnifying-glass"></i>
                    <input type="text" placeholder="����, ���, �帣"/>
                </div>
            </div>
        </div>
    </nav>
    <main>
    	<div class="container">
    <div class="title">
        <h2>�ο� / �¼�</h2>
    </div>
    <div class="seats-selection">
        <div>
            <label>�Ϲ�</label>
            <select id="general">
                <option value="0">0</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
            </select>
        </div>
        <div>
            <label>û�ҳ�</label>
            <select id="teen">
                <option value="0">0</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
            </select>
        </div>
        <div>
            <label>���</label>
            <select id="senior">
                <option value="0">0</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
            </select>
        </div>
        <div>
            <label>���</label>
            <select id="special">
                <option value="0">0</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
            </select>
        </div>
    </div>
    <div class="details">
        <p>CGV ��ź | 3�� | �����¼� 150/150</p>
        <p>2024.05.29 (��) 10:05 ~ 12:04</p>
        <button>�󿵽ð� �����ϱ�</button>
    </div>
    <div class="screen">
        <p>SCREEN</p>
    </div>
    <div class="seating-chart">
        <table>
            <!-- Create the rows and columns for seats -->
            <tbody id="seating">
                <!-- Example row (A) -->
                <!-- Add rows and seats here as needed -->
            </tbody>
        </table>
    </div>
    <div class="legend">
        <p>���� <span class="selected"></span> ���� �Ϸ� <span class="booked"></span> ���� �Ұ� <span class="not-available"></span> ����μ� <span class="wheelchair"></span></p>
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
                <div class="option">�ڸ� �� ����</div>
                <div class="option">���� ����</div>
                <div class="option">�� ����</div>
                <div class="option">����Ʈī��</div>
                <div class="option">�̵�� ����</div>
                <div class="option">���� ����(IR)</div>
                <div class="option">�Ի� ����</div>
                <div class="option">�̿� ���</div>
                <div class="option">���� ����</div>
                <div class="option">���� ����</div>
                <div class="option">��Ű ����</div>
                <div class="option">ȸ�� ����</div>
                <div class="option">�����ϱ�</div>
            </div>
        </div>
    </footer>
</body>
</html>