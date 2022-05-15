package br.com.dankicommerce.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import br.com.dankicommerce.model.Categoria;
import br.com.dankicommerce.model.Produto;
import br.com.olimposistema.aipa.dao.DAO;


// Foi Criado esse ProdutoDAO para fazer pesquisas mais sofisticadas
@RequestScoped
public class ProdutoDAO extends DAO<Produto>{
	
	@Deprecated public ProdutoDAO() {super(null,null);}

	@Inject
	public ProdutoDAO(EntityManager em) {
		super(em, Produto.class);
	}

	// consulta no bd usando o hibernate
	//https://www.objectdb.com/java/jpa/query/criteria
	public List<Produto> buscaTodosOsProdutosOrdenadoPeloNome(){
		  	// burocracia
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Produto> q = cb.createQuery(Produto.class);
			
		  
		  // pega a query e começa a partir de produto e faz o root(eq a select * from produto)
		  Root<Produto> r = q.from(Produto.class);
		  q.select(r) // o r é como se fosse o produto e pega o atributo "nome"
		  .orderBy(cb.asc(r.get("nome")));
		  
		  
		  // burocracia também, o que importa é o que ta no meio
		  TypedQuery<Produto> query = em.createQuery(q);
		  List<Produto> produtos = query.getResultList();
		  
		  return produtos;
		
	}
	
	public List<Produto> buscaTodosOsProdutosOrdenadoPeloValor(){
	  	// burocracia
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Produto> q = cb.createQuery(Produto.class);
		
	  
	  // pega a query e começa a partir de produto e faz o root(eq a select * from produto)
	  Root<Produto> r = q.from(Produto.class);
	  q.select(r) // o r é como se fosse o produto e pega o atributo "valor"
	  .orderBy(cb.desc(r.get("valor")));
	  
	  
	  // burocracia também, o que importa é o que ta no meio
	  TypedQuery<Produto> query = em.createQuery(q);
	  List<Produto> produtos = query.getResultList();
	  
	  return produtos;
	
}
	
	public List<Produto> buscaPorCategoriaEspecifica() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Produto> q = cb.createQuery(Produto.class);
		
		Root<Produto> r = q.from(Produto.class);
		Join<Produto, Categoria> joinCategoria = r.join("categoria", JoinType.INNER);
		q.select(r)
		.where(
			cb.and(
				cb.like(cb.lower(r.get("nome")), "%teste%")),
				cb.equal(joinCategoria.get("id"), 8)
			);

		
		TypedQuery<Produto> query = em.createQuery(q);
		List<Produto> produtos = query.getResultList();
		
		return produtos;
		
		
	}
	
	public Long totalProdutos() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Long> q = cb.createQuery(Long.class);
		
		Root<Produto> r = q.from(Produto.class);
		q.multiselect(cb.count(r));
		
		
		TypedQuery<Long> query = em.createQuery(q);
		Long total = query.getSingleResult();
		
		return total;
		
	}

}
