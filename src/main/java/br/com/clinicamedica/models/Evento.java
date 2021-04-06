package br.com.clinicamedica.models;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class Evento {

	private LocalDateTime dataEvento;
	
}
