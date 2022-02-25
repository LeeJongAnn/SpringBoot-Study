<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>


<form action="/auth/loginProc" method="post">
  <div class="mb-3 ml-3 mt-3" style="max-width: 600px; margin-top: 0 auto;">
    <label for="username" class="form-label">Username</label>
    <input type="text" class="form-control" id="username" name ="username">
  </div>
  
   <div class="mb-3 ml-3 mt-3" style="max-width: 600px; margin-top: 0 auto;">
    <label for="password" class="form-label">Password</label>
    <input type="password" class="form-control" id="password" name="password">
  </div>
  
<button id="btn-login" class="btn btn-primary text-center mb-3 ml-3 mt-3">로그인</button>
</form>
<button id="btn-cancel1" style="position:absolute; left:135px; bottom:293px;" class="btn btn-secondary mb-3 ml-3 mt-3">취소</button>
<script src="/js/user.js"></script>
<%@ include file="../layout/footer.jsp" %>