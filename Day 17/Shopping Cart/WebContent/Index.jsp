<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String msg1 = request.getParameter("a"); %>
<form action="Check.jsp">
Username: <input type="text" name="username"><br>
Password: <input type="password" name="password"><br>
<input type="submit" value="Go"><br>
<%
	if(msg1 == null){
	msg1 = "";
	}
%>
<font color="red"><%= msg1 %></font>


</form>
</body>
</html>