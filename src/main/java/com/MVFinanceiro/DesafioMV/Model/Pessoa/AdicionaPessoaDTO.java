package com.MVFinanceiro.DesafioMV.Model.Pessoa;

import org.jetbrains.annotations.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

public class AdicionaPessoaDTO implements Serializable {
    private static final long serialVersionUID = 582361038349473117L;


   // @Size(max = 200)
    private String nome;

  //  @NotNull(message = "Campo data de nascimento obrigatório.")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dataNascimento;

    public AdicionaPessoaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
