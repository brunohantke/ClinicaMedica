package br.com.clinicamedica.models;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class PessoaFisica {
	
	private String nome;
	private int idade;
	private String rg;
	private String cpf;
	private String cidade;

}
