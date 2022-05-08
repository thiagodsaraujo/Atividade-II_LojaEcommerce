package br.com.dankicommerce.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
@Path("logout")
public class LogoutController {
	
	@Inject HttpSession session;
	@Inject Result result;
	
	
	@Get("")
	public void logout() {
		// encessar a sessao
		session.removeAttribute("usuarioLogado");
		
		// redirecionar para o login
		result.redirectTo(LoginController.class).login();
	}

}
