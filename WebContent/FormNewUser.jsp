<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
	<head>
		<h1>Registro del lector:</h1><br><br>
	</head>
		
		<form action="CreateLectorServlet">

			<input type="text" name="name" placeholder="Nombre" /><br>
			<input type="text" name="email" placeholder="Email" /><br>
			<input type="password" name="password" placeholder="Password"><br>

			<input type="submit">Crear nuevo usuario</input>


		</form>
	</body>
</html>
