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
#menu{
	margin:2%;
	text-align:center;
}

#footer{
	margin:5%;
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
		<h2 style="background-color:darkgrey; color:white; text-align:center">NAV SECTOR</h2>
		<h2 style="background-color:darkgrey; color:white; text-align:center">
			<a href="/member/login">로그인</a>
			<a href="/member/signup">회원가입</a>
			<a href="/movie/movieInform">영화 정보</a>
			<a href="/reservation/mailSend">메일 발송</a>
			<a href="/reservation/movieChoice">티켓예매</a>
			<a href="/reservation/reservationConfirm">예매내역 확인</a>
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
			<div id="body" style="height:600px; border:3px dashed maroon">바디부분-티켓예매
				<div id="menu">
						<div id="menuLocation" style="border:1px solid gold; float:left; width:20%; height:500px;">지점
							<c:forEach items="${menuList}" var="menuList">
									<div>${menuList.location}</div>
							</c:forEach>					
						</div>				
						<div id="menuDate" style="border:1px solid red; float:left; width:20%; height:500px;">상영관
							<c:forEach items="${menuList}" var="menuList">
									<div>${menuList.hall_name}</div>
							</c:forEach>
						</div>				
						<div id="menuTime" style="border:1px solid blue; float:left; width:20%; height:500px;">시간
						</div>
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
