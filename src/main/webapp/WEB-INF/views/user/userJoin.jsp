<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>


<form>
  <div class="mb-3 ml-3 mt-3" style="max-width: 600px; margin-top: 0 auto;">
    <label for="username" class="form-label">Username</label>
    <input type="text" class="form-control" id="username" >
  </div>
  
   <div class="mb-3 ml-3 mt-3" style="max-width: 600px; margin-top: 0 auto;">
    <label for="password" class="form-label">Password</label>
    <input type="password" class="form-control" id="password" aria-describedby="emailHelp">
  </div>
  
  <div class="mb-3 ml-3" style="max-width: 600px; margin-top: 0 auto;">
    <label for="exampleInputPassword1" class="form-label">Email</label>
    <input type="email" class="form-control" id="email">
  </div>
</form>
<button id="btn-save" class="btn btn-primary ml-3">회원가입 하기</button>


<script src="/js/user.js"></script>
<%@ include file="../layout/footer.jsp" %>