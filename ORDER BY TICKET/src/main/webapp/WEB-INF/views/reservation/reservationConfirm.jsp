<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>예매내역 확인 페이지</title>
	<link rel="stylesheet" href="/resources/css/reservationConfirm.css">

</head>
	
<body>

	<!-- --------------------------------header--------------------------------------- -->
	<div id="header" >
		<h2 style="background-color:lightgrey; color:white; text-align:center" >HEADER SECTOR</h2>
	</div>
	<hr>
	<div id="session_id">
		<a href="">${sessionMember_id}</a>님! 환영합니다!
	</div>
	
	<div id="nav">
		<h2 style="background-color:darkgrey; color:white; text-align:center">NAV SECTOR</h2>
		<h2 style="background-color:darkgrey; color:white; text-align:center">
			<a href="/">홈</a>
			<a href="/member/login">로그인</a>
			<a href="/member/signup">회원가입</a>
			<a href="/reservation/mailSend">메일 발송</a>
			<a href="/movie/movieInform">영화 정보</a>
			<a href="/reservation/movieChoice">티켓예매</a>
			<a href="/reservation/reservationConfirm">예매내역</a>
		</h2>
	</div>
	
	<!-- --------------------------------nav--------------------------------------- -->
	<div id="section" style="text-align:center;">
		<span style="background-color:lightgrey; color:white; text-align:center">SECTION1</span>
		<span style="background-color:lightgrey; color:white; text-align:center">SECTION2</span>
		<span style="background-color:lightgrey; color:white; text-align:center">SECTION3</span>
		<span style="background-color:lightgrey; color:white; text-align:center">SECTION4</span>
	</div>
	<!-- --------------------------------body--------------------------------------- -->
	<div id="bodyscreen" style="width:100%; height:600px;">
		<div id="screen1">
			<iframe src="user.html" style="width:200; height:600px; border: 3px dashed maroon"></iframe>
		</div>
		<div id="screen2">
			<div id="body" style="height:600px; border:3px dashed maroon">바디부분-예매내역 확인
				<div id="reservationTable">
					<table class="reservationTable">
						<tr>
							<th>예약번호</th>
							<th>영화제목</th>
							<th>예매아이디</th>
							<th>상영날짜</th>
							<th>예매날짜</th>
							
						</tr>
						
						<tbody>
							<c:forEach items="${reservationList}" var="reservationList">
								<td>${reservationList.reservation_no}</td>
								<td>${reservationList.movie_name}</td>
								<td>${reservationList.member_id}</td>
								<td>${reservationList.s_date}</td>
								<td>${reservationList.reservation_nowdate}</td>
								
							</c:forEach>
						</tbody>	
					</table>					
				</div>
			</div>
		</div>
		
	</div>
	<!-- --------------------------------footer--------------------------------------- -->
	<div id="footer">
		<span style="border:3px solid red; text-align:center">BOTTOM SECTOR</span>
	</div>
	
</body>
</html>
