package com.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.repository.IPacienteRepository;

@Controller
public class ProyectoController {
	@Autowired
	private IPacienteRepository pacienteRepository;
	
	@GetMapping("/inicio")
	public String inicio(@RequestParam(name = "nombre", required = false, defaultValue = "Pedro") String nombre, Model model) {
		model.addAttribute("nombre", nombre);
		return "inicio";
	}
	@GetMapping("/lista")
	public String lista(Model model) {
		model.addAttribute("lstPacientes", pacienteRepository.findAll());
		return "lista";
	}
}
