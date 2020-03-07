package com.example.demo.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "personas")
public class Persona {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dni;
	private String huellaDerecha;
	private String huellaIzquierda;
	@Temporal(TemporalType.DATE)
	private Calendar fechaNacimiento;
	private Integer dias;
	
	public Persona() {};
	
	public Persona(Long id, String dni, String huellaDerecha, String huellaIzquierda, Calendar fechaNacimiento) {
		this.id = id;
		this.dni = dni;
		this.huellaDerecha = huellaDerecha;
		this.huellaIzquierda = huellaIzquierda;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getHuellaDerecha() {
		return huellaDerecha;
	}
	public void setHuellaDerecha(String huellaDerecha) {
		this.huellaDerecha = huellaDerecha;
	}
	public String getHuellaIzquierda() {
		return huellaIzquierda;
	}
	public void setHuellaIzquierda(String huellaIzquierda) {
		this.huellaIzquierda = huellaIzquierda;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

}
