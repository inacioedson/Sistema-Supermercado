package com.ifgoiano.supermecado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	@RequestMapping("/novo")
	public String novo(){
		return"produto/CadastroProduto";
	}
}
