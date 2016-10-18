package com.ifgoiano.supermecado.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.ifgoiano.supermecado.model.Categoria;
import com.ifgoiano.supermecado.model.Produto;
import com.ifgoiano.supermecado.repository.Produtos;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	private static final String CADASTRO_PRODUTO = "CadastroProduto";
	
	@Autowired
	private Produtos produto;
	
	@RequestMapping("/CadastroProduto")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView("CadastroProduto");
		return mv;
	}
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView salvar(Produto prod){
		
		produto.save(prod);
		ModelAndView mv = new ModelAndView("CadastroProduto");
		mv.addObject("mensagem","Titulo salvo com sucesso!");
		return mv;
	}

}
