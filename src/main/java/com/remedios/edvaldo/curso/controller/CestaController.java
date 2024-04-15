package com.remedios.edvaldo.curso.controller;


import com.remedios.edvaldo.curso.CestaBasica.Cesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cesta")
public class CestaController {


    @Autowired
    private cestaRepositorio repositorio;

    @PostMapping
    public void cestaCadastro(@RequestBody DadosCadastroCesta dados){

        repositorio.save(new Cesta(dados));

    }

}
