package com.remedios.edvaldo.curso.Produtos;

public record DadosListarProdutos(
      String smartphones, String relogios, String notebooks, String cadeira,
      String brinquedos, String perfumes, String maquiagem, String oleo,
      String cosmeticos, String tapetes, String celular
    ) {

    public DadosListarProdutos (Produtos produtos){
        this(produtos.getSmartphones(), produtos.getRelogios(), produtos.getNotebooks(), produtos.getCadeira(),
            produtos.getBrinquedos(), produtos.getPerfumes(), produtos.getMaquiagem(), produtos.getOleo(),
            produtos.getCosmeticos(), produtos.getTapetes(), produtos.getCelular());
    }
}
