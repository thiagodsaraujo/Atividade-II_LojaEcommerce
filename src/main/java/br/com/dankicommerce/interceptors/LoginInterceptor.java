package br.com.dankicommerce.interceptors;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.AcceptsWithAnnotations;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;
import br.com.dankicommerce.controller.LoginController;
import br.com.dankicommerce.model.Usuario;
import br.com.olimposistema.aipa.service.Util;

@Intercepts
@AcceptsWithAnnotations(SomenteLogado.class) // só vai executar quando tiver anotado com somentelogado
public class LoginInterceptor {
	
	@Inject HttpSession session;
	@Inject Result result;
	
	
	@AroundCall // toda chamada feita pelos controladores vai cair aqui
	public void continuaSeOUsuarioEstaLogado(SimpleInterceptorStack stack) {
		
		Usuario usuario = (Usuario) session.getAttribute("usuarioLogado");
		if(Util.isNull(usuario)) result.redirectTo(LoginController.class).login();
		else stack.next();
	}
	
}
