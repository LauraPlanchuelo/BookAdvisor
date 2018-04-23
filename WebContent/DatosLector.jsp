<p>Nombre: ${lector.name}</p>
<p>Email: ${lector.email}</p>

<select name="Criticas">
	<option value="" disabled selected>Mis críticas:</option>
	<c:forEach items="${criticas_array}" var="criticai">
		<c:if test="${criticai.autor == lector.name}">
			 <option value=${criticai}>${criticai.titulo}</option>
		</c:if>  
	</c:forEach>
</select>