package br.com.clinicamedica.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "medico")
@Data
public class Medico extends PessoaFisica{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMedico;
	private String crm;
	private String especialidade;

}
