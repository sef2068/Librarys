<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 4월 8일 -->
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="../css/style.css">
  <link rel="stylesheet" href="../css/notice_list.css">
</head>
<body>
  <header>
    <ul>
      <li>회원가입</li> <span>|</span>
      <li>로그인</li> <span>|</span>
    </ul>
  </header>

  <nav>
    <div class="logo"></div>
    
    <div class="nav-menu">
      <ul>
        <li>도서관소개</li>
        <li>공지사항</li>
        <li>도서검색</li>
        <li>스터디룸예약</li>
        <li>이용안내</li>
      </ul>  
    </div>
  </nav>

  <section>
    <h1>공지사항</h1>
    <table>
      <colgroup>
        <col width="18%">
        <col width="60%">
        <col width="18%">
      </colgroup>
      <tr>
        <th>No.</th>
        <th>제목</th>
        <th>작성일</th>
      </tr>
      <tr>
        <td><span class="table-notice">NOTICE</span></td>
        <td class="table-title">홈페이지 개인정보 보안 강화</td>
        <td>2018-11-14</td>
      </tr>
        <c:forEach var="dto" items="${list}">
      <tr>
        <td><span class="table-notice">${dto.nt_num}</span></td>
        <td class="table-title">${dto.nt_title }</td>
        <td><span class="table-notice">${dto.nt_date }</span></td>
      </tr>
      </c:forEach>
      <tr>
        <td>5</td>
        <td class="table-title">[키즈잼] 3월 프로그램 안내</td>
        <td>2020-02-18</td>
      </tr>
      <tr>
        <td>4</td>
        <td class="table-title">[키즈잼] 2월 프로그램 안내</td>
        <td>2020-01-17</td>
      </tr>
      <tr>
        <td>3</td>
        <td class="table-title">마이다스 멤버쉽 안내</td>
        <td>2019-05-08</td>
      </tr>
      <tr>
        <td>2</td>
        <td class="table-title">[마이다스 호텔&리조트] 제23회 경기건축문화 금상 수상</td>
        <td>2018-10-10</td>
      </tr>
      <tr>
        <td>1</td>
        <td class="table-title">카카오플러스 친구 오픈</td>
        <td>2018-07-11</td>
      </tr>
    </table>

    <ul class="page-num">
      <li class="first"></li>
      <li class="prev"></li>
      <li class="num">
        <div>1</div>
      </li>
      <li class="next"></li>
      <li class="last"></li>
    </ul>
  </section>

  <footer>
    <div class="wrapper">
      <div class="footer-left">
        <div class="footer-logo"></div>
        <div class="copyright">© COOKIT ALL RIGHTS RESERVED</div>
      </div>
  
      <div class="footer-center">
        <ul class="footer-nav">
          <li class="first-list">이용약관</li>
          <li class="green">개인정보처리 방침</li>
          <li>법적고지</li>
          <li>사업자정보 확인</li>
        </ul>
  
        <ul class="footer-info">
          <li class="first-list">씨제이제일제당(주)</li>
          <li>대표이사 : 손경식,강신호,신현재</li>
          <li>사업자등록번호 : 104-86-09535</li>
          <li class="first-list">주소 : 서울 중구 동호로 330 CJ제일제당 센터 (우) 04560</li>
          <li>통신판매업신고 중구 제 07767호</li>
          <li class="first-list">개인정보보호책임자 : 조영민</li>
          <li>이메일 : cjon@cj.net</li>
          <li>호스팅제공자 : CJ올리브네트웍스㈜</li>
        </ul>
  
        <div id="check">고객님은 안전거래를 위해 현금등으로 결제시 LG U+ 전자 결제의 매매보호(에스크로) 서비스를 이용하실 수 있습니다. <span class="check">가입 사실 확인</span></div>
      </div>
  
      <div class="footer-right">
        <div id="shortcut">
          <span>CJ그룹계열사 바로가기</span>
          <div class="shortcut"></div>
        </div>
  
        <div class="call">고객행복센터 1668-1920</div>
        <div class="inquery">1:1 문의</div>
      </div>
  
    </div>
  </footer>
</body>
</html>