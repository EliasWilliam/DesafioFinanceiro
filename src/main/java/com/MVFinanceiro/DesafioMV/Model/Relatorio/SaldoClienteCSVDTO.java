package com.MVFinanceiro.DesafioMV.Model.Relatorio;

import java.math.BigDecimal;

public class SaldoClienteCSVDTO {

    private String nome;
    private String dataCadastro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getMovimentacaoDebito() {
        return movimentacaoDebito;
    }

    public void setMovimentacaoDebito(Long movimentacaoDebito) {
        this.movimentacaoDebito = movimentacaoDebito;
    }

    public Long getTotalMovimentacao() {
        return TotalMovimentacao;
    }

    public void setTotalMovimentacao(Long totalMovimentacao) {
        TotalMovimentacao = totalMovimentacao;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(BigDecimal saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public BigDecimal getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(BigDecimal saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    private String endereco;
    private Long movimentacaoDebito;
    private Long TotalMovimentacao;
    private BigDecimal valorPago;
    private BigDecimal saldoInicial;
    private BigDecimal saldoAtual;



}
