package br.com.clinicamedica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.clinicamedica.models.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
	
	List<Paciente> findAllByCidade(String cidade);

}
