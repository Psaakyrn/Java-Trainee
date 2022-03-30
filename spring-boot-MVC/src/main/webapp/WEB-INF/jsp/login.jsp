<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C/DTD//HTML 5 Transactional//EN" "http://www.w3.org/TR/html5/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form  name="submitForm" method="POST" action="/login" modelAttribute="loginBean">
<div align="center">
<div style="color:red">${error}</div>
<div style="color:blue">${msg}</div>
<table>
<tr>
<td>Username:</td><td><form:input path="username"/></td>
</tr>
<tr>
<td>Password:</td><td><form:password path="password"/></td>
</tr>
<tr>
<td><input type="submit" value="go"/></td>
</tr>
</table>
</div>
</form:form>

</body>
</html>