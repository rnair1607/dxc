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
String username = request.getParameter("username");
String password = request.getParameter("password");
if(username.length()==0 || password.length()==0){
%>
<jsp:forward page="Index.jsp?a=Username or password not entered"></jsp:forward>
<%
}
else{
}%>
</body>
</html>