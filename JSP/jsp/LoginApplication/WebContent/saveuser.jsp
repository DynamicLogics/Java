
<%@page import="ServeletsUsed.userdatabase"%>
<%@page import="ServeletsUsed.userclass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String name = request.getParameter("name");
String password = request.getParameter("password");
String confirmpasswprd = request.getParameter("confirmPasswprd");

	userclass user = new userclass(name,password,confirmpasswprd);
	
	userdatabase dao = new userdatabase();
	dao.save(user);
%>


<h2>Name<%=user.getName()%></h2>
<h2>Password<%=user.getPassword()%></h2>

</body>
</html>