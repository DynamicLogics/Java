<!-- Tag to import an library -->
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String value2 = "outside service method";
	//Importing an library
	Date d = new Date(); 
%>
<% String value = "Inside Service Methods"; %>
<%= value2 %>
</body>
</html>