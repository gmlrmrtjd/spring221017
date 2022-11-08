<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<h1>fetch 요청방식 변경</h1>
	<button id="btn1">/ex40/sub01 get 방식 요청</button>
	<br>
	<button id="btn2">/ex40/sub02 get 방식 요청 w/ option</button>
	<br>
	<button id="btn3">/ex40/sub03 post 방식 요청 w/ option</button>
	<br>
	<button id="btn4">/ex40/sub04 get 방식 요청 w/ option</button>	
	<br>
	<button id="btn5">/ex40/sub04 post 방식 요청 w/ option</button>
	<br>
	<button id="btn6">/ex40/sub04 put 방식 요청 w/ option</button>	
	<br>
	<button id="btn7">/ex40/sub04 delete 방식 요청 w/ option</button>
	<br>
	<button id="btn8">/ex40/sub05 get 방식 요청</button>
	<br>
	<button id="btn9">/ex40/sub05 post 방식 요청</button>
	<br>
	<button id="btn10">/ex40/sub05 put 방식 요청</button>
	<br>
	<button id="btn11">/ex40/sub05 delete 방식 요청</button>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script>
	const ctx = "${pageContext.request.contextPath}";

	document.querySelector("#btn1").addEventListener("click", function() {
		// 아무 옵션도 주지 않으면 get 방식 
		fetch(ctx + "/ex40/sub01");
	});
	
	document.querySelector("#btn2").addEventListener("click", function() {
		// fetch의 두번째 파라미터는 options (object)
		fetch(ctx + "/ex40/sub02", {method : "get"}); // option이 get방식이라 안써도 무방 
	});
	
	document.querySelector("#btn3").addEventListener("click", function() {
		// fetch의 두번째 파라미터는 options (object)
		fetch(ctx + "/ex40/sub03", {method : "post"}); // option이 post방식 
	});
	
	document.querySelector("#btn4").addEventListener("click", function() {
		// fetch의 두번째 파라미터는 options (object)
		fetch(ctx + "/ex40/sub04", {method : "get"}); // option이 get방식이라 안써도 무방 
	});
	
	document.querySelector("#btn5").addEventListener("click", function() {
		// fetch의 두번째 파라미터는 options (object)
		fetch(ctx + "/ex40/sub04", {method : "post"}); // option이 post방식 
	});
	
	document.querySelector("#btn6").addEventListener("click", function() {
		// fetch의 두번째 파라미터는 options (object)
		fetch(ctx + "/ex40/sub04", {method : "put"}); // option이 get방식이라 안써도 무방 
	});
	
	document.querySelector("#btn7").addEventListener("click", function() {
		// fetch의 두번째 파라미터는 options (object)
		fetch(ctx + "/ex40/sub04", {method : "delete"}); 
	});
	
	document.querySelector("#btn8").addEventListener("click", function() {
		fetch(ctx + "/ex40/sub05", {method : "get"});
	});
	
	document.querySelector("#btn9").addEventListener("click", function() {
		fetch(ctx + "/ex40/sub05", {method : "post"});
	});
	
	document.querySelector("#btn10").addEventListener("click", function() {
		fetch(ctx + "/ex40/sub05", {method : "put"});
	});
	
	document.querySelector("#btm11").addEventListener("click", function() {
		fetch(ctx + "/ex40/sub05", {method : "delete"});
	});
</script>
</body>
</html>