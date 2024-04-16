package com.remedios.edvaldo.curso.controller;

import com.remedios.edvaldo.curso.Produtos.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody @Valid dadosCadastrarProdutos dados){
        repository.save(new Produtos(dados));

    }
    @GetMapping
    public List<DadosListarProdutos> listar(){
       return repository.findAll().stream().map(DadosListarProdutos::new).toList();
    }

    @PutMapping
    @Transactional
    public void DadosUpdateProduto(@RequestBody @Valid dadosUpdateProdutos dados){
        var produto = repository.getReferenceById(dados.id());
        produto.atualizarInformacoes(dados);
    }

}
