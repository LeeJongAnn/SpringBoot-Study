<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp" %>
<div>
<c:forEach var="board" items="${boards}">
	<div class="card m-2">
		<div class="card-body">
			<h4 class="card-title">${board.title}</h4>
			<a href="/board/${board.id}" class="btn btn-primary">상세보기</a>
			<button id="btn-delete" class="btn btn-danger" >삭제</button>
		</div>
	</div>
</c:forEach>
</div>

<script src="/js/board.js"></script>
<%@ include file="layout/footer.jsp" %>
