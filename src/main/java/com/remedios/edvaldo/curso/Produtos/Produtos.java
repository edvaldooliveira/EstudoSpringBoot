package com.remedios.edvaldo.curso.Produtos;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

@Table
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Produtos {

     public void atualizarInformacoes(@Valid dadosUpdateProdutos dados) {
          if (dados.smartphones() != null){
               this.smartphones=dados.smartphones();
          }
          if (dados.relogios() != null){
               this.relogios=dados.relogios();
          }
          if (dados.notebooks() != null){
               this.notebooks=dados.notebooks();
          }
          if (dados.cadeira() != null){
               this.cadeira=dados.cadeira();
          }
          if (dados.brinquedos() != null){
               this.brinquedos=dados.brinquedos();
          }
          if (dados.perfumes() != null){
               this.maquiagem=dados.maquiagem();
          }
          if (dados.oleo() != null){
               this.oleo=dados.oleo();
          }
          if (dados.cosmeticos() != null){
               this.cosmeticos=dados.cosmeticos();
          }
          if (dados.tapetes() != null){
               this.tapetes=dados.tapetes();
          }
          if (dados.celular() != null){
               this.celular=dados.celular();
          }

     }



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
