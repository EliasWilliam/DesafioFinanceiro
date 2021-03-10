package com.MVFinanceiro.DesafioMV.Model.Entity;

public class Empresa {

    private static final Object CNPJ = ;
    private Long id;
    private int Nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((CNPJ == null) ? 0 : CNPJ.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;

    public String getNome(){
        return Nome;

        public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCnpj() {
        return CNPJ;
    }

    public void setCnpj(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    private String Nome;
    private String cnpj;
}
