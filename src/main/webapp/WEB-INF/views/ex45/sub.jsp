<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<h1>응답!!</h1>
	<button id="btn1">/ex45/sub01</button>
	<br>
	<button id="btn2">/ex45/sub02 202 accepted 응답</button>
	<br>
	<button id="btn3">/ex45/sub03 응답 w/ header</button>
	<br>
	<button id="btn4">/ex45/sub04 응답 w/ header Your-Header : Your-Value</button>
	<br>
	<button id="btn5">/ex45/sub05 응답 본문 String</button>
	<br>
	<button id="btn6">/ex45/sub06 응답 본문 json</button>
	<br>
	<button id="btn7">/ex45/sub07 응답 본문 json {"name": "손흥민", "address":"서울"}</button>
	<br>
	<button id="btn8">/ex45/sub08 응답 본문 date, datetime</button>
	<br>
	<button id="btn9">/ex45/sub09 응답 본문 complex</button>
	<br>
	<button id="btn10">/ex45/sub010 응답 본문 complex</button>
	<br>
	<button id="btn13">/ex45/sub13 응답 map to json</button>
	<br>
	<button id="btn14">/ex45/sub14 응답 map to json , complex</button>
	<br>
	<button id="btn15">/ex45/sub15 응답 {"car":"tesla", "model":"avante", "color":["blue", "red"]}</button>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script>
const ctx = "${pageContext.request.contextPath}";
document.querySelector("#btn15").addEventListener("click", function() {
	fetch(ctx + "/ex45/sub15");
});

document.querySelector("#btn14").addEventListener("click", function() {
	fetch(ctx + "/ex45/sub14");
});

document.querySelector("#btn13").addEventListener("click", function() {
	fetch(ctx + "/ex45/sub13");
});

document.querySelector("#btn10").addEventListener("click", function() {
	fetch(ctx + "/ex45/sub10");
});

document.querySelector("#btn9").addEventListener("click", function() {
	fetch(ctx + "/ex45/sub09");
});

document.querySelector("#btn8").addEventListener("click", function() {
	fetch(ctx + "/ex45/sub08");
});

document.querySelector("#btn7").addEventListener("click", function() {
	fetch(ctx + "/ex45/sub07");
});

document.querySelector("#btn6").addEventListener("click", function() {
	fetch(ctx + "/ex45/sub06");
});

document.querySelector("#btn5").addEventListener("click", function() {
	fetch(ctx + "/ex45/sub05");
});

document.querySelector("#btn4").addEventListener("click", function() {
	fetch(ctx + "/ex45/sub04");
});

document.querySelector("#btn3").addEventListener("click", function() {
	fetch(ctx + "/ex45/sub03");
});

document.querySelector("#btn2").addEventListener("click", function() {
	fetch(ctx + "/ex45/sub02");
});

document.querySelector("#btn1").addEventListener("click", function() {
	fetch(ctx + "/ex45/sub01");
});
</script>
</body>
</html>











