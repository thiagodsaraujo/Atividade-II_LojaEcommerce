package br.com.dankicommerce.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.dankicommerce.model.Usuario;
import br.com.olimposistema.aipa.dao.DAO;


// essa classe é filha de um dao de usuario(Herança)
//herdou tudo do dao generico e mais o que vamos implementar em baixo personalizado
@RequestScoped
public class UsuarioDAO extends DAO<Usuario>{
	
	@Deprecated public UsuarioDAO() {super(null,null);}

	@Inject
	public UsuarioDAO(EntityManager em) {
		//essa classe generica tem que receber como argumento aqui o Usuario(como classe) que estamos manipulando
		// e assim vai conserguir construir o dao generico no UsuarioDAO
		// o entity manager vai ter que vir injetado por padrão
		super(em, Usuario.class);
		// TODO Auto-generated constructor stub
	}

	public Usuario existeUsuarioCom(String email, String senha) {
		
		String jpql = "select u from Usuario as u where u.email = :pEmail and u.senha = :pSenha";
		Query query = em.createQuery(jpql);
		
		query.setParameter("pEmail", email);
		query.setParameter("pSenha", senha);
		
		try {
			Object usuario = (Usuario) query.getSingleResult();
			return (Usuario) usuario;
		} catch (NoResultException e) {
			return null;
		}
		

	}

}
