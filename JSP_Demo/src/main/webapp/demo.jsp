<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.println("hello!"); %>
<a href="welcome.jsp">welcome?</a>
<form action='welcome.jsp'>
<input type='text' name='uname' value='<% if(request.getParameter("username")!=null){out.print(request.getParameter("username"));}  %>'/>
<input type='submit' name='go'/>
</form>
</body>
</html>