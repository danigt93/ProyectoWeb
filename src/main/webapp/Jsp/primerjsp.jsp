<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, java.util.ArrayList"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
   out.print("<H1>Hola</H1>");
   int numero =	Integer.parseInt(request.getParameter("numero"));
   for (int i=0; i<numero; i++) { 
%>
<p>Esto es una prueba de jsp<%= numero %></p>
<% } %>

<ol>
<% 
	List<String> colores = new ArrayList();
	colores.add("Rojo");
	colores.add("Azul");
	colores.add("Amarillo");
	colores.add("Verde");
	for (String color : colores) {  
%> 
	<li><%= color %></li>
<% }%>
</ol>

<!-- <ol> -->
<!-- 	<li>Rojo</li> -->
<!-- 	<li>Azul</li> -->
<!-- 	<li>Amarillo</li> -->
<!-- 	<li>Verde</li> -->
<!-- </ol> -->


</body>
</html>