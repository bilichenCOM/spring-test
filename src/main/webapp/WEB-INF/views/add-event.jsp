<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Add event</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
</head>
<body class="bg-dark">
	  <spring:form modelAttribute="event" action="./add-event" method="post" class="form-signin jumbotron">
      <h1 class="h3 mb-3 font-weight-normal">New event</h1>
      <label for="eventName" class="sr-only">Name</label>
      <spring:input path="name" id="eventName" class="form-control" placeholder="Event name" required="true" />
      <button class="btn btn-lg btn-primary btn-block" type="submit">Add event</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
      </spring:form>
</body>
</html>