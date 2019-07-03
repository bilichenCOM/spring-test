<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Events page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<style type="text/css">

	.drop-down-list {
		display: none;
		position: absolute;
		background-color: #f1f1f1;
		min-width: 160px;
		box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
		z-index: 1;
	}
	
	.show { display: block; }
</style>
<script type="text/javascript">
	function dropDown(documentId) {
		document.getElementById(documentId).classList.toggle('show');
	}
</script>
</head>
<body>
	<h1>All events:</h1>
	<table class="table table-striped">
		<thead class="thead thead-dark">
			<tr>
				<th>Name:</th>
				<th>Users:</th>
				<th>Action:</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="event" items="${events}">
				<tr>
					<td>${event.name}</td>
					<td><button class="btn btn-link" onclick="dropDown('users-from-event-id-${event.id}')">vvv</button>
						<ul class="drop-down-list" id="users-from-event-id-${event.id}">
							<c:forEach var="user" items="${event.users}">
								<li>${user.firstName} ${user.lastName}</li>
							</c:forEach>
							<c:if test="${event.users.size() eq 0}">
								<li>sorry... no users for this event</li>
							</c:if>
						</ul>
					</td>
					<td>
						<a href="/spring-test/apply/for-event?event_id=${event.id}">
							<button class="btn btn-primary">Apply</button>
						</a>
						<a href="/spring-test/apply/discard-for-event?event_id=${event.id}">
							<button class="btn btn-secondary">Discard</button>
						</a>
					</td>
			</c:forEach>
			<c:if test="${events.size() eq 0}">
				<tr>
					<td>Sorry, currently no events are planned</td>
				</tr>
			</c:if>
		</tbody>
	</table>
	<div>
		<a href="/spring-test/add-event"><button class="btn btn-success">+ Add new event</button></a>
	</div>
</body>
</html>