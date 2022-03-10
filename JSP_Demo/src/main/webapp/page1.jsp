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
String n=request.getParameter("uname");
out.print(n);
pageContext.setAttribute("thatname", n,PageContext.SESSION_SCOPE);
%>
<a href="page2.jsp">next page</a>
</body>
</html>