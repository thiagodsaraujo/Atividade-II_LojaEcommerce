package br.com.dankicommerce.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.dankicommerce.dao.UsuarioDAO;
import br.com.dankicommerce.model.Usuario;
import br.com.olimposistema.aipa.dao.DAO;

@Controller
@Path("cadastrar")
public class CadastrarController {
	
	
	@Inject EntityManager em;
	@Inject Result result;
	@Inject UsuarioDAO usuarioDAO;
	@Inject Validator validator;
	
	
	@Get("")
	public void cadastrar() {

	}

	@IncludeParameters // por debaixo dos panos, todo parametro que passar para o método ele é auto incluido no jsp
	@Post("salvaUsuario")
	public void salvaUsuario(@Valid Usuario usuario, String confirmaSenha) {

		// se tiver erro na validação redireciona para cadastrar novamente, vai redirecionar para a mesma classe(this)
		boolean asSenhasSaoIguais = usuario.getSenha().equals(confirmaSenha);
		validator.ensure(asSenhasSaoIguais, new SimpleMessage("ERRO!", "As senhas não coincidem!"));
		validator.onErrorRedirectTo(this).cadastrar();
		
		// salvar no bd
		// usuarioDAO.insert(usuario)/update/delete/searchById
		// nao vai precisar usar mais o entity manager, usaremos o DAO
		
		usuarioDAO.insert(usuario);
		
		// depois que persistir a classe vai redirecionar para a lsitagem de produtos
		
		result.redirectTo(ProdutosController.class).produtos();
	}
}
