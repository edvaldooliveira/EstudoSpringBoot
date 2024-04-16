package com.remedios.edvaldo.curso.Produtos;

import jakarta.validation.constraints.NotNull;

public record dadosUpdateProdutos(
    @NotNull
    Long id,

    String smartphones,
    String relogios,
    String notebooks,
    String cadeira,
    String brinquedos,
    String perfumes,
    String maquiagem,
    String oleo,
    String cosmeticos,
    String tapetes,
    String celular

  ) {
}
