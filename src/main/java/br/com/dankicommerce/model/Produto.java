package br.com.dankicommerce.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.dankicommerce.rn.ConverteDataDeEnParaCalendar;
import br.com.olimposistema.aipa.imagem.ImageController;
import br.com.olimposistema.aipa.imagem.Imagem;
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
	
	
	@ManyToOne	@NotNull(message = "{produto.categoria.notnull}")
	private Categoria categoria;
	
	
	@Temporal(TemporalType.DATE) @NotNull(message = "{produto.dataValidade.notnull}")
	private Calendar dataValidade;
	
	
	// burocracia para usar a imagem, fetch.eaguer quando buscar o produto vai buscar também a imagem
	
	@OneToOne(
			cascade = {CascadeType.PERSIST, 
					CascadeType.MERGE, 
					CascadeType.REMOVE}, 
			fetch = FetchType.EAGER,
			orphanRemoval = true)
	private Imagem imagem;
	

	public Imagem getImagem() {
		return imagem;
	}

	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}

	public Calendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public void setDataValidadeEn(String data) {
		if(data == null) return;
		this.dataValidade = new ConverteDataDeEnParaCalendar().executa(data);
		
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

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
