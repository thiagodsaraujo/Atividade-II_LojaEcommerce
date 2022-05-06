package br.com.dankicommerce.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.dankicommerce.model.Usuario;

@Controller
@Path("cadastrar")
public class CadastrarController {
	@Get("")
	public void cadastrar() {
		System.out.println("CADASTRAR");
	}

	
	@Post("salvaUsuario")
	public void salvaUsuario(Usuario usuario) {
		System.out.println("#################");
		System.out.println(usuario.getNome());
	}
}
