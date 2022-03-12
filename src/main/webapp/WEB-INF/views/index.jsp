<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp" %>

<table class="table">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">제목</th>
      <th scope="col">내용 미리보기</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="board" items="${boards.content}" >
    <tr>
      <td>${board.id}</td>
      <td>${board.title}</td>
      <td>${board.content}</td>
    </tr>
    </c:forEach>
</table>
<div>
<c:forEach var="board" items="${boards.content}">
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
