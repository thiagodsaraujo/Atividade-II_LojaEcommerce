<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Navigation-->
<nav class="navbar navbar-expand-lg navbar-dark fixed-top" id="mainNav">
	<div class="container">
		<a class="navbar-brand js-scroll-trigger" href="#page-top"><img
			src="assets/img/logos/logo.png" alt="Logo" /></a>
		<button class="navbar-toggler navbar-toggler-right" type="button"
			data-toggle="collapse" data-target="#navbarResponsive"
			aria-controls="navbarResponsive" aria-expanded="false"
			aria-label="Toggle navigation">
			Menu <i class="fas fa-bars ml-1"></i>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<c:if test="${usuarioLogado != null}">
				<ul class="navbar-nav text-uppercase ml-auto">
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="<c:url value="categorias"/>">Categorias</a></li>
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="<c:url value="produtos"/>">Produtos</a></li>
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="<c:url value="logout"/>">Sair</a></li>
				</ul>
			</c:if>

			<c:if test="${usuarioLogado == null}">
				<ul class="navbar-nav text-uppercase ml-auto">
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="<c:url value="produtos"/>">Produtos</a></li>
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="<c:url value="login"/>">Login</a></li>
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="<c:url value="cadastrar"/>">Cadastrar-se</a></li>
				</ul>
			</c:if>
		</div>
	</div>
</nav>