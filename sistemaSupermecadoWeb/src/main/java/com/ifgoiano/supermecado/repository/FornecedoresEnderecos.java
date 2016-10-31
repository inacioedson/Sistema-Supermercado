package com.ifgoiano.supermecado.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ifgoiano.supermecado.model.Fornecedor;
import com.ifgoiano.supermecado.model.FornecedorEndereco;

public interface FornecedoresEnderecos extends JpaRepository<FornecedorEndereco, Long> {
	
	
/*	 public final static String FIND_BY_ADDRESS_QUERY = "SELECT p " + 
             "FROM Person p LEFT JOIN p.addresses a " +
             "WHERE a.address = :address";*/
	
	 
/*	@Query("select newFornecedorEndereco(fe.idEndereco, fe.logradouro, fe.idFornecedor, fe.nome)" + "from FornecedorEndereco fe join fe.fornecedor" + " where fe.fk_fornecedor = fe.pk_fornecedor ")
     List<FornecedorEndereco> ende(); */
	
	/*@Query("SELECT new Fornecedor(f.idFornecedor,f.nome,f.cnpj,f.telefone) FROM Fornecedor f ")
	List<Fornecedor> consulta();*/
	
	
	/*@Query( "select u from User as u left join fetch u.car where name = :name" )
	List<User> findByName( @Param( "name" ) String name )*/
	@Query("select fe from FornecedorEndereco as fe join fetch fe.fornecedor where fe.fornecedor.idFornecedor = :id")
	FornecedorEndereco findByCodigo(@Param("id") long id);
	

}
