package br.com.dankicommerce.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.dankicommerce.dao.ProdutoDAO;
import br.com.dankicommerce.model.Categoria;
import br.com.dankicommerce.model.Produto;
import br.com.olimposistema.aipa.dao.DAO;

@Controller
@Path("produtos")
public class ProdutosController {

	@Inject Result result;
	@Inject ProdutoDAO produtoDao; // substituimos o ProdutoDAO mais genérico pelo especifico
	@Inject DAO<Categoria> categoriaDao;
	
	@IncludeParameters
	@Get("")
	public void produtos(Produto filtro) {
		result.include("categorias", categoriaDao.selectAll());
		
//		result.include("produtos", produtoDao.buscaTodosOsProdutosOrdenadoPeloValor());
		if(filtro != null) {
			// passa um modelo e retorna uma lista filtrada, vai verificar com o nome preenchido ou com o id da cat preenchida.
			// filtro bem genérico
			// reflections e injeção de dependencia e monta uma query para pesquisar no bd
			result.include("produtos", produtoDao.filter(filtro));
			result.include("totalProdutos", produtoDao.filterTotal(filtro));
			
		}else result.include("produtos", produtoDao.selectAll());
	}
}
