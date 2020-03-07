package com.example.demo.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;

public class HuellaDto {
	
	@NotNull
	@Size(min=8, max = 8, message = "El campo 'dni' debe tener mínimo y máximo 8 caracateres")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String dni;
	@NotNull
	@Size(min=3, max = 50, message = "El campo 'huella izquierda' debe tener mínimo 3 y máximo 50 caracateres")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String huellaIzquierda;
	@NotNull
	@Size(min=3, max = 50, message = "El campo 'huella derecha' debe tener mínimo 3 y máximo 50 caracateres")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String huellaDerecha;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getHuellaIzquierda() {
		return huellaIzquierda;
	}
	public void setHuellaIzquierda(String huellaIzquierda) {
		this.huellaIzquierda = huellaIzquierda;
	}
	public String getHuellaDerecha() {
		return huellaDerecha;
	}
	public void setHuellaDerecha(String huellaDerecha) {
		this.huellaDerecha = huellaDerecha;
	}

}
