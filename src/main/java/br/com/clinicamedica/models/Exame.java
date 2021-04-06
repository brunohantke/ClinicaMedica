package br.com.clinicamedica.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "exame")
@Data
public class Exame extends Evento{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idExame;
	private String nome;
	
	@ManyToOne
	private Consulta consulta;
	
	@ManyToOne
	private Paciente paciente;
	
	@ManyToOne
	private Medico medico;

}
