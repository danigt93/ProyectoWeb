<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
    	//https://api.jquery.com/category/events/
		/*$(document).ready(function(){
			
			$('#AlumnoForm').submit(function(){
				
				alert($('#asignatura').val())
				if ($('#asignatura').val() ==0){
					alert("Debes seleccionar una asignatura")
					$('#asignatura').focus();
					return false
				}else{
					alert("Todo esta correcto")
					return true
				}
				
				
		    }); 
		});*/
		
</script>

</head>

<%

String nombre 	 = request.getParameter("nombre")!=null?request.getParameter("nombre"):"";
String apellidos = request.getParameter("apellidos")!=null?request.getParameter("apellidos"):"";
String sex = request.getParameter("sex")!=null?request.getParameter("sex"):"";
String asignatura = request.getParameter("asignatura")!=null?request.getParameter("asignatura"):"";

%>

<body>
<h1>CREACION ALUMNO</h1>
<form action="/ProyectoWebProfe/alumno" method="post" id="AlumnoForm" onsubmit="return enviar()">
	
	Nombre <input type="text" name="nombre" placeholder="Introduce tu nombre" tabindex="1" autofocus value="<%=nombre%>"><br> 
	Apellidos <input type="text" name="apellidos" placeholder="Introduce tu apellido" tabindex="2" value="<%=apellidos%>"><br>
	Sexo: 
	<input id="radio1" type="radio" name="sex" value="H" <%=sex.equals("H")?"checked":"" %> tabindex="3">Hombre</input>
	<input id="radio2" type="radio" name="sex" value="M" <%=sex.equals("M")?"checked":"" %>>Mujer</input>
	<input id="radio3" type="radio" name="sex" value="O" <%=sex.equals("O")?"checked":"" %>>Otros</input>
	<br>

	
	<select id="asignatura" name="asignatura" required tabindex="4">
		<option value="0">Seleccione una opciÛn</option>
		<option value="Mate" <%=asignatura.equals("Mate")?"selected":"" %>>Matem√°ticas</option>
		<option value="Hist" <%=asignatura.equals("Hist")?"selected":"" %>>Histor√≠a</option>
		<option value="Quim" <%=asignatura.equals("Quim")?"selected":"" %>> QuÌmica</option>
	</select>
	<br>
	Descripci√≥n<br>
	<textarea name="descripcion" cols="20" tabindex="2">
		
	</textarea>
	<br>
	<input id="guardar" type="submit" value="Guardar" >
	
</form>

<script type="text/javascript">
		
		function enviar(){
			//alert(document.getElementById("asignatura").value)
			if (document.getElementById("asignatura").value ==0){
				//alert("Debes seleccionar una asignatura")
				document.getElementById("asignatura").focus()
				return false
			}else{
				//alert("Todo esta correcto")
				return true
			}
		}
		
</script>
</body>
</html>

