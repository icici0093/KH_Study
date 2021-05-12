<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글</title>
</head>
<body>
	<jsp:include page="../common/menubar.jsp"></jsp:include>
	<br style="clear:both">
	<h1 align="center">게시글 목록 보기</h1>
	<br><br>
	<div align="center">
		<button onclick="location.href='boardWriteView.kh'">글쓰기</button>
	</div>
	<br style="clear:both">
	<table align="center" width="600" border="1" cellspacing="0" style="clear:right;">
		<tr>
			<th>번호</th>
			<th width="300">제목</th>
			<th>작성자</th>
			<th>날짜</th>
			<th>조회수</th>
			<th>첨부파일</th>
		</tr>
		<c:forEach items="${bList }" var="board">
			<tr>
				<td align="center">${board.boardNo }</td>
				<td align="center">
					<c:url var="bDtail" value="boardDetail.kh">
						<c:param name="boardNo" value="${board.boardNo }"></c:param>
					</c:url>
					<a href="${bDtail}">${board.boardTitle }</a>
				</td>
				<td align="center">${board.boardWriter }</td>
				<td align="center">${board.bCreateDate }</td>
				<td align="center">${board.boardCount }</td>
				<td align="center">
					<c:if test="${!empty board.originalFilename}">O</c:if>
					<c:if test="${empty  board.originalFilename}">X</c:if>
				</td>
			</tr>
		</c:forEach>
		<!-- 페이징 처리 -->
		<tr align="center" height="20">
			<td colspan="6">
				<!-- 이전 -->
				<c:url var="before" value="boardList.kh">
					<c:param name="page" value="${pi.currentPage - 1 }"></c:param>
				</c:url>
				<c:if test="${pi.currentPage <= 1 }">
					[이전]&nbsp;
				</c:if>
				<c:if test="${pi.currentPage > 1 }">
					<a href="${before }">[이전]</a>&nbsp;
				</c:if>
				<!-- 페이지 -->
				<c:forEach var="p" begin="${pi.startPage }" end="${pi.endPage }">
					<c:url var="pagination" value="boardList.kh">
						<c:param name="page" value="${p }"></c:param>
					</c:url>
					<c:if test="${p eq pi.currentPage }">
						<font color="red" size="4">[${p }]</font>
					</c:if>
					<c:if test="${p ne pi.currentPage }">
						<a href="${pagination }">${p }</a>&nbsp;
					</c:if>
				</c:forEach>
				<!-- 다음 -->
				<c:url var="after" value="boardList.kh">
					<c:param name="page" value="${pi.currentPage + 1 }"></c:param>
				</c:url>
				<c:if test="${pi.currentPage >= pi.maxPage }">
					[다음]&nbsp;
				</c:if>
				<c:if test="${pi.currentPage < pi.maxPage }">
					<a href="${after }">[다음]</a>&nbsp;
				</c:if>
			</td>
		</tr>
	</table>
	
</body>
</html>