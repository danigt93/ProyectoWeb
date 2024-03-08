<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>
<header class="bg-dark text-white text-center py-3">
	<h2 class="card-title">Registro</h2>
		</header>
	<div class="container mt-5">
    
    <form method="post" action="http://localhost:8081/ProyectoWeb/ServletLeMans" name="LeMansForm">
    
			       <div class="form-group">
			            <label for="nombre">Nombre</label>
			            <input type="text" class="form-control" id="nombre" name="nombre">
			        </div>
			        <div class="form-group">
			            <label for="apellidos">Apellidos</label>
			            <input type="text" class="form-control" id="apellidos" name="apellidos">
			        </div>
			        <div class="form-group">
			            <label for="Dni">Dni</label>
			            <input type="text" class="form-control" id="Dni" name="Dni">
			        </div>
			        <div class="form-group">
			            <label>Sexo</label>
			            <div class="form-check">
			                <input type="radio" class="form-check-input" id="sexoH" name="sex" value="H">
			                <label class="form-check-label" for="sexoH">Hombre</label>
			            </div>
			            <div class="form-check">
			                <input type="radio" class="form-check-input" id="sexoM" name="sex" value="M">
			                <label class="form-check-label" for="sexoM">Mujer</label>
			            </div>
			        </div>
			        <div class="form-group">
			            <label for="idUsuario">ID de Usuario</label>
			            <input type="text" class="form-control" id="idUsuario" name="idUsuario">
			        </div>
			        <div class="form-group">
			            <label for="password">Contraseña</label>
			            <input type="password" class="form-control" id="password" name="password">
			        </div>
			        <div class="form-group">
			            <label for="email">Email</label>
			            <input type="email" class="form-control" id="email" name="email">
			        </div>
			        <div class="form-group">
			            <label for="telefono">Teléfono</label>
			            <input type="text" class="form-control" id="telefono" name="telefono">
			        </div>
			        <div class="form-group">
			            <label for="fechaNacimiento">Fecha de Nacimiento</label>
			            <input type="date" class="form-control" id="fechaNacimiento" name="fechaNacimiento">
			        </div>
			        <div class="form-group">
			            <label for="rol">Rol</label>
			            <input type="text" class="form-control" id="rol" name="rol">
			        </div>
			        <button type="submit" class="btn btn-primary">Guardar</button>
			    </form>
			</div>
			
		<footer class = "bg-dark text-white text-center py-3">
		<a href="#" onclick="history.go(-1)" class="btn btn-outline-light">Volver atras</a>
		</footer>


</body>
</html>