package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.HuellaDto;
import com.example.demo.entity.Persona;

public interface PersonaService {
	
	public HuellaDto mejorHuella(String dni);
	
	public Boolean validarIdentidad(HuellaDto huellaDto);
	
	public List<Persona> findAll();

}
