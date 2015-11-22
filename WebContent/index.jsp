<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP</title>
</head>
<body>
	<%
		String times = request.getParameter("time");
		if(times == null)	times = "Ainda sem nada..";
	%>
	<h1>Campeonato Brasileiro 2015</h1>
	<p>Ola, <%= times %>
</body>
</html>