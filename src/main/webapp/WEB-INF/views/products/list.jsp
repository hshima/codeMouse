<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Code Mouse bookstore - Book title list</h1>
	<div>${sucesso}</div>
	<table>
		<thead>
			<tr>
				<th>Title</th>
				<th>Description</th>
				<th>Page count</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="products" >
				<tr>
					<td>${products.title}</td>
					<td>${products.description}</td>
					<td>${products.pageCount}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>