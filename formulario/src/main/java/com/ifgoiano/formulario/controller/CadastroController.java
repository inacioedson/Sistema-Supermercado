package com.ifgoiano.formulario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.ifgoiano.formulario.model.Cliente;
import com.ifgoiano.formulario.repository.Clientes;

@Controller
@RequestMapping("/clientes")
public class CadastroController {
	
	@Autowired
	private Clientes clientes;

	@RequestMapping("/novo")
	public ModelAndView novo()
	{
		
		ModelAndView mv = new ModelAndView("CadastrarCliente");		
		return mv;
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Cliente cliente)
	{
		clientes.save(cliente);
		ModelAndView mv = new ModelAndView("CadastrarCliente");
		mv.addObject("mensagem", "Cliente Salvo com Sucesso!");
		return mv;
	}
	
	@RequestMapping
	public ModelAndView pesquisar()
	{
		List<Cliente> todosClientes = clientes.findAll();
		ModelAndView mv = new ModelAndView("ListarClientes");
		mv.addObject("clientes", todosClientes);
		
		return mv;
		
	}
	
	/*List<Titulo> todosTitulos = titulos.findAll();
	ModelAndView mv = new ModelAndView("PesquisaTitulos");
	mv.addObject("titulos",todosTitulos);*/
	
	
	
}
