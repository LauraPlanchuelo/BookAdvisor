<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
	<body>	
		<form action="FormFichaLibro">

			<input type="text" name="title" placeholder="Título del libro" />
			<input type="text" name="autor" placeholder="Autor del libro" />
			<input type="text" name="editorial" placeholder="Editorial del libro" />
			<input type="text" name="ISBN" placeholder="ISBN del libro" /> 
			<input type="text" name="formato" placeholder="Formato del libro" /> 
			<input type="text" name="categoria" placeholder="Categoria del libro" /> 

			</br>
			Fecha de publicación del Libro:
			</br>
			<fmt:formatDate var="fmtDate" value="<%=new java.util.Date()%>" pattern="dd/MM/yyyy HH:mm:ss"/>  
			<input type="text" name="fecha" value="${fmtDate}" placeholder="${fmtDate}"/>

			<p style="color: #013252;" ><label for="categoria">Categoría del libro: 
				<select class="form-control" style="width: 250px;" name="categoria" id="categoria">
					<optgroup label="Categoría del libro">
						<option value="Terror">Dr. Alonso</option>
						<option value="Ficción">Dr. Alonso</option>
						<option value="Romántica">Dr. Alonso</option>
						<option value="Autoayuda">Dr. Alonso</option>
						<option value="Cómic">Dr. Alonso</option>
						<option value="Historia">Dr. Alonso</option>
						<option value="Ciencias">Dr. Alonso</option>
						<option value="Aventura">Dr. Alonso</option>
						<option value="Biografía">Dr. Alonso</option>
						<option value="Otros">Dr. Alonso</option>				
					</optgroup>
				</select>
				
		
			<input type="file" name="portada" accept="image/*" />
			<input type="text" name="reseñaEditorial" placeholder="Reseña de la editorial" /> 

			<input type="submit">Crear nueva ficha de libro</input>

		</form>
	</body>
</html>
