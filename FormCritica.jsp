
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Critica del libro:</title>
	</head>
	<body>

		<p>Nombre: ${lector.name}</p>
		<p>Apellidos: ${lector.Apellidos}</p>
		<p>Email: ${lector.email}</p>
		<p>Titulo del libro: ${libro.titulo}</p>

		<input type="text" name="critica" placeholder="Crítica del libro..." /> 

		<input type="submit">Crear nueva crítica</input>

	</body>
</html>