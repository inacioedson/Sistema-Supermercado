package com.ifgoiano.supermecado.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifgoiano.supermecado.model.Fornecedor;
import com.ifgoiano.supermecado.repository.Fornecedores;
import com.ifgoiano.supermecado.service.exception.FornecedorNomeJaCadastradoException;

@Service
public class CadastroFornecedorService {
	
	@Autowired
	private Fornecedores fos;
	
	public void salvar(Fornecedor fo){
		Optional<Fornecedor> fornecedorExistente = fos.findByNomeContaining(fo.getNome());
		System.out.println(fornecedorExistente.toString());
		if(fornecedorExistente.isPresent()){
			throw new FornecedorNomeJaCadastradoException(fo.getNome()+" já cadastrado");
		}
		fos.save(fo);
	}

}
