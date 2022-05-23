<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>

<style type="text/css">
#bodyscreen{
	text-align:center;
	align-items:center;
	width:100%;
	height:800px;
}
#screen1{
	width:20%;
	height:600px;
	float:left;
	background-color:darkgrey;
}
#screen2{
	width:80%;
	height:600px;
	background-color:lightgrey;
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
	<div id="nav">
		<h2 style="background-color:darkgrey; color:white; text-align:center">
			<a href="/member/login">로그인</a>
			<a href="/member/signup">회원가입</a>
			<a href="/reservation/mailSend">메일 발송</a>
			<a href="/movie/movieInform">영화 정보</a>
			<a href="/reservation/movieChoice">티켓예매</a>
			<a href="/reservation/reservationConfirm">예매내역</a>
		</h2>
	</div>
	
	<!-- --------------------------------nav--------------------------------------- -->

	<hr>
	<br>
	<span style="background-color:lightgrey; color:white; text-align:center">SECTION1</span>



<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
