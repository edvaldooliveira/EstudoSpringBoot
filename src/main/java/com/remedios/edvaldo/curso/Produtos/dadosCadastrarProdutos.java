package com.remedios.edvaldo.curso.Produtos;

import jakarta.validation.constraints.NotBlank;

public record dadosCadastrarProdutos(
        @NotBlank
         String smartphones,
         @NotBlank
         String relogios,
         @NotBlank
         String notebooks,
         @NotBlank
         String cadeira,
         @NotBlank
         String brinquedos,
         @NotBlank
         String perfumes,
         String maquiagem,
         @NotBlank
         String oleo,
         @NotBlank
         String cosmeticos,
         @NotBlank
         String tapetes,
         @NotBlank
         String celular ) {

    }
