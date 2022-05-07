package br.com.dankicommerce.controller;


import javax.inject.Inject;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

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
@Path("login")
public class LoginController {
	
	@Inject Result result;
	@Inject Validator validator;
	@Inject UsuarioDAO usuarioDao;

	
	@Get("")
	public void login() {
	}
	
	@IncludeParameters
	@Post("autenticar")
	public void autenticar(
			@NotEmpty String email, 
			@NotEmpty @Size(min = 4, max = 20, message = "{usuario.senha.size}")String senha) {
		validator.onErrorRedirectTo(this).login();
		
		Usuario usuario = usuarioDao.existeUsuarioCom(email, senha);
		
		validator.addIf(usuario == null, new SimpleMessage("erro", "Email ou Senha inválidos"));
		validator.onErrorRedirectTo(this).login();
		
		result.redirectTo(ProdutosController.class).produtos();
	}
	
}
