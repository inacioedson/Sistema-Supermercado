package com.ifgoiano.supermecado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifgoiano.supermecado.model.Fornecedor;
import com.ifgoiano.supermecado.repository.Fornecedores;

@Controller
@RequestMapping("/home")
public class HomeController {

		@Autowired
		private Fornecedores fo;
	
		@RequestMapping("/index")
		public ModelAndView novo(Fornecedor forne){
						
			ModelAndView mv = new ModelAndView("home/index");
			List<Fornecedor> totalFornecedor = fo.findByCount();
			mv.addObject("totalFornecedor",totalFornecedor);			
			return mv;
		
		}
}
