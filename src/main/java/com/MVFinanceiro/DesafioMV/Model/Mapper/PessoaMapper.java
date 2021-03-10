package com.MVFinanceiro.DesafioMV.Model.Mapper;

import com.MVFinanceiro.DesafioMV.Model.Entity.pessoa;

public class PessoaMapper {

    private PessoaMapper (){

    }
    public static pessoa mapper (AddPessoaDTO pessoaDTO) {

        pessoa pessoa = new pessoa();

        pessoa.setDataNascimento(pessoaDTO.getDataNascimento());
        pessoa.setNome(pessoaDTO.getnome());

        return pessoa;
    }
}
