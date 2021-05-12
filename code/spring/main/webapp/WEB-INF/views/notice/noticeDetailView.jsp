<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 상세</title>
</head>
<body>
	<jsp:include page="../common/menubar.jsp"></jsp:include>
	<br style="clear:both">
	<h1 align="center">${notice.noticeNo }번 글 상세보기</h1>
	<br><br>
	<table align="center" width="450" border="1">
		<tr>
			<td width="80">번호</td>
			<td>${notice.noticeNo }</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${notice.noticeTitle }</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${notice.noticeWriter }</td>
		</tr>
		<tr>
			<td>작성날짜</td>
			<td>${notice.nCreateDate }</td>
		</tr>
		<tr>
			<td height="300">내용</td>
			<td>${notice.noticeContents }</td>
		</tr>		
		<tr>
			<td>첨부파일</td>
			<td>${notice.noticeFilepath }</td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<c:url var="nModify" value="noticeModifyView.kh"> 
					<c:param name="noticeNo" value="${notice.noticeNo }"></c:param>
				</c:url>
				<c:url var="nDelete" value="noticeDelete.kh"> 
					<c:param name="noticeNo" value="${notice.noticeNo }"></c:param>
				</c:url>
				<a href="${nModify }">수정</a> &nbsp;
				<a href="${nDelete }">삭제</a>
			</td>
		</tr>							
	</table>
</body>
</html>