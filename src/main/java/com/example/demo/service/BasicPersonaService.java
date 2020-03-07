package com.example.demo.service;


import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.HuellaDto;
import com.example.demo.entity.Persona;

@Service
public class BasicPersonaService implements PersonaService{
	
	@Autowired
	PersonaRepository personaRepository;
	
	@Autowired
	Mapper mapper;

	@Override
	public HuellaDto mejorHuella(String dni) {
		HuellaDto huella = new HuellaDto();
		try {
			Persona p = personaRepository.findByDni(dni);
			p.setHuellaIzquierda(codEncode64(p.getHuellaIzquierda(), false));
			p.setHuellaDerecha(codEncode64(p.getHuellaDerecha(), false));

			mapper.map(p, huella);
			huella.setDni(null);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return huella;
	}

	@Override
	public Boolean validarIdentidad(HuellaDto hDto) {
		Persona p = personaRepository.findByDniAndHuellaIzquierdaAndHuellaDerecha(hDto.getDni(),
				codEncode64(hDto.getHuellaIzquierda(), true),codEncode64(hDto.getHuellaDerecha(), true));
		if(p != null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Persona> findAll() {
		List<Persona> personas = (List<Persona>) personaRepository.findAll();
		return personas;
	}
	
	public String codEncode64(String str, Boolean cod) {
		byte[] huella = cod ? Base64.encodeBase64(str.getBytes()) : Base64.decodeBase64(str);
		return new String(huella);
	}

}
