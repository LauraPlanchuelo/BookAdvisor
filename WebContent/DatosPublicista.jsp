<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Vista del publicista:</title>
	</head>
		<body>

		<p>Nombre: ${publicista.name}</p>
		<p>Email: ${publicista.email}</p>
		<p>URL: ${publicista.url}</p>
		<p>Direccion: ${publicista.address}</p>

		
		<select name="Noticias">
		    <option value="" disabled selected>Mis noticias:</option>
		    <c:forEach items="${noticias_array}" var="noticiasi">
		    	<c:if test="${noticiai.autor == publicista.name}">
					 <option value=${noticiai}>${noticiai.titulo}</option>
				</c:if>  
		    </c:forEach>
		</select>

	</body>
</html>
