package com.MVFinanceiro.DesafioMV.Model.Mapper;

import com.MVFinanceiro.DesafioMV.Model.DTO.Cliente.AddClienteDTO;
import com.MVFinanceiro.DesafioMV.Model.Entity.ClientePF;
import com.MVFinanceiro.DesafioMV.Model.Entity.ClientePJ;
import com.MVFinanceiro.DesafioMV.Model.Entity.Empresa;
import com.MVFinanceiro.DesafioMV.Model.Model.Endereco;

import java.time.LocalDate;

public class ClienteMapper {
    private static Empresa empresa;
    private static Pessoa pessoa;
    private static Endereco endereco;
    private static AddClienteDTO addClienteDTO;
    ClienteDTO clienteDTO = new ClienteDTO();

		clienteDTO.setAtivo(cliente.getAtivo());
		clienteDTO.setDataCadastro(cliente.getDataCadastro().format(DateTimeFormatter.ofPattern(DD_MM_YYYY)));
		clienteDTO.setEmail(cliente.getEmail());
		clienteDTO.setEmpresa(recuperarEmpresaDTO(cliente.getEmpresa()));
		clienteDTO.setId(cliente.getId());
		clienteDTO.setNumeroTelefone(cliente.getNumeroTelefone());
		clienteDTO.setPessoa(recuperarPessoaDTO(cliente.getPessoa()));
		clienteDTO.setEndereco(recuperarEnderecoDTO(cliente.getEndereco()));

		return clienteDTO;
}

    private static EnderecoDTO recuperarEnderecoDTO(Endereco endereco) {

        EnderecoDTO enderecoDTO = new EnderecoDTO();

        enderecoDTO.setBairro(endereco.getBairro());
        enderecoDTO.setCep(endereco.getCep());
        enderecoDTO.setComplemento(endereco.getComplemento());
        enderecoDTO.setId(endereco.getId());
        enderecoDTO.setLocalidade(endereco.getLocalidade());
        enderecoDTO.setLogradouro(endereco.getLogradouro());
        enderecoDTO.setNumero(endereco.getNumero());
        enderecoDTO.setUf(endereco.getUf());

        return enderecoDTO;
    }

    public static ClienteResumoDTO mapperResumo(Cliente cliente) {

        ClienteResumoDTO clienteDTO = new ClienteResumoDTO();

        clienteDTO.setAtivo(cliente.getAtivo());
        clienteDTO.setDataCadastro(cliente.getDataCadastro().format(DateTimeFormatter.ofPattern(DD_MM_YYYY)));
        clienteDTO.setEmail(cliente.getEmail());
        clienteDTO.setId(cliente.getId());
        clienteDTO.setNumeroTelefone(cliente.getNumeroTelefone());

        return clienteDTO;
    }

    private static PessoaDTO recuperarPessoaDTO(Pessoa pessoa) {

        PessoaDTO pessoaDTO = new PessoaDTO();

        pessoaDTO.setDataNascimento(pessoa.getDataNascimento().format(DateTimeFormatter.ofPattern(DD_MM_YYYY)));
        pessoaDTO.setId(pessoa.getId());
        pessoaDTO.setNome(pessoa.getNome());

        return pessoaDTO;
    }

    private static EmpresaDTO recuperarEmpresaDTO(Empresa empresa) {

        EmpresaDTO empresaDTO = new EmpresaDTO();

        empresaDTO.setCnpj(empresa.getCnpj());
        empresaDTO.setId(empresa.getId());
        empresaDTO.setNome(empresa.getNome());

        return empresaDTO;
    }

    public static Cliente mapper(Empresa empresa, Pessoa pessoa, Endereco endereco, @Valid AddClienteDTO addClienteDTO) {

        Cliente cliente = new Cliente();

        cliente.setAtivo(Boolean.TRUE);
        cliente.setDataCadastro(LocalDate.now());
        cliente.setEmail(addClienteDTO.getEmail());
        cliente.setEmpresa(empresa);
        cliente.setEndereco(endereco);
        cliente.setNumeroTelefone(addClienteDTO.getNumeroTelefone());
        cliente.setPessoa(pessoa);

        return cliente;
    }

    public static ClientePF mapperPF(Empresa empresa, Pessoa pessoa, Endereco endereco, AddClienteDTO addClienteDTO) {
        ClienteMapper.empresa = empresa;
        ClienteMapper.pessoa = pessoa;
        ClienteMapper.endereco = endereco;
        ClienteMapper.addClienteDTO = addClienteDTO;

        ClientePF cliente = new ClientePF();

        cliente.setAtivo(Boolean.TRUE);
        cliente.setDataCadastro(LocalDate.now());
        cliente.setEmail(addClienteDTO.getEmail());
        cliente.setEmpresa(empresa);
        cliente.setEndereco(endereco);
        cliente.setNumeroTelefone(addClienteDTO.getNumeroTelefone());
        cliente.setPessoa(pessoa);
        cliente.setCpf(addClienteDTO.getDocumento());

        return cliente;
    }

    public static ClientePJ mapperPJ(Empresa empresa, Pessoa pessoa, Endereco endereco, AddClienteDTO addClienteDTO) {

        ClientePJ cliente = new ClientePJ();

        cliente.setAtivo(Boolean.TRUE);
        cliente.setDataCadastro(LocalDate.now());
        cliente.setEmail(addClienteDTO.getEmail());
        cliente.setEmpresa(empresa);
        cliente.setEndereco(endereco);
        cliente.setNumeroTelefone(addClienteDTO.getNumeroTelefone());
        cliente.setPessoa(pessoa);
        cliente.setCnpj(addClienteDTO.getDocumento());

        return cliente;

}
