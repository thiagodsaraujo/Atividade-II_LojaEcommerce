package br.com.dankicommerce.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.dankicommerce.model.Produto;
import br.com.olimposistema.aipa.dao.DAO;

@Controller
@Path("produtos")
public class ProdutosController {

	@Inject Result result;
	@Inject DAO<Produto> produtoDao;
	
	@Get("")
	public void produtos() {
		result.include("produtos", produtoDao.selectAll());
	}
}
