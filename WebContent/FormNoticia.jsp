		<p>Publicista: ${publicista.name}</p>
		<p>Localización: ${publicista.localizacion}</p>
		<p>Email: ${publicista.email}</p>

		<form action="CreateNoticiaServlet">
			<input type="hidden" name="pub_name" value="${publicista.name}" />

			<input type="text" name="titulo" placeholder="Titulo" /> 
			<input type="text" name="noticia" placeholder="Noticia del libro..." /> 

			<input type="submit">Crear nueva noticia</input>
		</form>