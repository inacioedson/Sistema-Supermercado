package com.ifgoiano.supermecado.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "produtos")

public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "pk_produto")
	private long id;
	
	@Column(name = "codigo_barras")
	private String codigoBarras;
	
	private String nome;
	
	@Column(name = "valor_unitario")
	private BigDecimal valorUnitario;
	
	@Column(name = "qtd_estoque")
	private BigDecimal qtdEstoque;
	
	@Column(name = "qtd_estoque")
	private BigDecimal qtdMinimo;
	
	@Column(name = "fk_categoria")
	private int idCategoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public BigDecimal getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(BigDecimal qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public BigDecimal getQtdMinimo() {
		return qtdMinimo;
	}

	public void setQtdMinimo(BigDecimal qtdMinimo) {
		this.qtdMinimo = qtdMinimo;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", codigoBarras=" + codigoBarras + ", nome=" + nome + ", valorUnitario="
				+ valorUnitario + ", qtdEstoque=" + qtdEstoque + ", qtdMinimo=" + qtdMinimo + ", idCategoria="
				+ idCategoria + "]";
	}
	
		
}
