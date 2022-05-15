package br.com.dankicommerce.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.dankicommerce.model.Categoria;
import br.com.olimposistema.aipa.dao.DAO;
import br.com.olimposistema.aipa.vraptorcrud.CrudRest;

@Controller
@Path("categoria")
public class CategoriaController extends CrudRest<Categoria>{
	@Inject Result result;
	private DAO<Categoria> dao;
	
	//burocracia
	@Inject
	public CategoriaController(DAO<Categoria> dao) {
		super(Categoria.class, dao);
		// TODO Auto-generated constructor stub
		this.dao = dao;
	}
	// burocracia
	@Deprecated public CategoriaController() {
		this(null);
		
	}
	
	
//	@Post("") @Consumes("application/json")
//	public void adicionaCategoria(Categoria categoria) {
//		Categoria categoriaInserida = categoriaDao.insertOrUpdate(categoria);
//		
//		result.use(Results.json())
//		.withoutRoot()
//		.from(categoriaInserida)
//		.serialize();
//	}

}
