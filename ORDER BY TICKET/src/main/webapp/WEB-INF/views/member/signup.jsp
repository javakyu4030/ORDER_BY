<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

<head>
	<title>회원가입 페이지</title>
 	<link rel="stylesheet" href="/resources/css/signup.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">

 function register(){
	 
	 //빈칸확인 알림 및 비밀번호확인 알림
	 if($("#userid").val() ==''){alert("아이디를 입력하세요."); $("#userid").focus(); return false; }
	 if($("#username").val() ==''){alert("이름을 입력하세요."); $("#username").focus(); return false; }
	 
	 var pass = $("#userpw").val();	// val() ->value 속성 처리하기 / val(값): 설정 / val() : 추출
	 var pass1 = $("#userpwConfirm").val();
	 if(pass == ''){alert("비밀번호를 입력하세요."); $("#userpw").focus(); return false;}
	 if(pass1 == ''){alert("확인 비밀번호를 입력하세요."); $("#userpwConfirm").focus(); return false;}
	 if(pass != pass1)
		 { alert("비밀번호가 일치하지 않습니다.");$("#userpwConfirm").focus(); return false;}
	 
	 if($("#emailid").val() ==''){alert("이메일을 입력하세요."); $("#emailid").focus(); return false; }
	 if($("#emailDomain").val() ==''){alert("이메일을 입력하세요."); $("#emailDomain").focus(); return false; }
	 if($("#tel_1").val() ==''){alert("연락처를 입력하세요."); $("#tel_1").focus(); return false; }
	 if($("#tel_2").val() ==''){alert("연락처를 입력하세요."); $("#tel_2").focus(); return false; }
	 if($("#tel_2").val().length != 4){alert("잘못 입력하셨습니다."); $("#tel_2").focus(); return false; }
	 if($("#tel_3").val() ==''){alert("연락처를 입력하세요."); $("#tel_3").focus(); return false; }
	 if($("#tel_3").val().length != 4){alert("잘못 입력하셨습니다."); $("#tel_3").focus(); return false; }     
	 
	$("#registerform").attr("action", "/member/signup").submit(); 
	 
 }

 
 function selectEmail(sel){
	 var $sel =  $(sel);
	 var $emailDomain =  $('input[name=emailDomain]');
	 
	 //'1'인 경우 직접입력
	 if($sel.val()=="1"){
		 $emailDomain.attr('readonly',false);	// .attr(); -> 선택한 요소의 속성의 값을 가져옴
		 $emailDomain.val('');	// .val(); -> 선택한 요소의 속성의 값을 가져옴
	 }else{
		 $emailDomain.attr('readonly',true);
		 $emailDomain.val($sel.val());
	 }
	 
 }
 
 function idCheck(){
	 console.log("sssss");
		$.ajax({
			url : "/member/idCheck", //전송할 url
			type : "post", //전송할 메서드 타입
			dataType : "json", //받을 데이터 타입 안정하면 기본 xml형식
			data : {"member_id" : $("#userid").val()}, ////전송할 데이터
			success : function(a){
				if(a == 1){
					$("#userid").val("").focus();
					$("#checkID").html("동일한 아이디가 이미 존재합니다. 새로운 아이디를 입력하세요.");
				}else if(a == 0){
					$("#checkID").html("사용 가능한 아이디입니다.");
				}
			}
		})
	}
 
</script>

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
				<a href="/member/login">로그인</a>
				<a href="/movie/movieInform">영화 정보</a>
				<a href="/reservation/movieChoice">티켓예매</a>
				<a href="/reservation/reservationConfirm">예매내역</a>
			</h2>	
		</span>
	</div>
	<!-- --------------------------------body--------------------------------------- -->
	<div id="body" style="width:100%; height:800px; border:3px dashed maroon">바디부분 회원가입
		<div>
			<div><p id="checkID" style="color:red;text-align:center;"></p></div>
				<form name="registerform" id="registerform" method="post">
					<div>
						<label for="userid">아이디</label>
						<input type="text" id="userid" name="member_id" class="userid" placeholder="아이디를 입력하세요" maxlength="20" onchange="idCheck()">
					</div>
					
					<div>
						<label for="username">이름</label>
						<input type="text" id="username" name="member_name" class="username" placeholder="이름을 입력하세요" maxlength="20">
					</div>
					<div>
						<label for="userpw">비밀번호</label>
						<input type="text" id="userpw" name="member_pw" class="userpw" placeholder="비밀번호를 입력하세요" maxlength="20">
					</div>
					<div>
						<label for="userpwConfirm">비밀번호 확인</label>
						<input type="text" id="userpwConfirm"  class="userpw" placeholder="비밀번호를 다시한번 입력하세요" maxlength="20">
					</div>
					<div>
						<input id="emailid" name="emailId" type="text">@<input id="emailDomain" name="emailDomain" type="text">
						<select name="select_email" onChange="selectEmail(this)">
							<option value="" selected> 선택하세요</option>
							<option value="naver.com" >naver.com</option>
							<option value="gmail.com" >gmail.com</option>
							<option value="hanmail.com" >hanmail.com</option>
							<option value="1" >직접입력</option>
						</select>
					</div>
					<div>
						<label for="usertel">연락처</label>
							<input id="tel_1" type="tel" name='phone1' value="010" placeholder="010" /> -
							<input id="tel_2" type="tel" name='phone2' /> -
							<input id="tel_3" type="tel" name='phone3' />
					</div>
					
				<p><input type="button" value="가입" onclick="register()">
				</form>		
		</div>
	</div>

	<!-- --------------------------------footer--------------------------------------- -->
	<div id="footer">
		<span style="border:3px solid red; text-align:center">BOTTOM SECTOR</span>
	</div>
	