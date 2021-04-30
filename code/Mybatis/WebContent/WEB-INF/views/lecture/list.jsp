<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강좌 목록</title>
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/css/style.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="../common/menubar.jsp"></jsp:include>
	<br>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover table-condensed">
					<colgroup>
						<col width="80" align="center">
						<col width="200">
						<col width="200">
						<col width="400">
					</colgroup>
					<thead>
						<tr>
							<th>No</th>
							<th>강좌ID</th>
							<th>강좌명</th>
							<th>강사</th>
							<th></th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${empty lectureList }">
								<tr>
									<td colspan="6" align="center">등록된 정보가 없습니다.</td>
								</tr>
							</c:when>
							<c:otherwise>
								<c:forEach items="${lectureList }" var="lecture" varStatus="status">
									<tr>
										<td>${status.count }</td>
										<td>${lecture.lectureNo }</td>
										<td><a href="/lecture/detail.do?lectureId=${lecture.lectureNo }">${lecture.lectureName }</a></td>
										<td>${lecture.lectureInstructor }</td>
										<td><a class="btn btn-xs btn-warning" href="/lecture/modify.do?lectureId=${lecture.lectureNo }">UPDATE</a></td>
										<td><a class="btn btn-xs btn-danger" href="/lecture/remove.do?lectureId=${lecture.lectureNo }">DELETE</a></td>
									</tr>
								</c:forEach>							
							</c:otherwise>
						</c:choose>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>