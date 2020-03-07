package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.HuellaDto;
import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;

@RestController
@RequestMapping("/validaciones")
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping()
    public ResponseEntity<?> findAll() {
		List<Persona> per = personaService.findAll();
        return new ResponseEntity<List<Persona>>(per, HttpStatus.OK);
    }
	
	@GetMapping("/{dni}")
    public ResponseEntity<?> mejorHuella(@PathVariable("dni") String dni) {
		HuellaDto huellaDto = personaService.mejorHuella(dni);		
        return new ResponseEntity<HuellaDto>(huellaDto, HttpStatus.OK);
    }
	
	@PostMapping("/identidad")
    public ResponseEntity<?> validarIdentidad(@RequestBody HuellaDto huellaDto) {
		Boolean per = personaService.validarIdentidad(huellaDto);
        return new ResponseEntity<Boolean>(per, HttpStatus.OK);
    }
	

}
