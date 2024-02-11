
<%@ page errorPage="AddtionOfTwoNumbersErrorPage.jsp" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
	public int addNumber(int a,int b)
	{
		return a+b;
	}
	public int subNumber(int a,int b)
	{
	return a-b;
	}
	public int divNumber(int a,int b)
	{
	return a/b;
	}
	public int mulNumber(int a,int b)
	{
	return a*b;
	}
%>

<%
	String p = request.getParameter("val1");      
	String q = request.getParameter("val2");
	
	int a = Integer.parseInt(p);
	int b = Integer.parseInt(q);
	
	int result = addNumber(a,b);
	int result1 = subNumber(a,b);
	int result2 = divNumber(a,b);
	int result3 = mulNumber(a,b);
	
	//out.prinln(result);//this way also we can output the result
%>
<h1>Addition is:</h1><%= result%> 
<h1>Subtraction is:</h1><%= result1 %>
<h1>Division is:</h1><%= result2 %>
<h1>Multiplication is:</h1><%= result3 %>

</body>
</html>