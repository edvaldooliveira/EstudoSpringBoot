package com.remedios.edvaldo.curso.CestaBasica;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;

public record DadosUpdateCesta(
      @NotNull
      Long id,

      @Enumerated(EnumType.STRING)
       Rice rice,

       String bean,
       String oil,
       String sal,
       String sugar,
       String coffee,
       String sauce,
       String noodle,
       String sardince,
       String sausage,
       String corn,
       String flour,
       String cookie,
       String bread,
       String butter,
       String banana,
       String milk
    ) {
}
