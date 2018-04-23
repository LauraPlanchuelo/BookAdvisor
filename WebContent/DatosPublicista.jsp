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
