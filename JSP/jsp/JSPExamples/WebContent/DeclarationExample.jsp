<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Declaration Tag Example </title>
</head>

<body>
<h1>Declaration Tag Example</h1>

<%!  //way to declare decalration
public int addnumber(int no1,int no2)
{
	int ans=0;
	ans=no1+no2;
	return ans;
	
}
%>

<%
	int result = addnumber(10,20);
	out.println(result);
%>

<h1>Addition is:</h1><%= result %>

</body>
</html>