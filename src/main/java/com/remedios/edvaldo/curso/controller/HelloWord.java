package com.remedios.edvaldo.curso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWord {

//Iniciando o Spring Boot
    @GetMapping
    public String olaMundo(){
        return "Edvaldo Ferreira de Oliveira";
    }

}
