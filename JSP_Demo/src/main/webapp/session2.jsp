<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome again, 
<%
String name=(String)session.getAttribute("thisname");
out.print(name);
%>
<br>
Also session, 
<%
String name2=(String)pageContext.getAttribute("sessionname",pageContext.SESSION_SCOPE);
out.print(name2);
%>
</body>
</html>