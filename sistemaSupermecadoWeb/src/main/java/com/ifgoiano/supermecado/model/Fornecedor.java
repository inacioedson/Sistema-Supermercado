package com.ifgoiano.supermecado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fornecedores")
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_fornecedor")
	private long idFornecedor;
	private String nome;
	private String cnpj;
	
	@Column(name="telefone")
	private String telefone;
	
	public long getIdFornecedor() {
	
		return idFornecedor;
	}
	public void setIdFornecedor(long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public void setCnpj(String cnpj) {		
		
		this.cnpj = cnpj;
		System.out.println(this.cnpj);
	}
	
	public String getCnpj() {
		
		System.out.println(this.cnpj);
		return cnpj ;
		
	}
	
	
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Fornecedor other = (Fornecedor) obj;
		if (idFornecedor != other.idFornecedor)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Fornecedor [idFornecedor=" + idFornecedor + ", nome=" + nome + ", cnpj=" + cnpj + "]";
	}
	
	
}
