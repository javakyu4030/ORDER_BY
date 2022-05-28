<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

<head>
	<title>로그인 페이지</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">

 function loginClicked(){
	 
	 //ID,PW 비교하여 맞을경우
	 //로그인 버튼클릭 시 영화정보페이지로 이동.
		 console.log("sssss");
			$.ajax({
				url : "/member/loginCheck", //전송할 url
				type : "post", //전송할 메서드 타입
				dataType : "json", //받을 데이터 타입 안정하면 기본 xml형식
				data : {"member_id" : $("#userid").val(), "member_pw" : $("#userpw").val()  }, ////전송할 데이터
				//data : {"member_pw" : $("#userpw").val()}, ////전송할 데이터
				success : function(a){
					if(a == 1){ //로그인 성공
						$("#userid").val("").focus();
						$("#userpw").val("").focus();
						$("#loginCheck").html("로그인 성공");
						$("#loginCheckform").attr("action", "/movie/movieInform").submit(); 
					}else if(a == 0){
						$("#loginCheck").html("<h4>아이디,비밀번호가 맞지 않습니다.</h4>");
					}
				}
			})
/*  if( $("#userid").val() == $("#userid").val() ){
		$("#loginform").attr("action", "/movie/movieInform").submit(); 
		 
	 } */

	 
 }
 
</script>






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
<div id="body" style="width:100%; height:800px; border:3px dashed maroon">바디부분 로그인
		<div>
		<div><p id="loginCheck" style="color:red;text-align:center;"></p></div>
			<form name="loginCheckform" id="loginCheckform" method="post">
				<div>
					<label for="userid">아이디</label>
					<input type="text" id="userid" name="member_id" class="userid" placeholder="아이디를 입력하세요" maxlength="20" >
				</div>
				<div>
					<label for="userpw">비밀번호</label>
					<input type="text" id="userpw" name="member_pw" class="userpw" placeholder="비밀번호를 입력하세요" maxlength="20">
				</div>
			<p><input type="button" value="로그인" onclick="loginClicked()">
			</form>		
		</div>
	</div>
	<!-- --------------------------------footer--------------------------------------- -->
	<div id="footer">
		<span style="border:3px solid red; text-align:center">BOTTOM SECTOR</span>
	</div>
	
</body>
</html>
