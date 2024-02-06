<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>LISTADO MUEBLES</h1>

<%
	List<Muebles> muebles = (List<Muebles>)request.getAttribute("listadoMuebles");

	for (Muebles mueble: muebles){
%>
	<p><%= mueble %></p>
<%} %>
<table>

</table>


</body>
</html>