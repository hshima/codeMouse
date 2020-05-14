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
	<h1>Code Mouse bookstore</h1>
	<form action="/codeMouse/products" method="post">
		<div>
			<label>Book title</label> <input type="text" name="title" />
		</div>
		<div>
			<label>Description</label>
			<textarea rows="10" cols="20"></textarea>
		</div>
		<div>
			<label>Page count</label><input type="text" name="pageCount" />
		</div>

		<c:forEach items="${kinds}" var="priceKind" varStatus="status">
			<div>
				<label>${priceKind}</label>
				<input type="text" name="prices[${status.index}].value" />
				<input type="hidden" name="prices[${status.index}].kind" value="${priceKind}"/>
			</div>
		</c:forEach>
		<button type="submit">Insert</button>
	</form>
</body>
</html>