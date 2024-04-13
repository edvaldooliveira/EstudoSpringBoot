package com.remedios.edvaldo.curso.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/informatica")
public class Informatica {

    @PostMapping
    public void tecnologia(@RequestBody String dados){
        System.out.println(dados);

    }

}
