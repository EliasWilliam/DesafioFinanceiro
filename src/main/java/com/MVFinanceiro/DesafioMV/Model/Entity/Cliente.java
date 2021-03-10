package com.MVFinanceiro.DesafioMV.Model.Entity;

import com.MVFinanceiro.DesafioMV.Model.Model.Endereco;

import java.time.LocalDate;

public class Cliente {

    private Long id;
    private String numeroTelefone;
    private Object pessoa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private String email;
    private Boolean ativo;
    private LocalDate dataCadastro;
   // private Pessoa pessoa;
   // private Empresa empresa;
    private Endereco endereco;


}

@Override
public int hashCode(){
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
    return result;
}
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (pessoa == null) {
            if (other.pessoa != null)
                return false;
        } else if (!pessoa.equals(other.pessoa))
            return false;
        return true;
}
}
