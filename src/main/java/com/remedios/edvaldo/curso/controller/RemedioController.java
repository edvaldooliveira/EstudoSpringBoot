package com.remedios.edvaldo.curso.controller;

import com.remedios.edvaldo.curso.remedio.DadosCadastroRemidio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroRemidio dados){
        System.out.println(dados);
    }
}
