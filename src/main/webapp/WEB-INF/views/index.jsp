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
      <td><a href="/board/${board.id}">${board.title}</a></td>
      <td>${board.content}</td>
    </tr>
    </c:forEach>
</table>
  <ul class="pagination justify-content-center">
    <li class="page-item"><a class="page-link" href="?page=${boards.number-1}">Previous</a></li>
    <c:forEach items="${boards.number}" var="i"><li class="page-item"><a class="page-link" href="?page=${i}">${i}</a></li></c:forEach>
    <li class="page-item"><a class="page-link" href="?page=${boards.number+1}">Next</a></li>
  </ul>
<div class="text-center" style="position: absolute; left: 25%; width: 700px">
<div class="p-5 mb-4 bg-light rounded-3">
      <div class="container-fluid py-5">
        <h1 class="display-5 fw-bold">for Spring study</h1>
        <p>dlwhddksiq@naver.com</p>
      </div>
    </div>
    </div>


<script src="/js/board.js"></script>
<%@ include file="layout/footer.jsp" %>
