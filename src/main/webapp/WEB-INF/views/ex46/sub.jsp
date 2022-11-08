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
	<h1>응답 처리</h1>
	<button id="btn1">/ex46/sub01</button>
	<br>
	<button id="btn2">/ex46/sub01</button>
	<br>
	<button id="btn3">/ex46/sub01</button>
	<br>
	<button id="btn4">/ex46/sub01</button>
	<br>
	<button id="btn5">"5" /ex46/sub01</button>
	<br>
	<button id="btn6">"6" /ex46/sub01</button>
	<br>
	<button id="btn7">"7" /ex46/sub01</button>
	<br>
	<button id="btn8">"8" /ex46/sub01</button>
	<br>
	<button id="btn9">"9" /ex46/sub01의 응답 출력</button>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script>
const ctx = "${pageContext.request.contextPath}";

document.querySelector("#btn9").addEventListener("click", function() {
	fetch(ctx + "/ex46/sub01")
	.then((response) => response.text())	// Response화면에서만 출력
	.then((data) => console.log(data)); // hello world 콘솔에 출력
});

document.querySelector("#btn8").addEventListener("click", function() {
	fetch(ctx + "/ex46/sub01")
	.then(() => 3)
	.then(a => console.log(a * 2)) // ? 
	.then(b => console.log(b * 2)) // ?
	.then(c => console.log(c)); // ?
});

document.querySelector("#btn7").addEventListener("click", function() {
	fetch(ctx + "/ex46/sub01")
	.then(() => 3)
	.then(a => a * 2)
	.then(b => b * 2)
	.then(c => console.log(c)); // ?
});

document.querySelector("#btn6").addEventListener("click", function() {
	fetch(ctx + "/ex46/sub01")
	.then(() => "a")
	.then(v => v + "b")
	.then(v => console.log(v));
});

document.querySelector("#btn5").addEventListener("click", function() {
	fetch(ctx + "/ex46/sub01")
	.then(() => {
		
		return "a";
	})
	.then((v) => {
		// 코드 작성
		
		return v + "b";
	})
	.then((v) => {
		
		console.log(v); // "ab"
	});
});

document.querySelector("#btn4").addEventListener("click", function() {
	fetch(ctx + "/ex46/sub01")
	.then(function() {
		
		return "a";
	})
	.then(function(v) {
		// 코드 작성
		
		return v + "b";
	})
	.then(function(v) {
		
		console.log(v); // "ab"
	});
});


document.querySelector("#btn3").addEventListener("click", function() {
	fetch(ctx + "/ex46/sub01")
	.then(function() {
		console.log("첫번째 then 함수");
		
		return "abc";
	})
	.then(function(data) {
		console.log("두번째 then 함수");
		console.log("첫번째 then 함수가 리턴한 값: ", data);
	});
});

document.querySelector("#btn2").addEventListener("click", function() {
	fetch(ctx + "/ex46/sub01")
	.then(function() {
		console.log("응답후 실행해야 하는 코드1");
		console.log("응답후 실행해야 하는 코드2");
	})
	.then(function() {
		console.log("응답후 실행3");
		console.log("응답후 실행4")
	});
});

document.querySelector("#btn1").addEventListener("click", function() {
	
	console.log("1 statement");
	
	fetch(ctx + "/ex46/sub01").then(function() {
		console.log("응답후 실행해야 하는 코드");
	});
	
	console.log("응답과 상관없이 계속 실행하는 코드");
	
	
});
</script>
</body>
</html>








