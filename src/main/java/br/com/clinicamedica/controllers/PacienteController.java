package br.com.clinicamedica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.clinicamedica.models.Paciente;
import br.com.clinicamedica.repository.PacienteRepository;

@RestController
public class PacienteController {
	
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	@GetMapping("/paciente")
	public List<Paciente> getPacientes() {
		
		return pacienteRepository.findAll();
		
	}
	
	@GetMapping("/paciente-por-cidade")
	public List<Paciente> getPacientesPorCidade(@RequestParam("cidade") String cidade) {
		
		return pacienteRepository.findAllByCidade(cidade);
		
	}

}
