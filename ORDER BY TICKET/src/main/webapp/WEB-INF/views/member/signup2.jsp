<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

<head>
	<title>회원가입 페이지</title>
 <link rel="stylesheet" href="/resources/css/signup.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">

var email_rule =  /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
var email_id =$("#email_id").val();
var email_domain =$("#email_domain").val();
var mail ="";

$(document).ready(function(){
	
	
	$(".select2").on("click",function(domain){
		console.log("ddddddd")
		alert("ssssss2222222ss");
		 alert("ssssssss");
		
		if(!email_id){
		      alert("이메일을 입력해주세요");
		    $("#email_id").focus();
		    return false;
		  }
		  if(!email_domain){
		      alert("도메인을 입력해주세요");
		    $("#email_domain").focus();
		    return false;
		  }
		  mail = email_id+"@"+email_domain;
		  $("#mail").val(mail);  
		  
		  if(!email_rule.test(mail)){
		      alert("이메일을 형식에 맞게 입력해주세요.");
		    return false;
		  }
		  $("#email_domain").val(domain);
		  
		
		$("#registerform").attr("action", "/member/signup").submit();
	
	}) //End of $("btn_write")

}) //End of $(document).ready(function)


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
			<form name="registerform" id="registerform" method="post">
				<div>
					<label for="userid">아이디</label>
					<input type="text" id="userid" name="member_id" class="userid" placeholder="아이디를 입력하세요" maxlength="20">
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
					<input type="text" id="userpwConfirm" name="member_pw_confirm" class="userpw" placeholder="비밀번호를 다시한번 입력하세요" maxlength="20">
				</div>
				<div>
					<tr>
						<th scope="row">이메일 <span class="em_red"></th>
						<td>
						<input type="text" id="email_id" class="form_w200" name="member_email" value="" title="이메일 아이디" placeholder="이메일" maxlength="18" /> @
						<input type="text" id="email_domain" class="form_w200" value="" title="이메일 도메인" placeholder="이메일 도메인" maxlength="18"/> 
						<select class="select1" title="이메일 도메인 주소 선택" >
						    <option value="">-선택-</option>
						    <option value="naver.com">naver.com</option>
						    <option value="gmail.com">gmail.com</option>
						    <option value="hanmail.net">hanmail.net</option>
						    <option value="hotmail.com">hotmail.com</option>
						    <option value="korea.com">korea.com</option>
						    <option value="nate.com">nate.com</option>
						    <option value="yahoo.com">yahoo.com</option>
						</select>
						</td>
					</tr>
				</div>
				<div>
					<label for="usertel">연락처</label>
					
						<input type="tel" name='member_tel' /> -
						<input type="tel" name='phone2' /> -
						<input type="tel" name='phone3' />
					
				</div>
				
			<p><button type="submit">제출</button>
			</form>		
		</div>
	</div>

	<!-- --------------------------------footer--------------------------------------- -->
	<div id="footer">
		<span style="border:3px solid red; text-align:center">BOTTOM SECTOR</span>
	</div>
	
<tr>
<th scope="row">이메일 <span class="em_red">*</th>
<td>
<input type="text" id="email_id" class="form_w200" value="" title="이메일 아이디" placeholder="이메일" maxlength="18" /> @ 
<input type="text" id="email_domain" class="form_w200" value="" title="이메일 도메인" placeholder="이메일 도메인" maxlength="18"/> 
<select class="select2" title="이메일 도메인 주소 선택" onclick=setEmailDomain(this.value);>
    <option value="">-선택-</option>
    <option value="naver.com">naver.com</option>
    <option value="gmail.com">gmail.com</option>
    <option value="hanmail.net">hanmail.net</option>
    <option value="hotmail.com">hotmail.com</option>
    <option value="korea.com">korea.com</option>
    <option value="nate.com">nate.com</option>
    <option value="yahoo.com">yahoo.com</option>
</select>
</td>
</tr>


</body>
</html>
