package com.remedios.edvaldo.curso.CestaBasica;

import org.springframework.web.bind.annotation.GetMapping;

public record DadosListagemCesta(Rice rice, String bean, String oil, String sal, String sugar, String coffee,
                                 String sauce, String noodle, String sardince, String sausage, String corn,
                                 String  flour, String cookie, String bread, String butter, String banana, String milk ) {



    public DadosListagemCesta(Cesta cesta){
        this(cesta.getRice(), cesta.getBean(), cesta.getOil(), cesta.getSal(), cesta.getSugar(), cesta.getCoffee(),
                cesta.getSauce(),cesta.getNoodle(), cesta.getSardince(), cesta.getSausage(), cesta.getCorn(), cesta.getFlour(),
                cesta.getCookie(), cesta.getBread(), cesta.getButter(), cesta.getBanana(), cesta.getMilk()
        );

    }
}
