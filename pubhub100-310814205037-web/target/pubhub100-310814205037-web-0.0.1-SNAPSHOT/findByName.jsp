<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>findbyname</title>
</head>
<body bgcolor="lightblue">
	<center>
		<br> <br> <br> <br> <br> <br>
		<p>Enter the book you want to find..</p>
		<form action="findByNameServlet" method="get">
			<input type="text" name="name" />
			<button type="submit">search</button>
			<br> <br> <a href="home.jsp">Home</a><br> <br>
		</form>
	</center>

</body>

</html>