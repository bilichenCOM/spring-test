<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Events page</title>
</head>
<body>
	<h1>All events:</h1>
	<table>
		<thead>
			<tr>
				<th>Name:</th>
				<th>Users:</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="event" items="${events}">
				<tr>
					<td>${event.name}</td>
					<td><ul>
						<c:forEach var="user" items="${events.users}">
							<li>${user.email}</li>
						</c:forEach>
					</ul>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>