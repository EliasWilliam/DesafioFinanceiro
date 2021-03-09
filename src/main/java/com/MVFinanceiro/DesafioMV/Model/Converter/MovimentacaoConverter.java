package com.MVFinanceiro.DesafioMV.Model.Converter;

public class MovimentacaoConverter implements AttributeConverter<TipoMovimentacaoEnum, String> {

    private static final String VALOR_INFORMADO_NAO_LOCALIZADO_PARA_O_ENUM = "Valor não está informado.";
    private static final String DEBITO = "D";
    private static final String CREDITO = "C";

    @Override
    public String convertToDatabaseColumn(TipoMovimentacaoEnum attribute) {

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
    public TipoMovimentacaoEnum convertToEntityAttribute(String dbData) {

        switch (dbData) {
            case CREDITO:
                return TipoMovimentacaoEnum.CREDITO;
            case DEBITO:
                return TipoMovimentacaoEnum.DEBITO;
            default:
                throw new IllegalArgumentException(VALOR_INFORMADO_NAO_LOCALIZADO_PARA_O_ENUM);
        }
    }

}
