package br.com.clinicamedica.models;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class PessoaJuridica {
	
	private String nome;
	private String endereco;
	private String segmento;

}
