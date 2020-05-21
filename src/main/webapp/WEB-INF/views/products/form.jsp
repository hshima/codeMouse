<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> <%-- Adding this tag allows use of <form:form>, that passes information in as Spring format in a html similar tag and commadName attribute --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %> <%-- Adding this tag allows use of <s:> so form Action URI won't be changed --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Code Mouse bookstore</h1>
	<form:form action="${s:mvcUrl('PC#save').build()}" method="post" commandName="product">
		<div>
			<label>Book title</label> <input type="text" name="title" />
			<form:errors path="title" />
		</div>
		<div>
			<label>Description</label>
			<textarea rows="10" cols="20" name="description"></textarea>
			<form:errors path="description" />
		</div>
		<div>
			<label>Page count</label><input type="text" name="pageCount" />
			<form:errors path="pageCount"/>
		</div>

		<c:forEach items="${kinds}" var="priceKind" varStatus="status">
			<div>
				<label>${priceKind}</label>
				<input type="text" name="prices[${status.index}].value" />
				<input type="hidden" name="prices[${status.index}].kind" value="${priceKind}"/>
			</div>
		</c:forEach>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>