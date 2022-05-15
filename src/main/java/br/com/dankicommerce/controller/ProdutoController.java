package br.com.dankicommerce.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.dankicommerce.dao.ProdutoDAO;
import br.com.dankicommerce.model.Produto;

@Controller
@Path("produto")
public class ProdutoController {
	// get 		/ produto listagem de produtos
	// get 		/ produto/1 obeter o produto de id 1
	// post 	/ produto criar um novo produto {"nome"}
	// put 		/produto/1 {"nome"}
	// delete 	/produto/1
	
	@Inject ProdutoDAO produtoDao;
	@Inject Result result;
	
	
	@Get("")
	public void listagemDeProdutos() {
		List<Produto> produtos = produtoDao.selectAll();
		
		result.use(Results.json())
		.withoutRoot()
		.from(produtos)
		.include("imagem")
		.serialize();
	}
}
