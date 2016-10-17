package com.ifgoiano.supermecado.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.ifgoiano.supermecado.model.Produto;
import com.ifgoiano.supermecado.repository.Produtos;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	private static final String CADASTRO_PRODUTO = "CadastroProduto";
	
	@Autowired
	private Produtos produto;
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView(CADASTRO_PRODUTO);
		return mv;
	}
	/*@RequestMapping(method = RequestMethod.POST)
	public String salvar(){
		return "cadastro";
	}*/
}
