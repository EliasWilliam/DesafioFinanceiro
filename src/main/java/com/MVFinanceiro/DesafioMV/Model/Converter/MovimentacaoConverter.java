package com.MVFinanceiro.DesafioMV.Model.Converter;

import com.MVFinanceiro.DesafioMV.Model.Enums.MovimentacaoEnum;

public class MovimentacaoConverter implements AttributeConverter<MovimentacaoEnum, String> {

    private static final String VALOR_INFORMADO_NAO_LOCALIZADO_PARA_O_ENUM = "Valor não está informado.";
    private static final String DEBITO = "D";
    private static final String CREDITO = "C";

    @Override
    public String convertToDatabaseColumn(MovimentacaoEnum attribute) {

        if (attribute != null) {

            switch (attribute) {
                case CREDITO:
                    return CREDITO;
                case DEBITO:
                    return DEBITO;
                default:
                    throw new IllegalArgumentException(VALOR_INFORMADO_NAO_LOCALIZADO_PARA_O_ENUM);
            }
        } else {
            return null;
        }
    }

    @Override
    public MovimentacaoEnum convertToEntityAttribute(String dbData) {

        switch (dbData) {
            case CREDITO:
                return MovimentacaoEnum.CREDITO;
            case DEBITO:
                return MovimentacaoEnum.DEBITO;
            default:
                throw new IllegalArgumentException(VALOR_INFORMADO_NAO_LOCALIZADO_PARA_O_ENUM);
        }
    }

}
