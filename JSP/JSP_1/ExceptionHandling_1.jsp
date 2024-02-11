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
	try{
		int i = 11/0;
		out.println(i);
	}catch(Exception e){
		out.println("Error: "+e.getMessage());
	}
%>
</body>
</html>