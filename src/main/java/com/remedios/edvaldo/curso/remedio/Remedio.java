package com.remedios.edvaldo.curso.remedio;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

import java.time.LocalDate;


@Table(name = "Remedio")
@Entity(name = "remedios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Remedio {


    public Remedio(DadosCadastroRemidio dados) {
        this.ativo=true;
        this.nome=dados.nome();
        this.via=dados.via();
        this.lote=dados.lote();
        this.quantidade=dados.quantidade();
        this.validade=dados.validade();
        this.laboratorio=dados.laboratorio();

    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private via via;
    private String lote;
    private int quantidade;
    private LocalDate validade;

    @Enumerated(EnumType.STRING)
    private Laboratorio laboratorio;

    private boolean ativo;


    public void atualizarInformacoes(@Valid DadosAtualizarRemidio dados) {
        if (dados.nome() != null){
            this.nome=dados.nome();
        }
        if (dados.via()!= null){
            this.via=dados.via();
        }
        if (dados.laboratorio()!= null){
            this.laboratorio=dados.laboratorio();
        }
    }

    public void inativar() {
        this.ativo = false;
    }

    public void reativar() {
        this.ativo = true;
    }
}
