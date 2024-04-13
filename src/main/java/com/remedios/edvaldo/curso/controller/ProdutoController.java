package com.remedios.edvaldo.curso.controller;

import com.remedios.edvaldo.curso.Produtos.ProdutoRepository;
import com.remedios.edvaldo.curso.Produtos.Produtos;
import com.remedios.edvaldo.curso.Produtos.dadosCadastrarProdutos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody dadosCadastrarProdutos dados){
        repository.save(new Produtos(dados));

    }
}
