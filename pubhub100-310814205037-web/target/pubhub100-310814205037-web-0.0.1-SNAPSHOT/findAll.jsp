
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>findAll</title>
</head>
<body bgcolor="lightpink">
	<center>
		<p>List of Books are...</p>
		<table border=1>
			<thead>
				<tr>
					<th>id</th>
					<th>name</th>
					<th>price</th>
					<th>author</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${books}">
 <tr>
						<td>${book.id}</td>
						<td>${book.name}</td>
						<td>${book.price}</td>
						<td>${book.author}</td>
					</tr>
			</tbody>
			 
			</c:forEach>


			</tbody>


		</table>
		<br> <br> <br> <a href="home.jsp">Home</a><br> <br>
	</center>
</body>
</html>