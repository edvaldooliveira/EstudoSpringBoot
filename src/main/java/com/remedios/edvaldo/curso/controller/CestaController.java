package com.remedios.edvaldo.curso.controller;


import com.remedios.edvaldo.curso.CestaBasica.Cesta;
import com.remedios.edvaldo.curso.CestaBasica.DadosListagemCesta;
import com.remedios.edvaldo.curso.CestaBasica.DadosUpdateCesta;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cesta")
public class CestaController {


    @Autowired
    private cestaRepositorio repositorio;

    @PostMapping
    public void cestaCadastro(@RequestBody @Valid DadosCadastroCesta dados){
        repositorio.save(new Cesta(dados));
    }
    @GetMapping
    public List<DadosListagemCesta>listar(){
       return repositorio.findAllByAtivoTrue().stream().map(DadosListagemCesta::new).toList();

    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid DadosUpdateCesta dados){
        var cesta = repositorio.getReferenceById(dados.id());
        cesta.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repositorio.deleteById(id);
    }

    @DeleteMapping("inativar/{id}")
    @Transactional
    public void inativar(@PathVariable Long id){
        var cesta = repositorio.getReferenceById(id);
        cesta.inativar();


    }


}
