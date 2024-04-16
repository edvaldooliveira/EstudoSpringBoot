package com.remedios.edvaldo.curso.controller;

import com.remedios.edvaldo.curso.CestaBasica.Rice;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroCesta(
        @Enumerated
        Rice rice,
        @NotBlank
        String bean,
        @NotBlank
        String oil,
        @NotBlank
        String sal,
        @NotBlank
        String sugar,
        @NotBlank
        String coffee,
        @NotBlank
        String sauce,
        @NotBlank
        String noodle,
        @NotBlank
        String sardince,
        @NotBlank
        String sausage,
        @NotBlank
        String corn,
        @NotBlank
        String flour,
        @NotBlank
        String cookie,
        @NotBlank
        String bread,
        @NotBlank
        String butter,
        @NotBlank
        String banana,
        @NotBlank
        String milk) {

}
