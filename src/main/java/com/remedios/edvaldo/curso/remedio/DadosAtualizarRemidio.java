package com.remedios.edvaldo.curso.remedio;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarRemidio(
        @NotNull
        Long id,
        String nome,
        via via,
        Laboratorio laboratorio

        ) {
}
