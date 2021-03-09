package com.MVFinanceiro.DesafioMV.Model.Relatorio;

import java.math.BigDecimal;

public class SaldoPeriodoCSVDTO {

    private String periodo;

    private String nome;

    private String dataCadastro;


    private String endereco;


    private Long movimentacaoCredito;


    private Long movimentacaoDebito;

    private Long totalMovimentacao;

    private BigDecimal valorPago;

    private BigDecimal saldoInicial;

    private BigDecimal saldoAtual;

    private SaldoPeriodoCSVDTO(Builder builder) {
        this.periodo = builder.periodo;
        this.nome = builder.nome;
        this.dataCadastro = builder.dataCadastro;
        this.endereco = builder.endereco;
        this.movimentacaoCredito = builder.movimentacaoCredito;
        this.movimentacaoDebito = builder.movimentacaoDebito;
        this.totalMovimentacao = builder.totalMovimentacao;
        this.valorPago = builder.valorPago;
        this.saldoInicial = builder.saldoInicial;
        this.saldoAtual = builder.saldoAtual;
    }

    public SaldoPeriodoCSVDTO() {
    }

    public SaldoPeriodoCSVDTO(String periodo, String nome, String dataCadastro, String endereco,
                              Long movimentacaoCredito, Long movimentacaoDebito, Long totalMovimentacao, BigDecimal valorPago,
                              BigDecimal saldoInicial, BigDecimal saldoAtual) {
        super();
        this.periodo = periodo;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
        this.movimentacaoCredito = movimentacaoCredito;
        this.movimentacaoDebito = movimentacaoDebito;
        this.totalMovimentacao = totalMovimentacao;
        this.valorPago = valorPago;
        this.saldoInicial = saldoInicial;
        this.saldoAtual = saldoAtual;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

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

    public Long getMovimentacaoCredito() {
        return movimentacaoCredito;
    }

    public void setMovimentacaoCredito(Long movimentacaoCredito) {
        this.movimentacaoCredito = movimentacaoCredito;
    }

    public Long getMovimentacaoDebito() {
        return movimentacaoDebito;
    }

    public void setMovimentacaoDebito(Long movimentacaoDebito) {
        this.movimentacaoDebito = movimentacaoDebito;
    }

    public Long getTotalMovimentacao() {
        return totalMovimentacao;
    }

    public void setTotalMovimentacao(Long totalMovimentacao) {
        this.totalMovimentacao = totalMovimentacao;
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

    public static Builder builder() {
        return new Builder();
    }


    public static final class Builder {
        private String periodo;
        private String nome;
        private String dataCadastro;
        private String endereco;
        private Long movimentacaoCredito;
        private Long movimentacaoDebito;
        private Long totalMovimentacao;
        private BigDecimal valorPago;
        private BigDecimal saldoInicial;
        private BigDecimal saldoAtual;

        private Builder() {
        }

        public Builder withPeriodo(String periodo) {
            this.periodo = periodo;
            return this;
        }

        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder withDataCadastro(String dataCadastro) {
            this.dataCadastro = dataCadastro;
            return this;
        }

        public Builder withEndereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public Builder withMovimentacaoCredito(Long movimentacaoCredito) {
            this.movimentacaoCredito = movimentacaoCredito;
            return this;
        }

        public Builder withMovimentacaoDebito(Long movimentacaoDebito) {
            this.movimentacaoDebito = movimentacaoDebito;
            return this;
        }

        public Builder withTotalMovimentacao(Long totalMovimentacao) {
            this.totalMovimentacao = totalMovimentacao;
            return this;
        }

        public Builder withValorPago(BigDecimal valorPago) {
            this.valorPago = valorPago;
            return this;
        }

        public Builder withSaldoInicial(BigDecimal saldoInicial) {
            this.saldoInicial = saldoInicial;
            return this;
        }

        public Builder withSaldoAtual(BigDecimal saldoAtual) {
            this.saldoAtual = saldoAtual;
            return this;
        }

        public SaldoPeriodoCSVDTO build() {
            return new SaldoPeriodoCSVDTO(this);
        }
    }
}
