<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Map, java.util.List, pojos.Muebles.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Map<String, Object> mapa = (Map<String, Object>)request.getAttribute("mapa");
	List<Mueble> muebles = (List<Mueble>)mapa.get("listadoMuebles");
%>


<h1><%=mapa.get("subtitulo")  %></h1>

<h2>Mesas</h2>
<% 
	for (Mueble mueble : muebles){
		if (mueble instanceof Mesa){ 
		Mesa mesa = (Mesa)mueble; %>
		
		<p><%=mesa.getNombre()%> <%=mesa.getPrecio()%> <%=mesa.getEstilo()%></p>
	
<%		}  
	} %>


<h2>Sofás</h2>
<% 
	for (Mueble mueble : muebles){
		if (mueble instanceof Sofa){ 
		Sofa sofa = (Sofa)mueble; %>
		
		<p><%=sofa.getNombre()%> <%=sofa.getPrecio()%> <%=sofa.getColor()%></p>
	
<%		}  
	} %>
	
<h2>Lámparas</h2>
<% 
	for (Mueble mueble : muebles){
		if (mueble instanceof Lampara){ 
			Lampara lampara = (Lampara)mueble; %>
		
		<p><%=lampara.getNombre()%> <%=lampara.getPrecio()%> <%=lampara.getPotencia()%></p>
	
<%		}  
	} %>

	
	



</body>
</html>