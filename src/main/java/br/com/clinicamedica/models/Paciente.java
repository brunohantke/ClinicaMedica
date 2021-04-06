package br.com.clinicamedica.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "paciente")
public class Paciente extends PessoaFisica
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPaciente;
	private boolean convenio;

}
