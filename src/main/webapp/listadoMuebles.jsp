<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Map"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Map<String, Object> mapa = (Map<String, Object>) request.getAttribute("mapa");
	


%>


<h1><%=request.getAttribute("subtitulo") %></h1>
</body>
</html>