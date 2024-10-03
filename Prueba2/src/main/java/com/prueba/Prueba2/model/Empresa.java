package com.prueba.Prueba2.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Equipo.class, mappedBy = "empresa")
	private List<Equipo> equipos;
	
	@ManyToMany(fetch = FetchType.LAZY, targetEntity = Mercado.class)
	@JoinTable(name = "Empresas_Mercados", joinColumns = @JoinColumn(name =  "id_empresa"), inverseJoinColumns = @JoinColumn(name = "id_mercado"))
	private List<Mercado> mercados;
}
