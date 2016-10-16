package com.ifgoiano.supermecado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifgoiano.supermecado.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {
	
	
}
