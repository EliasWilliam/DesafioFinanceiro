package com.MVFinanceiro.DesafioMV.Model.Mapper;

import com.MVFinanceiro.DesafioMV.Model.Entity.Movimentacao;

public class MovimentacaoMapper {
    private MovimentacaoMapper () {

    }

    public static MovimentacaoDTO mapper(Movimentacao movimentacao) {

        MovimentacaoDTO movimentacaoDTO = new MovimentacaoDTO();

        movimentacaoDTO.setDataMovimentacao(movimentacao.getDataMovimentacao().format(DateTimeFormatter.ofPattern(DD_MM_YYYY)));
        movimentacaoDTO.setId(movimentacao.getId());
        movimentacaoDTO.setMovimentacaoInicial(movimentacao.getMovimentacaoInicial());
        movimentacaoDTO.setTipoMovimentacao(movimentacao.getTipoMovimentacao());
        movimentacaoDTO.setValorMovimentacao(movimentacao.getValorMovimentacao());
        movimentacaoDTO.setConta(recuperarContaDTO(movimentacao.getConta()));
        movimentacaoDTO.setEmpresa(recuperarEmpresaDTO(movimentacao.getEmpresa()));

        return movimentacaoDTO;
    }

    private static EmpresaDTO recuperarEmpresaDTO(Empresa empresa) {

        EmpresaDTO empresaDTO = new EmpresaDTO();

        empresaDTO.setCnpj(empresa.getCnpj());
        empresaDTO.setId(empresa.getId());
        empresaDTO.setNome(empresa.getNome());

        return empresaDTO;
    }

    private static ContaDTO recuperarContaDTO(Conta conta) {

        ContaDTO contaDTO = new ContaDTO();

        contaDTO.setAgencia(conta.getAgencia());
        contaDTO.setAtivo(conta.getAtivo());
        contaDTO.setId(conta.getId());
        contaDTO.setNumeroConta(conta.getNumeroConta());
        contaDTO.setSaldoInicial(conta.getSaldoInicial());
        contaDTO.setCliente(recuperarClienteDTO(conta.getCliente()));

        return contaDTO;
    }

    private static ClienteResumoDTO recuperarClienteDTO(Cliente cliente) {

        ClienteResumoDTO clienteResumoDTO = new ClienteResumoDTO();

        clienteResumoDTO.setAtivo(cliente.getAtivo());
        clienteResumoDTO.setDataCadastro(cliente.getDataCadastro().format(DateTimeFormatter.ofPattern(DD_MM_YYYY)));
        clienteResumoDTO.setEmail(cliente.getEmail());
        clienteResumoDTO.setId(cliente.getId());
        clienteResumoDTO.setNumeroTelefone(cliente.getNumeroTelefone());

        return clienteResumoDTO;
    }

    public static Movimentacao mapper(MovimentacaoInicialDTO movimentacaoDTO, Empresa empresa, Conta conta) {

        Movimentacao movimentacao = new Movimentacao();

        movimentacao.setConta(conta);
        movimentacao.setDataMovimentacao(movimentacaoDTO.getDataMovimentacao());
        movimentacao.setEmpresa(empresa);
        movimentacao.setMovimentacaoInicial(movimentacaoDTO.getMovimentacaoInicial());
        movimentacao.setTipoMovimentacao(TipoMovimentacaoEnum.valueOf(movimentacaoDTO.getTipoMovimentacao()));
        movimentacao.setValorMovimentacao(movimentacaoDTO.getValorMovimentacao());

        return movimentacao;
    }

    public static Movimentacao mapper(AddMovimentacaoDTO movimentacaoDTO, Empresa empresa, Conta conta) {

        Movimentacao movimentacao = new Movimentacao();

        movimentacao.setConta(conta);
        movimentacao.setDataMovimentacao(movimentacaoDTO.getDataMovimentacao());
        movimentacao.setEmpresa(empresa);
        movimentacao.setMovimentacaoInicial(movimentacaoDTO.getMovimentacaoInicial());
        movimentacao.setTipoMovimentacao(TipoMovimentacaoEnum.valueOf(movimentacaoDTO.getTipoMovimentacao()));
        movimentacao.setValorMovimentacao(movimentacaoDTO.getValorMovimentacao());

        return movimentacao;
    }
}
