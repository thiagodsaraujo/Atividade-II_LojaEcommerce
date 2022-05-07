package br.com.dankicommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.olimposistema.aipa.model.Model;

@Entity
public class Usuario extends Model{
	
//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
	
	
	
	// quando for string é melhor usar NotEmpty, que ja tem o notnull dentro dele
	@NotEmpty(message = "{usuario.nome.vazio}") @Size(min = 3, max = 100, message = "{usuario.nome.size}")
	private String nome;
	
	@NotEmpty(message = "usuario.email.vazio") @Email(message = "usuario.email.validacao") @Column(unique = true)
	private String email;
	
	@NotEmpty(message = "{usuario.senha.vazio}") @Size(min = 4, max = 20, message = "{usuario.senha.size}")
	private String senha;
	
	@Column(unique = true)
	@NotEmpty(message = "{usuario.login.vazio}") @Size(min = 4, max = 30, message = "{usuario.login.size}")
	private String login;
	


	public Usuario() {
		// TODO Auto-generated constructor stub
	}

//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}
