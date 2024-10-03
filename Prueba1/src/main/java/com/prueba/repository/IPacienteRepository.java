package com.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.model.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente, Integer> {

}
