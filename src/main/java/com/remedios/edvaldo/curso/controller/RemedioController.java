package com.remedios.edvaldo.curso.controller;

import com.remedios.edvaldo.curso.remedio.DadosCadastroRemidio;
import com.remedios.edvaldo.curso.remedio.Remedio;
import com.remedios.edvaldo.curso.remedio.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    @Autowired
    private RemedioRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroRemidio dados){
      repository.save(new Remedio(dados));
    }
}
