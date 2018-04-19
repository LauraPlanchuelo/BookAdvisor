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
		<p>Publicista: ${publicista.name}</p>
		<p>Localización: ${publicista.localizacion}</p>
		<p>Email: ${publicista.email}</p>

		<input type="hidden" name="pub_name" value="${publicista.name}" />

		<input type="text" name="titulo" placeholder="Titulo" /> 
		<input type="text" name="noticia" placeholder="Noticia del libro..." /> 

		<input type="submit">Crear nueva noticia</input>

	</body>
</html>