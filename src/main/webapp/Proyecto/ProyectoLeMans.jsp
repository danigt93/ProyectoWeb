<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>WELCOME TO LE MANS</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
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

         .botones-derecha {
            position: absolute;
            top: 20px;
            right: 20px;
        }
        
    </style>
</head>
<body>

<div class="container mt-5">
    <form action="ServletLeMans" method="post">
        <h2>Inicio Sesión</h2>
        <div class="form-group">
            <label for="email">Email address</label>
            <input type="email" class="form-control" id="email" name="email" placeholder="Enter email" required>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" name="password" maxlength="10" placeholder="Password" required>
        </div>
        <button type="submit" class="btn btn-primary">Log in</button>
    </form>

    <div class="botones-derecha mt-3">
        <button type="button" class="btn btn-light" onmouseover="Add">
            <img src="./imgLeMans/Login.jpg" width="25" height="25" alt="Nuevo Usuario">
        </button>

        <button type="button" class="btn btn-light" onmouseover="Mod">
            <img src="./imgLeMans/Add.png" width="25" height="25" alt="Modificar Usuario">
        </button>

        <button type="button" class="btn btn-light" onmouseover="Delete">
            <img src="./imgLeMans/Exit.jpg" width="25" height="25" alt="Borrar Usuario">
        </button>
    </div>
</div>

</body>
</html>