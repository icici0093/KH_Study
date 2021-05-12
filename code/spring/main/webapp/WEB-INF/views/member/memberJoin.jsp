<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
<style type="text/css">
	.centerText table {
		margin : auto;
	}
	span.guide {
		display : none;
		font-size : 12px;
		top : 12px;
		right : 10px;
	}
	span.ok{color:green}
	span.error{color:red}
</style>
</head>
<body>
	<jsp:include page="../common/menubar.jsp"></jsp:include>
	<h1 align="center">회원가입</h1>
	<div class="centerText">
		<form action="memberRegister.kh" method="post">
			<table width="650" cellspacing="5">
				<tr>
					<td>* 아이디</td>
					<td>
						<input type="text" name="userId" id="userId">
						<span class="guide ok">사용 가능한 아이디입니다.</span>
						<span class="guide error">사용 불가능한 아이디입니다.</span>
					</td>
				</tr>
				<tr>
					<td>* 이름</td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td>* 비밀번호</td>
					<td><input type="password" name="userPw"></td>
				</tr>
				<tr>
					<td>* 나이</td>
					<td><input type="number" min="20" max="100" name="userAge"></td>
				</tr>
				<tr>
					<td>* 이메일</td>
					<td><input type="email" name="userEmail"></td>
				</tr>
				<tr>
					<td>* 전화번호</td>
					<td><input type="text" name="userPhone"></td>
				</tr>
				<tr>
					<td>우편번호</td>
					<td>
						<input type="text" name="post" class="postcodify_postcode5" size="6">
						<button type="button" id="postcodify_search_button">검색</button>
					</td>
				</tr>
				<tr>
					<td>도로명 주소</td>
					<td><input type="text" name="address1" class="postcodify_address"></td>
				</tr>
				<tr>
					<td>상세 주소</td>
					<td><input type="text" name="address2" class="postcodify_extra_info"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<button onclick="return validate();">가입하기</button>
						<!-- <input type="submit" value="가입하기"> -->
						<button type="button" onclick="location.href='home.kh';">홈으로</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>
	<script>
		$(function() {
			$("#postcodify_search_button").postcodifyPopUp();
		});
		
		$("#userId").on("blur", function(){
			var userId = $("#userId").val();
			$.ajax({
				url : "dupId.kh",
				data : { "userId" : userId},
				success : function(result){
					if(result != 0){
						$(".guide.error").show();			
						$(".guide.ok").hide();
					}else{
						$(".guide.ok").show();
						$(".guide.error").hide();
					}
				},
				error : function(){
					console.log("전송 실패");
				}
			});
			
		});
	</script>
</body>
</html>