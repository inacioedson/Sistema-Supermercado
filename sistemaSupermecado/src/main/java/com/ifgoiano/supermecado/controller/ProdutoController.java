package com.ifgoiano.supermecado.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Request;
import com.ifgoiano.supermecado.model.Produto;

@Controller
@RequestMapping("/Produtos")

public class ProdutoController {

	private static final String CADASTRO_PRODUTO = "CadastroProduto";
	
	@Autowired
	private Produto produto;
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView(CADASTRO_PRODUTO);
		return mv;
	}
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(){
		return "cadastro";
	}
}
