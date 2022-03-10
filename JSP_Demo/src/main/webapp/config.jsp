<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
String dbDriver = config.getInitParameter("dbname");
String servletName = config.getServletName();
out.print("welcome "+request.getParameter("userName"));

out.print("<br>Servlet name is "+servletName+", Driver name is "+dbDriver);
%>
</body>
</html>