package com.ifgoiano.supermecado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.ifgoiano.supermecado.model.Fornecedor;
import com.ifgoiano.supermecado.model.FornecedorEndereco;
import com.ifgoiano.supermecado.repository.Fornecedores;
import com.ifgoiano.supermecado.repository.FornecedoresEnderecos;



@Controller
@RequestMapping("/fornecedores")
public class FornecedorController {
	
	private static final String  CADASTRO_VIEW = "fornecedor/CadastroFornecedor";
	
	@Autowired
	private Fornecedores forne;
	
	@Autowired
	private FornecedoresEnderecos fornEnd;
	
	
	@RequestMapping("/novo")
	public ModelAndView novo(FornecedorEndereco endereco){		
		ModelAndView mv = new ModelAndView("fornecedor/CadastroFornecedor");	
		mv.addObject("endereco",new FornecedorEndereco());
		mv.addObject("fornecedor", new Fornecedor());
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar( Fornecedor fornece, FornecedorEndereco endereco){
		
		endereco.setFornecedor(fornece);		
		fornEnd.save(endereco);
		
		ModelAndView mv = new ModelAndView("CADASTRO_VIEW");
		//mv.addObject("mensagem", "Funcionario salvo com sucesso!");
		mv.addObject("endereco", new FornecedorEndereco());
		return mv;
		
	}
	
	@RequestMapping
	public ModelAndView pesquisar(){
		List<Fornecedor> todosFornecedores = forne.consulta();
		ModelAndView mv = new ModelAndView("fornecedor/PesquisaFornecedores");
		mv.addObject("fornecedores", todosFornecedores);
		return mv;
		
	}
	
	@RequestMapping("{codigo}")//Aqui estamos recebemos o valor da variavel que vem da view
	public ModelAndView edicao(@PathVariable Long codigo){//declaramos o @pathvariable + mais uma variavel para que possamos receber o valor
														// e trabalhamos com ela
		FornecedorEndereco endereco = fornEnd.findOne(codigo);//estamos recuperando o codigo do bando de dados
		System.out.println(endereco);
		System.out.println(endereco.getFornecedor());
		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
		mv.addObject(endereco);//passamos o que recuperamos para a view
		
		return mv;
		
	}
	
	

}
