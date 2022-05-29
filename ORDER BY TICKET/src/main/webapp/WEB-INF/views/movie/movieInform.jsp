<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>영화정보 페이지</title>
	
<style type="text/css">
#bodyscreen{
	margin:2%;
	text-align:center;
	align-items:center;
	width:100%;
	height:800px;
}
#screen1{
	width:20%;
	height:600px;
	float:right;
	background-color:darkgrey;
}
#screen2{
	width:80%;
	height:600px;
	background-color:lightgrey;
}

#footer{
	margin:5%;
	text-align:center;
	vertical-align:center;
}

</style>	
</head>
	
<body>
	<!-- --------------------------------세션 작업--------------------------------------- -->
<%

%>


	<!-- --------------------------------header--------------------------------------- -->
	<div id="header" >
		<h2 style="background-color:lightgrey; color:white; text-align:center" >HEADER SECTOR</h2>
	</div>
	<hr>
		
	<!-- --------------------------------nav--------------------------------------- -->
	<div id="nav">
		<h2 style="background-color:darkgrey; color:white; text-align:center">
			<a href="/">홈</a>
			<a href="/member/login">로그인</a>
			<a href="/member/signup">회원가입</a>
			<a href="/reservation/mailSend">메일 발송</a>
			<a href="/reservation/movieChoice">티켓 예매</a>
			<a href="/reservation/reservationConfirm">예매내역 확인</a>
		</h2>
	</div>
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
			<div id="body" style="height:600px; border:3px dashed maroon">바디부분 영화 정보</div>
		</div>
		
	</div>
	<!-- --------------------------------footer--------------------------------------- -->
	<div id="footer">
		<span style="border:3px solid red; text-align:center">BOTTOM SECTOR</span>
	</div>
	
</body>
</html>
