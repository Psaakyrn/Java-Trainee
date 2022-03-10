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
String n = application.getInitParameter("dbName");
out.print(application.getServerInfo());
out.print("<br>");
out.print("db: "+n);
%>
<form action='session1.jsp'>
name:<input type='text' name='uname'/>
<br>age:<input type='text' name='age'/>
<input type='submit' value='go'/>
</form>
<a href='gostraighttoerror'>error pls</a>

</body>
</html>