<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>

<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
	<my:navBar active="register"></my:navBar>
	<div class="container-md">
		<div class="row">
			<div class="col">
				<h1>게시물 작성</h1>
				<form action="" method="post">
					<div class="mb-3">
						<label for="" class="form-label">제목</label>
						<input type="text" class="form-control" name="title">
					</div>
					<div class="mb-3">
						<label for="" class="form-label">본문</label>
						<textarea rows="5" class="form-control" name="content"></textarea>
					</div>
					<div class="mb-3">
						<label for="" class="form-label">작성자</label>
						<input type="text" class="form-control" name="writer">
					</div>
					
					<input class="btn btn-primary" type="submit" value="등록">
				
				
				</form>
			</div>
		</div>
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>