<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="st" uri="helloTags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<i>Insert custom tag below.</i>
<br>
  <st:ctag/><br>
  <st:cdate/>
<br>
<i>Insert custom tag above.</i>
<br>
<i>Insert jstl tab below.</i>
<br>
<c:set var="now" value="<%=new java.util.Date()%>" />
Current date: <fmt:formatDate value="${now}" type="date" /><br/>
Current time: <fmt:formatDate value="${now}" type="time" />
<br>
<i>Insert jstl tab above.</i>
<br><a href="http://localhost:8080/JSP_Demo/">back to index</a>
</body>
</html>