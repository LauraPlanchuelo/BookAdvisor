<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
  <div class="container">
	<a class="navbar-brand js-scroll-trigger" href="index.jsp" >BookAdvisor</a>
	<button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
	  Menu
	  <i class="fa fa-bars"></i>
	</button>
	<div class="collapse navbar-collapse" id="navbarResponsive">
	  <ul class="navbar-nav ml-auto">
		<li class="nav-item">
		  <a class="nav-link js-scroll-trigger" href="catalogo.jsp" onmouseover="this.style.color='orange';" onmouseout="this.style.color=''">Catálogo</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link js-scroll-trigger" href="noticias.jsp" onmouseover="this.style.color='orange';" onmouseout="this.style.color=''">Tablón de noticias</a>
		</li>
		
		<%
			Cookie[] cookies = request.getCookies();
			boolean found = false;
			if (cookies != null) {
				for (int i = 0; i < cookies.length; i++) {
					if (cookies[i].getName().equals("user")) {
						out.println("<li class=\"nav-item\">"+
									"<a class=\"nav-link js-scroll-trigger\" href=\"micuenta.jsp\" onmouseover=\"this.style.color='orange';\" onmouseout=\"this.style.color=''\">Mi Cuenta</a>"+
									"</li>"+
									"<li class=\"nav-item\">"+
									"<a class=\"nav-link js-scroll-trigger\" href=\"publicar.jsp\" onmouseover=\"this.style.color='orange';\" onmouseout=\"this.style.color=''\">Publicar</a>"+
									"</li>");
						found = true;
					}
				}
			}
			if (!found) {
				out.println("<li class=\"nav-item\">"+
							"<a class=\"nav-link js-scroll-trigger\" href=\"iniciarsesion.jsp\" onmouseover=\"this.style.color='orange';\" onmouseout=\"this.style.color=''\">Iniciar Sesión / Registrarse</a>"+
							"</li>");
			}
		%>
		
	  </ul>
	</div>
  </div>
</nav>