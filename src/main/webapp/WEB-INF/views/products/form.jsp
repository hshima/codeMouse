<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="/codeMouse/produtos" method="post" >
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
			<button type="submit">Insert</button>
			
		</form>
	</body>
</html>