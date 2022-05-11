package br.com.dankicommerce.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.olimposistema.aipa.model.Model;

@Entity
public class Categoria extends Model{
	
	@NotEmpty(message = "{categoria.nome.vazio}") @Size(min = 2, max = 100, message = "{categoria.nome.size}")
	private String nome;
	
	
	@OneToMany(mappedBy = "categoria")// uma categoria para muitos produtos, aqui dizemos que esse é o relacionamento fraco
	// ja foi mapeado la em produto, e o nome da propriedade é categoria
	private List<Produto> produtos;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
