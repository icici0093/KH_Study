<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
</head>
<body>
	<jsp:include page="../common/menubar.jsp"></jsp:include>
	<br style="clear:both">
	<h1 align="center">공지글 목록 보기</h1>
	<br><br>
	<div align="right ">
		<button onclick="location.href='boardWriteView.kh'">글쓰기</button>
	</div>
	<br style="clear:both">
	<table align="center" width="600" border="1" cellspacing="0" style="clear:right;">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>올린날짜</th>
			<th>첨부파일</th>
		</tr>
		<c:forEach items="${nList }" var="notice">
			<tr>
				<td align="center">${notice.noticeNo }</td>
				<td align="center">
					<c:url var="nDetail" value="noticeDetail.kh">
						<c:param name="noticeNo" value="${notice.noticeNo }"></c:param>
					</c:url>
					<%-- noticeDetail.kh?noticeNo=${notice.noticeNo } --%>
					<a href="${nDetail }">${notice.noticeTitle }</a>
				</td>
				<td align="center">${notice.noticeWriter }</td>
				<td align="center">${notice.nCreateDate }</td>
				<td align="center">
					<c:if test="${!empty notice.noticeFilepath }">O</c:if>
					<c:if test="${empty notice.noticeFilepath }">X</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<div align="center">
		<form action="noticeSearch.kh" method="get">
			<select name="searchCondition">
				<option value="all" <c:if test="${search.searchCondition == 'all' }">selected</c:if>>전체</option>
				<option value="writer" <c:if test="${search.searchCondition == 'writer' }">selected</c:if>>작성자</option>
				<option value="title" <c:if test="${search.searchCondition == 'title' }">selected</c:if>>제목</option>
				<option value="content" <c:if test="${search.searchCondition == 'content' }">selected</c:if>>내용</option>
			</select>
			<input type="text" name="searchValue" value="${search.searchValue }">
			<input type="submit" value="검색">
		</form>
	</div>
</body>
</html>