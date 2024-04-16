package com.remedios.edvaldo.curso.remedio;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record DadosCadastroRemidio(
       @NotBlank
		String nome,
		@Enumerated
		via via,
		@NotBlank
		String lote,
		int quantidade,
		@Future
	   LocalDate validade,
		@Enumerated
		Laboratorio laboratorio){
}

