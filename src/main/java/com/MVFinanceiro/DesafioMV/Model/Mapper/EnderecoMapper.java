package com.MVFinanceiro.DesafioMV.Model.Mapper;

import com.MVFinanceiro.DesafioMV.Model.Endereco.AddEnderecoDTO;
import com.MVFinanceiro.DesafioMV.Model.Model.Endereco;

public class EnderecoMapper {
    private EnderecoMapper() {

    }

    public static EnderecoDTO mapper(Endereco endereco) {

        EnderecoDTO enderecoDTO = new EnderecoDTO();

        enderecoDTO.setCep(endereco.getCep());
        enderecoDTO.setLogradouro(endereco.getLogradouro());
        enderecoDTO.setBairro(endereco.getBairro());
        enderecoDTO.setComplemento(endereco.getComplemento());
        enderecoDTO.setId(endereco.getId());
        enderecoDTO.setLocalidade(endereco.getLocalidade());
        enderecoDTO.setNumero(endereco.getNumero());
        enderecoDTO.setUf(endereco.getUf());

        return enderecoDTO;
    }

    public static Endereco mapper(AddEnderecoDTO enderecoDTO) {

        Endereco endereco = new Endereco();

        endereco.setCep(enderecoDTO.getCep());
        endereco.setLogradouro(enderecoDTO.getLogradouro());
        endereco.setComplemento(enderecoDTO.getComplemento());
        endereco.setBairro(enderecoDTO.getBairro());
        endereco.setLocalidade(enderecoDTO.getLocalidade());
        endereco.setNumero(enderecoDTO.getNumero());
        endereco.setUf(enderecoDTO.getUf());
        endereco.setAtivo(Boolean.TRUE);

        return endereco;
    }

    public static Endereco mapper(Endereco endereco, AddEnderecoDTO enderecoDTO) {

        endereco.setCep(enderecoDTO.getCep());
        endereco.setBairro(enderecoDTO.getBairro());
        endereco.setComplemento(enderecoDTO.getComplemento());
        endereco.setLocalidade(enderecoDTO.getLocalidade());
        endereco.setNumero(enderecoDTO.getNumero());
        endereco.setUf(enderecoDTO.getUf());

        return endereco;
    }
}
