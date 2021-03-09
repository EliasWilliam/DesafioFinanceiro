package com.MVFinanceiro.DesafioMV.Model.Model;

public class Cliente {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    public String getPF() {
        return PF;
    }

    public void setPF(String PF) {
        this.PF = PF;
    }

    public String getPJ() {
        return PJ;
    }

    public void setPJ(String PJ) {
        this.PJ = PJ;
    }

    public String getContas() {
        return Contas;
    }

    public void setContas(String contas) {
        Contas = contas;
    }

    private String Cpf;
    private String Cnpj;
    private String PF;
    private String PJ;
    private String Contas;
}
