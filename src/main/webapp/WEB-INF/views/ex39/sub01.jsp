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
	<h1>ajax / fetch / xhr 요청 연습</h1>

 	<button id="btn1">버튼1</button>
 	<br>
 	<button id="btn2">버튼2 fetch 사용</button>
 	<br>
 	<%-- 세번째 버튼 만들고 클릭하면 fetch 요청이 sub03으로 가도록   --%>
 	<button id="btn3">버튼3 fetch 사용</button>
 	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script>
	// 경로가 바뀔 수 있으므로 아래처럼 만들어서 경로에 붙인다.(ex: /Controller/)
	const ctx = "${pageContext.request.contextPath}";

	document.querySelector("#btn1").addEventListener("click", function() {
		console.log("버튼1번 클릭됨");
	});
	
	document.querySelector("#btn2").addEventListener("click", function() {
		console.log("버튼2번 클릭됨");
		// fetch 첫번째 파라미터 : 요청 경로
		fetch(ctx + "/ex39/sub02");
	});
	
	document.querySelector("#btn3").addEventListener("click", function() {
		console.log("버튼3번 클릭됨");
		fetch(ctx + "/ex39/sub03");
	});
	

</script>
</body>
</html>