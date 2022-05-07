package br.com.dankicommerce.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.dankicommerce.model.Usuario;

@Controller
@Path("cadastrar")
public class CadastrarController {
	
	
	@Inject EntityManager em;
	@Inject Result result;
	
	
	@Get("")
	public void cadastrar() {
		System.out.println("CADASTRAR");
	}

	
	@Post("salvaUsuario")
	public void salvaUsuario(Usuario usuario) {
		em.persist(usuario);
		// depois que persistir a classe vai redirecionar para a lsitagem de produtos
		result.redirectTo(ProdutosController.class).produtos();
	}
}
