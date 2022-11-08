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
	<h1>fetch 요청 header 조작</h1>
	<button id="btn1">/ex41/sub01 get, 헤더 추가</button>
	
	<br>

	<button id="btn2">/ex41/sub02 get, 헤더 추가 (YourHeader : "Your Header Value")</button>
	
	<br>
	<button id="btn3">/ex41/sub03 헤더 추가 (Your-Header, My-Header)</button>
	
	<br>
	<button id="btn4">/ex41/sub04 헤더 변경 (Accept)</button>
	
	<br>
	<button id="btn5">/ex41/sub05 헤더 변경 (Accept-Language : "*")</button>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script>
const ctx = "${pageContext.request.contextPath}";


document.querySelector("#btn5").addEventListener("click", function() {
	fetch(ctx + "/ex41/sub05", {
		method : "get",
		headers : {
			"Accept-Language" : "*"
		}
	});
});

document.querySelector("#btn4").addEventListener("click", function() {
	fetch(ctx + "/ex41/sub04", {
		method : "get",
		headers : {
			"My-Header" : "My Values",
			"Accept" : "text/plain"
		}
	});
});


document.querySelector("#btn3").addEventListener("click", function() {
	fetch(ctx + "/ex41/sub03", {
		method : "get",
		headers : {
			"Your-Header" : "Your Header Value",
			"My-Header" : "My Values"
		}
	});
});

document.querySelector("#btn2").addEventListener("click", function() {
	fetch(ctx + "/ex41/sub02", {
		method : "get",
		headers : {
			YourHeader : "Your Header Value", 
			MyHeader : "My Value",
		}
	});
});

document.querySelector("#btn1").addEventListener("click", function(){
	fetch(ctx + "/ex41/sub01", {
		method : "get",
		headers : {MyHeader : "My Header Value"}
	});
});

</script>
</body>
</html>