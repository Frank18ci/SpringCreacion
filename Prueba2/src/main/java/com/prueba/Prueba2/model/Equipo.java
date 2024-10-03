package com.prueba.Prueba2.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Equipo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String equipo;
	@OneToOne(targetEntity = Jefe.class, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "codigo_jefe")
	private Jefe jefe;
	@OneToMany(targetEntity = Persona.class, fetch = FetchType.LAZY, mappedBy = "equipo")
	private List<Persona> personas;
	@ManyToOne(targetEntity = Empresa.class)
	private Empresa empresa;
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
	public String getEquipo() {
		return equipo;
	}
	public int getId() {
		return id;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public void setId(int id) {
		this.id = id;
	}
}
