package br.com.dankicommerce.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.dankicommerce.model.Usuario;
import br.com.olimposistema.aipa.dao.DAO;

@Controller
@Path("cadastrar")
public class CadastrarController {
	
	
	@Inject EntityManager em;
	@Inject Result result;
	@Inject DAO<Usuario> usuarioDAO;
	
	
	@Get("")
	public void cadastrar() {
		System.out.println("CADASTRAR");
	}

	
	@Post("salvaUsuario")
	public void salvaUsuario(Usuario usuario) {
		// salvar no bd
		// usuarioDAO.insert(usuario)/update/delete/searchById
		// nao vai precisar usar mais o entity manager, usaremos o DAO
		usuarioDAO.insert(usuario);
		// depois que persistir a classe vai redirecionar para a lsitagem de produtos
		result.redirectTo(ProdutosController.class).produtos();
	}
}
