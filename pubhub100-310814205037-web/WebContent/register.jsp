<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor="lightpink">
	<br><
	<br>
	<br>
	<center>
		<form action="registerServlet" method="post">
			Name <input type="text" name="name" /><br> <br> E-mail<input
				type="email" name="email" /><br> <br> password <input
				type="password" name="password" /><br> <br>
			<button type="submit">Register</button>
			<br> <br>
		</form>
		<a href="home.jsp">Home</a><br> <br>
	</center>
</body>
</html>