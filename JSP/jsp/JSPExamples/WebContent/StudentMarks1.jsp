
<%@page import="dao.StudentMarksDao"%>
<%@page import="BeansUsed.Studentmarks2"%>
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
String name  = request.getParameter("name");
int java = Integer.parseInt(request.getParameter("java"));
int cpp =Integer.parseInt(request.getParameter("cpp"));
int os =Integer.parseInt(request.getParameter("os"));
int total=0;
float percentage=0;

//Studentmarks2 student = new Studentmarks2(name,java,cpp,os,total,percentage);
//student.calculate();

	Studentmarks2 student = new Studentmarks2(name,java,cpp,os,total,percentage);

	StudentMarksDao dao = new StudentMarksDao();
	dao.save(student);

%>

<center><h1>Student Result</h1></center>
<hr/>

<h3>Name<%= student.getName()%></h3>
<h3>Cpp<%= student.getCpp()%></h3>
<h3>Java<%= student.getJava()%></h3>
<h3>Os <%=  student.getOs() %></h3>
<h3>Total<%= student.getTotal()%></h3>
<h3>Percentage<%= student.getPercentage()%></h3>


</body>
</html>