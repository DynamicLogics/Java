<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@page import="ServeletsUsed.userdatabase"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:8080/LoginApplication/validate" method="get">
<h1>UserName<input type="text" name="name"></h1>
<h1>Password<input type="password" name="password"></h1>
<button>login</button><br><br>



<a href="registeruser.jsp">Get Register</a>
</form>
</body>
</html>
