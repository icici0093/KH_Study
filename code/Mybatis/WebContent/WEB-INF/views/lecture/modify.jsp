<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강좌 정보 수정</title>
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/css/style.css" rel="stylesheet">
</head>
<body>
	<a class="btn btn-xs btn-primary" href="/lecture/list.do">강좌 목록</a>
	<h3>강좌 정보 수정</h3>
	<form action="/lecture/modify.do" method="post">
		<input type="hidden" name="lectureNo" value="${lecture.lectureNo }">
		<table class="table">
			<colgroup>
				<col width="150">
				<col width="*">
			</colgroup>
			<tr>
				<td>강좌명</td>
				<td>
					<input type="text" class="form-control" name="lectureName" value="${lecture.lectureName }">
				</td>
			</tr>
			<tr>
				<td>강사명</td>
				<td>
					<input type="text" class="form-control" name="instructorName" value="${lecture.lectureInstructor }">
				</td>
			</tr>
			<tr>
				<td>강좌소개</td>
				<td>
					<textarea rows="7" class="form-control" name="introduce">${lecture.lectureIntroduce }</textarea>
				</td>
			</tr>
		</table>
		<div>
			<a href="#">취소</a>
			<input type="submit" class="btn btn-sm btn-success" value="수정">
		</div>
	</form>
</body>
</html>