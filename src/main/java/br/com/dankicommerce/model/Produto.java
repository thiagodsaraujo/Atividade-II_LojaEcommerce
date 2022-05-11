package br.com.dankicommerce.model;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.olimposistema.aipa.model.Model;

@Entity
public class Produto extends Model {
	
	@NotEmpty(message = "{produto.nome.vazio}") @Size(min = 2, max = 150, message = "{produto.nome.size}")
	private String nome;
	// o padrao se nao setar min e max, vai ser 255... e a descricao terá mais que isso e sem limites de caracteres fazemos assim
	// Type = text
	
	@NotEmpty(message = "{produto.descricao.vazio}") @Type(type = "text")
	private String descricao;
	
	@NotNull(message = "{produto.valor.notnull}") @Min(value = 0, message = "{produto.valor.min}")
	private Double valor;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}
