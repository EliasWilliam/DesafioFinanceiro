package com.MVFinanceiro.DesafioMV.Model.Entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Conta implements Serializable {
    @Id
    @Column(name = "ID_CONTA")
    @GeneratedValue(generator = "SEQ_CONTA", strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank
    @Size(max = 10)
    @Column(name = "AGENCIA")
    private String agencia;

    @NotBlank
    @Size(max = 10)
    @Column(name = "NUMERO_CONTA")
    private String numeroConta;

    @NotNull
    @Column(name = "ATIVO")
    private Boolean ativo;

    @Column(name = "SALDO_INICIAL")
    private BigDecimal saldoInicial;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", foreignKey = @ForeignKey(name = "FK_CLIENTE_CONTA"))
    private Cliente cliente;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(BigDecimal saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        result = prime * result + ((numeroConta == null) ? 0 : numeroConta.hashCode());
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
        Conta other = (Conta) obj;
        if (agencia == null) {
            if (other.agencia != null)
                return false;
        } else if (!agencia.equals(other.agencia))
            return false;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        if (numeroConta == null) {
            if (other.numeroConta != null)
                return false;
        } else if (!numeroConta.equals(other.numeroConta))
            return false;
        return true;
    }
}
