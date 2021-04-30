<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 목록</title>
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
							<th>회원ID</th>
							<th>이름</th>
							<th>주소</th>
							<th></th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${empty members }">
								<tr>
									<td colspan="6" align="center">등록된 정보가 없습니다.</td>
								</tr>								
							</c:when>
							<c:otherwise>
								<c:forEach items="${members }" var="member" varStatus="index">
									<tr>
										<td>${index.count }</td>
										<td>${member.userId }</td>
										<td><a href="/member/detail.do?userId=${member.userId }">${member.userName }</a></td>
										<td>${member.userAddr }</td>
										<td><a class="btn btn-xs btn-warning" href="/member/update.do?userId=${member.userId }">UPDATE</a></td>
										<td><a class="btn btn-xs btn-danger" href="/member/delete.do?userId=${member.userId }">DELETE</a></td>
									</tr>
								</c:forEach>							
							</c:otherwise>
						</c:choose>
					</tbody>
				</table>
				<form action="/member/search.do" method="get">
					<table align="center">
						<tr>
							<td>
								<select name="searchType">
									<option value="userId" <c:if test="${searchType eq 'userId' }">selected</c:if>>ID</option>
									<option value="userName" <c:if test="${searchType eq 'userName' }">selected</c:if>>이름</option>
									<option value="userAddr" <c:if test="${searchType eq 'userAddr' }">selected</c:if>>주소</option>
								</select>
							</td>
							<td>
								<input type="text" size="7" name="searchKeyword" value="${searchKeyword }">
							</td>
							<td>
								<input type="submit" value="검색">
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>