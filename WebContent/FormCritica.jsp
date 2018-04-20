<form action="CreateFichaServlet">
	<p>Nombre: ${lector.name}</p>
	<p>Email: ${lector.email}</p>
	<p>Titulo del libro: ${libro.titulo}</p>

	<input type="text" name="critica" placeholder="Crítica del libro..." /> 

	<input type="submit">Crear nueva crítica</input>
</form>