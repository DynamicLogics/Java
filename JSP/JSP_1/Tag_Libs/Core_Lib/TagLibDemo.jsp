<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- 
	Here to use libraries inside the JSP we need to use taglib option 
	and in uri we declare the library name	
--> 
<%@ taglib prefix="cu" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- this below tag are known as expression language -->
	<!-- ${label} -->
	
	<cu:out value="${label}"></cu:out>
	
</body>
</html>