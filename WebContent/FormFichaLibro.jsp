<form action="CreateFichaServlet" method="post" enctype="multipart/form-data">

	<input type="text" name="title" placeholder="Título del libro" />
	<input type="text" name="autor" placeholder="Autor del libro" />
	<input type="text" name="editorial" placeholder="Editorial del libro" />
	<input type="text" name="ISBN" placeholder="ISBN del libro" /> 
	<input type="text" name="formato" placeholder="Formato del libro" /> 
	<input type="text" name="categoria" placeholder="Categoria del libro" /> 

	<p>Fecha de publicación del Libro:</p>

	<fmt:formatDate var="fmtDate" value="<%=new java.util.Date()%>" pattern="dd/MM/yyyy HH:mm:ss"/>  
	<input type="text" name="fecha" value="${fmtDate}" placeholder="${fmtDate}"/>

	<p style="color: #013252;" ><label for="categoria">Categoría del libro: 
		<select class="form-control" style="width: 250px;" name="categoria" id="categoria">
			<optgroup label="Categoría del libro">
				<option value="Terror">"Terror"</option>
				<option value="Ficción">"Ficción"</option>
				<option value="Romántica">"Romántica"</option>
				<option value="Autoayuda">"Autoayuda"</option>
				<option value="Cómic">"Cómic"</option>
				<option value="Historia">"Historia"</option>
				<option value="Ciencias">"Ciencias"</option>
				<option value="Aventura">"Aventura"</option>
				<option value="Biografía">"Biografía"</option>
				<option value="Otros">"Otros"</option>				
			</optgroup>
		</select>
		

	<input type="file" name="portada" accept="image/*" />
	<input type="text" name="reseñaEditorial" placeholder="Reseña de la editorial" /> 

	<input type="submit">Crear nueva ficha de libro</input>

</form>
