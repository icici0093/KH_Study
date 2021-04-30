<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강좌 상세 정보</title>
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/css/style.css" rel="stylesheet">
</head>
<body>
	<a class="btn btn-xs btn-primary" href="/lecture/list.do">강좌 목록</a>
	<h3>강좌 정보 조회</h3>
		<table class="table">
			<colgroup>
				<col width="150">
				<col width="*">
			</colgroup>
			<tr>
				<td>강좌명</td>
				<td>
					<input class="form-control" value="${lecture.lectureName }" readonly>
				</td>
			</tr>
			<tr>
				<td>강사명</td>
				<td>
					<input class="form-control" value="${lecture.lectureInstructor }" readonly>
				</td>
			</tr>						
			<tr>
				<td>강좌소개</td>
				<td>
					<textarea rows="7" class="form-control" readonly>${lecture.lectureIntroduce }</textarea>
				</td>
			</tr>
		</table>
</body>
</html>