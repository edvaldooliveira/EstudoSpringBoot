package com.remedios.edvaldo.curso.CestaBasica;

import com.remedios.edvaldo.curso.controller.DadosCadastroCesta;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

@Entity(name = "cestas")
@Table(name = "cestas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cesta {

    public Cesta(DadosCadastroCesta dados) {
        this.rice=dados.rice();
        this.bean=dados.bean();
        this.oil=dados.oil();
        this.sal=dados.sal();
        this.sugar=dados.sugar();
        this.coffee=dados.coffee();
        this.sauce=dados.sauce();
        this.noodle=dados.noodle();
        this.sardince=dados.sardince();
        this.sausage=dados.sausage();
        this.corn=dados.corn();
        this.flour=dados.flour();
        this.cookie=dados.cookie();
        this.bread=dados.bread();
        this.butter=dados.butter();
        this.banana=dados.banana();
        this.milk=dados.milk();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Rice rice;
   private String bean;
    private String oil;
    private String sal;
    private String sugar;
    private String coffee;
    private String sauce;
    private String noodle;
    private String sardince;
    private String sausage;
    private String corn;
    private String flour;
    private String cookie;
    private String bread;
    private String butter;
    private String banana;
    private String milk;

    public void atualizarInformacoes(@Valid DadosUpdateCesta dados) {
        if (dados.rice() != null){
            this.rice=dados.rice();
        }
        if (dados.bean() != null){
            this.bean=dados.bean();
        }
        if (dados.oil() != null){
            this.oil=dados.oil();
        }
        if (dados.sal() != null){
            this.sal=dados.sal();
        }
        if (dados.sugar() != null){
            this.sugar=dados.sugar();
        }
        if (dados.coffee() != null){
            this.coffee=dados.coffee();
        }
        if (dados.sauce() != null){
            this.sauce=dados.sauce();
        }
        if (dados.noodle() != null){
            this.noodle=dados.noodle();
        }
        if (dados.sardince() != null){
            this.sardince=dados.sardince();
        }
        if (dados.sausage() != null){
            this.sausage=dados.sausage();
        }
        if (dados.corn() != null) {
            this.corn=dados.corn();
        }
        if (dados.flour() != null){
            this.flour=dados.flour();
        }
        if (dados.cookie() != null){
            this.cookie=dados.cookie();
        }
        if (dados.bread() != null){
            this.bread=dados.bread();
        }
        if (dados.butter() != null){
            this.butter=dados.butter();
        }

        if (dados.banana() != null){
            this.banana=dados.banana();
        }

        if (dados.milk() != null){
            this.milk=dados.milk();
        }
    }
}
