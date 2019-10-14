<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.CheckMax" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int num1 = 12;
int num2 = 12;
CheckMax check = new CheckMax();
int max = check.Max(num1,num2);
%>
<%= "Maximum: "+max %>
</body>
</html>