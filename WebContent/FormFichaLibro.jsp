<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
	<body>	
		<form action="CreateFichaServlet" method="post">

			
			<input type="text" name="titulo" placeholder="Título del libro" /><br>
			<input type="text" name="autor" placeholder="Autor del libro" /><br>
			<input type="text" name="editorial" placeholder="Editorial del libro" /><br>
			<input type="text" name="ISBN" placeholder="ISBN del libro" /><br>
			<input type="text" name="formato" placeholder="Formato del libro" /><br>
			<input type="text" name="categoria" placeholder="Categoria del libro" /><br>

			Fecha de publicación del Libro:<br>
			<fmt:formatDate var="fmtDate" value="<%=new java.util.Date()%>" pattern="dd/MM/yyyy HH:mm:ss"/>  
			<input type="text" name="fecha" value="${fmtDate}" placeholder="${fmtDate}"/><br>
			
			<p style="color: #013252;" ><label for="categoria">Categoría del libro: 
				<select style="width: 250px;" name="categoria">
					<optgroup label="Categoría del libro">
						<option value="Terror">Terror</option>
						<option value="Ficción">Ficción</option>
						<option value="Romántica">Romántica</option>
						<option value="Autoayuda">Autoayuda</option>
						<option value="Cómic">Cómic</option>
						<option value="Historia">Historia</option>
						<option value="Ciencias">Ciencias</option>
						<option value="Aventura">Aventura</option>
						<option value="Biografía">Biografía</option>
						<option value="Otros">Otros</option>				
					</optgroup>
				</select>
			<br>
			<input type="file" name="portada" accept="image/*" /><br>
			<input type="text" name="reseñaEditorial" placeholder="Reseña de la editorial" /><br>

			<input type="submit">Crear nueva ficha de libro</input>

		</form>
	</body>
</html>
