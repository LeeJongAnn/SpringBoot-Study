<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>


<form>
  <div class="mb-3 ml-3 mt-3">
    <label for="username" class="form-label">Username</label>
    <input type="text" class="form-control" id="username" >
  </div>
  
   <div class="mb-3 ml-3 mt-3">
    <label for="password" class="form-label">Password</label>
    <input type="password" class="form-control" id="password">
  </div>
  
</form>
<button type="submit" class="btn btn-primary ml-3">로그인하기</button>

<script src="/board/js/user.js"></script>
<%@ include file="../layout/footer.jsp" %>	