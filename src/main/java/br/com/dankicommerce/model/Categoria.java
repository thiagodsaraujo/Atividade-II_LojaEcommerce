package br.com.dankicommerce.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.olimposistema.aipa.model.Model;

@Entity
public class Categoria extends Model{
	
	@NotEmpty(message = "{categoria.nome.vazio}") @Size(min = 2, max = 100, message = "{categoria.nome.size}")
	private String nome;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
