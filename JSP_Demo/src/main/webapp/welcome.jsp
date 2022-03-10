<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome
<% 
String n = request.getParameter("uname");
if(n==null){n="default user";}
out.print(n);
%>
</body>
</html>