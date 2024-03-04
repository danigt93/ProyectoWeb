<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	        <h2><p>Registro</p></h2>
	        
	        <form method = "post" action="http://localhost:8081/ProyectoWeb/ServletLeMans" method="post" name="LeMansForm">
	      Nombre: 	 <input type="text" name="nombre"><br><br>
	      Apellidos: <input type="text" name="apellidos"><br><br>
	      Dni: <input type="text" name="Dni"><br><br>
	      
	      Sexo:		 
	      <input type="radio" name="sex" value="H"> Hombre </input>
	      <input type="radio" name="sex" value="M"> Mujer </input>
	      <br><br>
	      
	      idUsuario: <input type="text" name="idUsuario"><br><br>
	      Password: <input type="text" name="password"><br><br>
	      Email: <input type="text" name="email"><br><br>
	      Tlf: <input type="text" name="Teléfono"><br><br>
	      Fecha Nac.: <input type="text" name="fecha de nacimiento"><br><br>
	      Roll: <input type="text" name="Admin."><br><br>
	
			
		  <input type = "Submit" id="guardar" value="Guardar">
		  
		  </form>
</body>
</html>