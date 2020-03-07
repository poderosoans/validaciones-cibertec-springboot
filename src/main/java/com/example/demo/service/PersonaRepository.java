package com.example.demo.service;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
	
	Persona findByDni(String dni);
	
	Persona findByDniAndHuellaIzquierdaAndHuellaDerecha(String dni, String huellaIzquierda, String huellaDerecha);
}
