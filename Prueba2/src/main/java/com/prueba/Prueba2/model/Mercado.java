package com.prueba.Prueba2.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mercado {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	private String nombre;
	private Double dinero;
	@Column(name = "fec_inicio", columnDefinition = "DATE")
	private Date fecInicio;
}
