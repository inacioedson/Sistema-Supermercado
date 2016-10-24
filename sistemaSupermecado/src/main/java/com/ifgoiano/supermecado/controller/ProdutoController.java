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

import com.ifgoiano.supermecado.repository.Categorias;
import com.ifgoiano.supermecado.repository.Produtos;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private Produtos produtos;
	@Autowired
	private Categorias categorias;
	@RequestMapping("/novo")
	public ModelAndView novo(){
		List<Categoria> todosCategoria = categorias.findAll();
		ModelAndView mv = new ModelAndView("CadastroProduto");
		mv.addObject("categorias", todosCategoria);
		return mv;
	}
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView salvar(Produto prod){
		
		produtos.save(prod);
		ModelAndView mv = new ModelAndView("CadastroProduto");
		mv.addObject("mensagem","Titulo salvo com sucesso!");
		return mv;
	}
	@RequestMapping
	public ModelAndView pesquisar(){
		List<Produto> todosProduto = produtos.findAll();
		ModelAndView mv = new ModelAndView("PesquisarProduto");
		mv.addObject("produtos", todosProduto);
		return mv;
	}
	

}
