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
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h1>고객 전체 목록</h1>
				<table class="table">
					<thead>
						<tr>
							<th>id</th>
							<th>Name</th>
							<th>ContactName</th>
							<th>Address</th>
							<th>City</th>
							<th>PostalCode</th>
							<th>Country</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${customerList }" var="customer">
							<tr>
								<td>${customer.id }</td>
								<td>${customer.name }</td>
								<td>${customer.contactName }</td>
								<td>${customer.address }</td>
								<td>${customer.city }</td>
								<td>${customer.postalCode }</td>
								<td>${customer.country }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			
			</div>
		</div>
	</div>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>








