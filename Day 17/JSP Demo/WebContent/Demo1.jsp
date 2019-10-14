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


out.println("<h1><marquee>Hello JSP!</marquee></h1>");


%>

<%! String name = "Rahul Nair"; %>
<h1><font color ="red"> <%
out.println("Welcome "+name);
%><br>
<%="Welcome "+name %></font></h1>
</body>
</html>