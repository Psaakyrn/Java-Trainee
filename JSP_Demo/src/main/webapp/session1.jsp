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
int nn=Integer.parseInt(request.getParameter("age"));
out.print(n+", "+nn);
//session.setAttribute("thisname", n);
pageContext.setAttribute("thatname", n);
pageContext.setAttribute("sessionname", n,PageContext.SESSION_SCOPE);
pageContext.setAttribute("requestname", n,PageContext.REQUEST_SCOPE);
pageContext.setAttribute("applicationname", n,PageContext.APPLICATION_SCOPE);
%>
<br>
<a href="session2.jsp">next page</a>
</body>
</html>