package com.MVFinanceiro.DesafioMV.Model.Relatorio;

import java.math.BigDecimal;

public class ReceitaEmpresaCSVDTO {

    private String cnpj;

    private String nomeEmpresa;

    private String periodo;

    private String nome;

    private Long totalMovimentacoes;


    private BigDecimal saldo;

    private ReceitaEmpresaCSVDTO(Builder builder) {
        this.cnpj = builder.cnpj;
        this.nomeEmpresa = builder.nomeEmpresa;
        this.periodo = builder.periodo;
        this.nome = builder.nome;
        this.totalMovimentacoes = builder.totalMovimentacoes;
        this.saldo = builder.saldo;
    }

    public ReceitaEmpresaCSVDTO() {
    }

    public ReceitaEmpresaCSVDTO(String cnpj, String nomeEmpresa, String periodo, String nome, Long totalMovimentacoes,
                                BigDecimal saldo) {
        super();
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
        this.periodo = periodo;
        this.nome = nome;
        this.totalMovimentacoes = totalMovimentacoes;
        this.saldo = saldo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
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

    public Long getTotalMovimentacoes() {
        return totalMovimentacoes;
    }

    public void setTotalMovimentacoes(Long totalMovimentacoes) {
        this.totalMovimentacoes = totalMovimentacoes;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String cnpj;
        private String nomeEmpresa;
        private String periodo;
        private String nome;
        private Long totalMovimentacoes;
        private BigDecimal saldo;

        private Builder() {
        }

        public Builder withCnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public Builder withNomeEmpresa(String nomeEmpresa) {
            this.nomeEmpresa = nomeEmpresa;
            return this;
        }

        public Builder withPeriodo(String periodo) {
            this.periodo = periodo;
            return this;
        }

        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder withTotalMovimentacoes(Long totalMovimentacoes) {
            this.totalMovimentacoes = totalMovimentacoes;
            return this;
        }

        public Builder withSaldo(BigDecimal saldo) {
            this.saldo = saldo;
            return this;
        }

        public ReceitaEmpresaCSVDTO build() {
            return new ReceitaEmpresaCSVDTO(this);
        }
    }
}
