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
	List <String> colores = new ArrayList(); 
	colores.add("Rojo");
	colores.add("Azul");
	colores.add("Amarillo");
	colores.add("Verde");
	for(String color : colores ) {
%> 

<li><%= color %></li>

<%  } %>
</ol>

</body>
</html>