<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddBook</title>
</head>
<body bgcolor="lightpink">
	<br><
	<br>
	<br>
	<center>
		<form action="addBookServlet" method="post">
			name <input type="name" name="name" /><br> <br> price <input
				type="number" name="price" /><br> <br> author<input
				type="text" name="author" /><br> <br>
			<button type="submit">Add_Book</button>
			<br> <br>
		</form>
		<a href="home.jsp">Home</a><br> <br>
</body>
</html>