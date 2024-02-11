<!-- use the below tag to use spring tags inside your html page -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<head>Created Student Using Spring Form Tag Technique...</head>
<body>
<!-- "student" used in "modelAttribute" below should be same as given in
 student controller class => "addAttribute("student",theStudent);" -->
<form:form action="processForm" modelAttribute="student">
<!-- here the firstname and lastname are the getter and setter method name 
from the student class  -->
	First Name: <form:input path="firstName"/>
	<br><br>
	Last Name: <form:input path="lastName"/>
	<br><br>
	<input type="submit" value="confirm"/>
</form:form>
</body>
</html>

