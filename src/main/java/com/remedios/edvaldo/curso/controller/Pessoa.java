package com.remedios.edvaldo.curso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/nomes")
public class Pessoa {

    @GetMapping
    public List listaNome(){
        List<String> nomes = new ArrayList<>(6);
        nomes.add("Edvaldo");
        nomes.add(" Djane");
        nomes.add(" Larissy");
        nomes.add(" Isaac");
        return nomes;
    }



}
