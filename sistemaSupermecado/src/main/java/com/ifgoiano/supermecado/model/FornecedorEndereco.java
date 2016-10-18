package com.ifgoiano.supermecado.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FornecedorEndereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_endereco")
	private long idEndereco;
	
	@Column(name = "fk_fornecedor")
	private long idFornecedor;
	
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private String cep;
	public long getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(long idEndereco) {
		this.idEndereco = idEndereco;
	}
	public long getIdFornecedor() {
		return idFornecedor;
	}
	public void setIdFornecedor(long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idEndereco ^ (idEndereco >>> 32));
		result = prime * result + (int) (idFornecedor ^ (idFornecedor >>> 32));
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
		FornecedorEndereco other = (FornecedorEndereco) obj;
		if (idEndereco != other.idEndereco)
			return false;
		if (idFornecedor != other.idFornecedor)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FornecedoresEnderecos [idEndereco=" + idEndereco + ", idFornecedor=" + idFornecedor + ", logradouro="
				+ logradouro + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", pais=" + pais
				+ ", cep=" + cep + "]";
	}
	
	
}
