<form action="CreateFichaServlet" method="post">

	<input type="text" name="title" placeholder="Titulo del libro" />
	<input type="text" name="autor" placeholder="Autor del libro" />
	<input type="text" name="editorial" placeholder="Editorial del libro" />
	<input type="text" name="ISBN" placeholder="ISBN del libro" /> 

	<p>Fecha de publicacion del Libro:</p>

	<input type="text" name="fecha" placeholder="Fecha de publicacion: dd/mm/aaaa"/>

	<p style="color: #013252;" >
	<label for="categoria">Categoria del libro: 
		<select class="form-control" style="width: 250px;" name="categoria" id="categoria">
			<optgroup label="Categoria del libro">
				<option value="Terror">"Terror"</option>
				<option value="Ficcion">"Ficcion"</option>
				<option value="Romantica">"Romantica"</option>
				<option value="Autoayuda">"Autoayuda"</option>
				<option value="Comic">"Comic"</option>
				<option value="Historia">"Historia"</option>
				<option value="Ciencias">"Ciencias"</option>
				<option value="Aventura">"Aventura"</option>
				<option value="Biografia">"Biografia"</option>
				<option value="Otros">"Otros"</option>				
			</optgroup>
		</select>
	</label>
	</p>
		
	<input type="file" name="image" accept="image/*" />
	<input type="text" name="resenaEditorial" placeholder="Resena de la editorial" /> 

	<input type="submit" value="crear ficha de libro"></input>
	
	<br/>
	<br/>
	-----------------------------
	<br/>
	<br/>

</form>
