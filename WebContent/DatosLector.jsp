<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Datos del lector:</title>
	</head>
	<body>

		<p>Nombre: ${lector.name}</p>
		<p>Apellidos: ${lector.apellidos}</p>
		<p>Email: ${lector.email}</p>

		<select name="Criticas">
		    <option value="" disabled selected>Mis críticas:</option>
		    <c:forEach items="${criticas_array}" var="criticai">
		    	<c:if test="${criticai.autor == lector.name}">
					 <option value=${criticai}>${criticai.titulo}</option>
				</c:if>  
		    </c:forEach>
		</select>

	</body>
</html>