<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세 정보</title>
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/css/style.css" rel="stylesheet">
</head>
<body>
	<a class="btn btn-xs btn-primary" href="/member/list.do">회원 목록</a>
	<h3>회원 정보 조회</h3>
		<table class="table">
			<colgroup>
				<col width="150">
				<col width="*">
			</colgroup>
			<tr>
				<td>회원 ID</td>
				<td>
					<input class="form-control" value="${member.userId }" readonly>
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>
					<input class="form-control" value="${member.userName }" readonly>
				</td>
			</tr>						
			<tr>
				<td>주소</td>
				<td>
					<input class="form-control" value="${member.userAddr }" readonly>
				</td>
			</tr>
		</table>
</body>
</html>