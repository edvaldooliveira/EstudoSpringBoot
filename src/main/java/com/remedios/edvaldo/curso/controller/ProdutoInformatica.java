package com.remedios.edvaldo.curso.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtosInformatica")
public class ProdutoInformatica {


    @PostMapping
    public void produtosInformatica(@RequestBody String json){

        System.out.printf(json);
    }
}
