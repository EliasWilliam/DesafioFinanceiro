package com.MVFinanceiro.DesafioMV.Model.Expection;

public class NegocioExpection {

    public void NegocioException() {
    }

    public void NegocioException(String message, Throwable cause) {
        super(message, cause);
    }

    public void NegocioException(String message) {
        super(message);
    }
}
