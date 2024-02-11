<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Example of Expression Tag tag</h1>

<% 
int a=10;
int b=20;
int ans = a+b;
//out.println("Addition is:"+ans);
%>

<h1>Addition is:</h1> <b><%= ans %></b>

<h1>Example Second Executed</h1>

</body>
</html>