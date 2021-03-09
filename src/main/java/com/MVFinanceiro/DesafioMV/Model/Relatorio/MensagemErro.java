package com.MVFinanceiro.DesafioMV.Model.Relatorio;

import java.time.LocalDate;

public class MensagemErro {

    private Integer codigo;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    private LocalDate timestamp;
    private String mensagem;
    private String detalhe;

    public MensagemErro(int codigo, LocalDate LocalDate, String mensagem, String detalhe){
        super();
        this.codigo = codigo;
        this.timestamp = timestamp;
        this.mensagem = mensagem;
        this.detalhe = detalhe;

    }


}
