package com.ifgoiano.formulario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifgoiano.formulario.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{

}
