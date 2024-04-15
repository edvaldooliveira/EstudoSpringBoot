package com.remedios.edvaldo.curso.CestaBasica;

import com.remedios.edvaldo.curso.controller.DadosCadastroCesta;
import jakarta.persistence.*;
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

}
