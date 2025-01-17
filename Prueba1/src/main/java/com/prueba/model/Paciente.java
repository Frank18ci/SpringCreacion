package com.prueba.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name = "pacientes")
public class Paciente {
	@Id
	@Column(name = "numeroSeguro")
	private int numeroSeguro;
	private String nombre;
	private String apellido;
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	private String historialMedico;
	private String diagnostico;
	
	public Paciente() {
	
	}
	
	public Paciente(int numeroSeguro, String nombre, String apellido, Date fechaNacimiento, String historialMedico,
			String diagnostico) {
		super();
		this.numeroSeguro = numeroSeguro;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.historialMedico = historialMedico;
		this.diagnostico = diagnostico;
	}
	public int getNumeroSeguro() {
		return numeroSeguro;
	}
	public void setNumeroSeguro(int numeroSeguro) {
		this.numeroSeguro = numeroSeguro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getHistorialMedico() {
		return historialMedico;
	}
	public void setHistorialMedico(String historialMedico) {
		this.historialMedico = historialMedico;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	
}
