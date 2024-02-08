<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,pojos.Alumno"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>LISTADO ALUMNOS</h1>
<%
	List<Alumno> alumnos = (List<Alumno>)request.getAttribute("atributoListadoAlumnos");
	System.out.println("Num alumnos "+alumnos.size());
%>

<table>
	<tr>
		<th></th>
		<th>Nombre</th>
		<th>Apellidos</th>
		<th>Sexo</th>
		<th>Asignatura</th>
		<th>Descripción</th>
	</tr>
<%
	for(Alumno alumno : alumnos){
%>
	<tr>
		<td><a href="/ProyectoWebProfe/ejercicioalumno/
				alumnohtml.jsp?nombre=<%=alumno.getNombre()%>
				&apellidos=<%=alumno.getApellidos()%>
				&sex=<%= alumno.getSex()%>
				&asignatura=<%= alumno.getAsignaturas()[0]%>"
				
				>Modificar</a></td>
		<td><%= alumno.getNombre()  %></td>
		<td><%= alumno.getApellidos()  %></td>
		<td><%= alumno.getSex()  %></td> 
		<td><%= alumno.getAsignaturas()[0]  %></td>
		<td><%= alumno.getDescripcion()  %></td>
	</tr>
<%	} %>

</table>
<button onclick="">Nuevo Alumno</button>

</body>
</html>