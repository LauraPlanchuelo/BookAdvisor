<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<h1>Registro del lector:</h1><br><br>
	</head>
		
	
	<body>
		<form action="CreateLectorServlet" method="get">

			<input type="text" name="name" placeholder="Inserte su nombre" /><br>
			<input type="text" name="email" placeholder="Inserte su email" /><br>
			<input type="password" name="password" placeholder="Inserte su contraseña"><br>
	
			<input type="submit" value="Crear usuario"></input>


		</form>
	</body>
</html>
