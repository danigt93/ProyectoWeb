<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, java.util.ArrayList"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<ol>
<%
	List <String> usuarios = new ArrayList(); 
	usuarios.add("usuario");
	for(String usuario : usuarios ) {
%> 

<li><%= usuario %></li>

<%  } %>
</ol>

</body>
</html>