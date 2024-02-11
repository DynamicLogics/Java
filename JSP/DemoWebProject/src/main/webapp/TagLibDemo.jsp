<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- 
	Here to use libraries inside the JSP we need to use taglib option 
	and in uri we declare the library name	
--> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- this below tag are known as expression language -->
	<!-- ${label} -->
	
	<!-- used to find length of the string -->
	${fn:length(label)}
	<br><br>
	
	<!-- here i'am splitting string based on spaces within that string -->
	<c:forEach items="${fn:split(label,' ')}" var="s">
		<br>
		${s}
	</c:forEach>
	<br><br>
	
	<!-- find the index number of an word in an string -->
	index: ${fn:indexOf(label,"name")}
	
	<!-- find if and particular word is present inside the string or not -->	
	<c:if test="${fn:contains(label,'Shubham')}">
		<br>
		The name 'Shubham' is present.
	</c:if>
</body>
</html>