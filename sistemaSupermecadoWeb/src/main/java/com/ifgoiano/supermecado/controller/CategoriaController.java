package com.ifgoiano.supermecado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ifgoiano.supermecado.model.Categoria;
import com.ifgoiano.supermecado.repository.Categorias;



@Controller
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	private Categorias categorias;
	
	@RequestMapping("/novo")
	public String novo(){
		
		return"categoria/CadastroCategoria";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Categoria catego){
		
		categorias.save(catego);
	
		//mv.addObject("mensagem", "A operação foi completa com sucesso");
		return(
				"forward:produto/CadastroProduto");
		
	}

}
