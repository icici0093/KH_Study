<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
	<jsp:include page="../common/menubar.jsp"></jsp:include>
	<h1 align="center">정보 수정</h1>
	<div class="centerText">
		<form action="memberModify.kh" method="post">
			<table width="650" cellspacing="5">
				<tr>
					<td>* 아이디</td>
					<td>
						<input type="text" name="userId" id="userId" value="${loginUser.userId }" readonly>
					</td>
				</tr>
				<tr>
					<td>* 이름</td>
					<td><input type="text" name="userName" value="${loginUser.userName }" readonly></td>
				</tr>
				<tr>
					<td>* 비밀번호</td>
					<td><input type="password" name="userPw" value="${loginUser.userPw }"></td>
				</tr>
				<tr>
					<td>* 나이</td>
					<td><input type="number" min="20" max="100" name="userAge" value="${loginUser.userAge }"></td>
				</tr>
				<tr>
					<td>* 이메일</td>
					<td><input type="email" name="userEmail" value="${loginUser.userEmail }"></td>
				</tr>
				<tr>
					<td>* 전화번호</td>
					<td><input type="text" name="userPhone" value="${loginUser.userPhone }"></td>
				</tr>
				<c:forTokens items="${loginUser.userAddr }" delims="," var="addr" varStatus="status">
					<c:if test="${status.index eq 0 }">
					<tr>
						<td>우편번호</td>
						<td>
							<input type="text" name="post" class="postcodify_postcode5" size="6" value="${addr }">
							<button type="button" id="postcodify_search_button">검색</button>
						</td>
					</tr>
					</c:if>
					<c:if test="${status.index eq 1 }">
					<tr>
						<td>도로명 주소</td>
						<td><input type="text" name="address1" class="postcodify_address" value="${addr }"></td>
					</tr>
					</c:if>
					<c:if test="${status.index eq 2 }">
					<tr>
						<td>상세 주소</td>
						<td><input type="text" name="address2" class="postcodify_extra_info" value="${addr }"></td>
					</tr>
					</c:if>
				</c:forTokens>
				<tr>
					<td colspan="2" align="center">
						<!-- <button onclick="return validate();">가입하기</button> -->
						<input type="submit" value="수정하기">
						<button type="button" onclick="location.href='memberDelete.kh?userId=${loginUser.userId}';">탈퇴하기</button>
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
	</script>	
</body>
</html>