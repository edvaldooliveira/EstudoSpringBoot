package com.remedios.edvaldo.curso.Produtos;

import jakarta.persistence.*;
import lombok.*;

@Table
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Produtos {


     public Produtos(dadosCadastrarProdutos dados) {
          this.smartphones=dados.smartphones();
          this.relogios=dados.relogios();
          this.notebooks=dados.notebooks();
          this.cadeira=dados.cadeira();
          this.brinquedos=dados.brinquedos();
          this.perfumes=dados.perfumes();
          this.maquiagem=dados.maquiagem();
          this.oleo=dados.oleo();
          this.cosmeticos=dados.cosmeticos();
          this.tapetes=dados.tapetes();
          this.celular=dados.celular();

     }

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     private String smartphones;
     private String relogios;
     private String notebooks;
     private String cadeira;
     private String brinquedos;
     private String perfumes;
     private String maquiagem;
     private String oleo;
     private String cosmeticos;
     private String tapetes ;
     private String celular;



}
