<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

<head>
	<title>로그인 페이지</title>
	
<style type="text/css">
#bodyscreen{
	text-align:center;
	align-items:center;
	width:100%;
	height:800px;
}

#body{
	font-size:60px;
	text-align:center;
	vertical-align:center;
}
#footer{
	margin:10%;
	text-align:center;
	vertical-align:center;
}

</style>	
</head>
	
<body>

	<!-- --------------------------------header--------------------------------------- -->
	<div id="header" >
		<h2 style="background-color:lightgrey; color:white; text-align:center" >HEADER SECTOR</h2>
	</div>
	<hr>

	<!-- --------------------------------nav--------------------------------------- -->
	
	<div id="section" style="text-align:center;">
		<span style="background-color:lightgrey; color:white; text-align:center">
			<h2 style="background-color:darkgrey; color:white; text-align:center">
				<a href="/">홈</a>
				<a href="/member/signup">회원가입</a>
				<a href="/reservation/mailSend">메일 발송</a>
				<a href="/movie/movieInform">영화 정보</a>
				<a href="/reservation/movieChoice">티켓예매</a>
				<a href="/reservation/reservationConfirm">예매내역</a>
			</h2>
		</span>
	</div>
	<!-- --------------------------------body--------------------------------------- -->
	<div id="body" style="width:100%; height:600px; border:3px dashed maroon">바디부분 로그인</div>

	<!-- --------------------------------footer--------------------------------------- -->
	<div id="footer">
		<span style="border:3px solid red; text-align:center">BOTTOM SECTOR</span>
	</div>
	
</body>
</html>
