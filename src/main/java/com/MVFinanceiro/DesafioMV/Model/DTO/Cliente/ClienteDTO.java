package com.MVFinanceiro.DesafioMV.Model.DTO.Cliente;

import com.MVFinanceiro.DesafioMV.Model.Empresa.EmpresaDTO;
import com.MVFinanceiro.DesafioMV.Model.Pessoa.PessoaDTO;

public class ClienteDTO {

    private Long id;

    private String numeroTelefone;

    private String email;

    private Boolean ativo;

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

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public PessoaDTO getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaDTO pessoa) {
        this.pessoa = pessoa;
    }

    private String dataCadastro;

    private PessoaDTO pessoa;

    private EmpresaDTO empresa;

   // private EnderecoDTO endereco;
}
