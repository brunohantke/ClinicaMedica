package br.com.clinicamedica.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consulta")
public class Consulta extends Evento{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idConsulta;
	
	@ManyToOne
	private Paciente paciente;
	
	@ManyToOne
	private Medico medico;

}
