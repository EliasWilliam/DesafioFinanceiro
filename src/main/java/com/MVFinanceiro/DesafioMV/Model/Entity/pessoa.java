package com.MVFinanceiro.DesafioMV.Model.Entity;

import java.time.LocalDate;

public class pessoa {

    private Long id;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Long getId(){
        return id;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    private LocalDate dataNascimento;
}
