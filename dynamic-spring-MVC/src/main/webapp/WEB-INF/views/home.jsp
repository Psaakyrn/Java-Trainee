<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Home page</h1>
<p>Time is ${serverTime}.</p>
<form:form  name="submitForm" method="POST" action="user" modelAttribute="User">
<form:input path="username"/>
<input type="submit" name="Go" />

</form:form>

</body>
</html>