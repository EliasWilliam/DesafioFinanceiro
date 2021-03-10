package com.MVFinanceiro.DesafioMV.Model.Mapper;

import com.MVFinanceiro.DesafioMV.Model.Conta.AddContaDTO;
import com.MVFinanceiro.DesafioMV.Model.Conta.AlterarContaDTO;
import com.MVFinanceiro.DesafioMV.Model.Conta.ContaDTO;
import com.MVFinanceiro.DesafioMV.Model.Entity.Cliente;
import com.MVFinanceiro.DesafioMV.Model.Entity.Conta;

import java.math.BigDecimal;

public class ContaMapper {
    private static Cliente cliente;
    private static AddContaDTO contaDTO;

    private ContaMapper() {

    }

    public static ContaDTO mapper(Conta conta) {

        ContaDTO contaDTO = new ContaDTO();

        contaDTO.setAgencia(conta.getAgencia());
        contaDTO.setAtivo(conta.getAtivo());
        contaDTO.setId(conta.getId());
        contaDTO.setNumeroConta(conta.getNumeroConta());
        contaDTO.setSaldoInicial(conta.getSaldoInicial());

        return contaDTO;
    }

    public static Conta mapper(Cliente cliente, AddContaDTO contaDTO) {
        ContaMapper.cliente = cliente;
        ContaMapper.contaDTO = contaDTO;

        Conta conta = new Conta();

        conta.setAgencia(contaDTO.getAgencia());
        conta.setAtivo(Boolean.TRUE);
        conta.setCliente(cliente);
        conta.setNumeroConta(contaDTO.getNumeroConta());
        conta.setSaldoInicial(BigDecimal.ZERO);

        return conta;
    }

    public static Conta mapper(Cliente cliente, Conta conta, AlterarContaDTO contaDTO) {

        conta.setAgencia(contaDTO.getAgencia());
        conta.setAtivo(contaDTO.getAtivo());
        conta.setCliente(cliente);
        conta.setNumeroConta(contaDTO.getNumeroConta());
        conta.setSaldoInicial(BigDecimal.ZERO);

        return conta;
    }
}
