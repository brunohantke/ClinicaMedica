package br.com.clinicamedica.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "laboratorio")
@Data
@EqualsAndHashCode(callSuper = true)
public class Laboratorio extends PessoaJuridica{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idLaboratorio;
	private boolean habilitadoExames;
	private String restricoes;

}
