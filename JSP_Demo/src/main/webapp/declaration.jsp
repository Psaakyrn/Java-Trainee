<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!
int cube(int i)
{
	return i*i*i;
}
%>
<body>
<%= "Cube of 5 = " + cube(5) %>
</body>
</html>