<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>WELCOME TO LE MANS</title>
    <style>
		p{
			font-family: Arial, Helvetica, sans-serif;
		}
		
		body{
			background-image: url("./imgLeMans/bathurst-1000-wednesday-1-2.jpg");
	   	 	background-size: cover;
	   	 	margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            position: relative;
		}

         form {
            text-align: center;
            box-shadow: 0px 0px 20px rgba(0, 0, 0, 2.75); 
            border-radius: 10px; 
            padding: 20px;
        }

        input {
            margin-bottom: 10px;
            padding: 8px;
        }
        
        input[type="submit"] {
            background-color: deepskyblue;
            font-family: Arial, Helvetica, sans-serif;
            color: #fff;
            cursor: pointer;
        }

         #botones-derecha button { 
             max-width: 2cm;
             position: absolute; 
             top: 10px; 
             right: 10px;
         }
        
    </style>
</head>
<body>


   <form action="/ProyectoWeb/ProyectoLeMans" method="post">
  	 <h2><p>Inicio Sesión</p></h2>
       <input type="email"
		 	placeholder="Email" 
		 	id="email" required><br>
		 	
	   <input type="password"
		 	placeholder="Password"
            id="password"
            maxlength="10"
            required><br>
        <input type="submit" value="Log in">
    </form>


   		<button type="button" onmouseover="Add">
	    	<img src="./imgLeMans/Login.jpg" width="25" height="25" alt="Nuevo Usuario">
		</button>
		
		<button type="button" onmouseover="Mod">
 	    	<img src="./imgLeMans/Add.png" width="25" height="25" alt="Modificar Usuario">
		</button>
		
		<button type="button" onmouseover="Delete">
 	    	<img src="./imgLeMans/Exit.jpg" width="25" height="25" alt="Borrar Usuario">
		</button>
		
</body>
</html>