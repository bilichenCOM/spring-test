<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Apply as new user</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
</head>
<body class="bg-dark">
	<div class="container">
	<spring:form modelAttribute="user" action="./for-event?event_id=${eventId}" method="post" class="form-signin jumbotron">
      <h1 class="h3 mb-3 font-weight-normal">New user</h1>
      <label for="userFirstName" class="sr-only">First name</label>
      <spring:input path="firstName" id="userFirstName" class="form-control" placeholder="First name" required="true" />
      <label for="userLastName" class="sr-only">Last name</label>
      <spring:input path="lastName" id="userLastName" class="form-control" placeholder="Last name" required="true" />
      <label for="userEmail" class="sr-only">Email</label>
      <spring:input path="email" id="userEmail" class="form-control" placeholder="Email" required="true"/>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Apply for event</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
      </spring:form>
   	</div>
</body>
</html>