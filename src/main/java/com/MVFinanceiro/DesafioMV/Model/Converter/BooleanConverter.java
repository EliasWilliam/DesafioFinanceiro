package com.MVFinanceiro.DesafioMV.Model.Converter;

import com.MVFinanceiro.DesafioMV.Model.Enums.ActiveEnum;

public class BooleanConverter implements AttributeConverter<Boolean, String> {


    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        if(attribute == null || BooleanUtils.isFalse(attribute)) {
            return ActiveEnum.N.toString();
        }
        return ActiveEnum.Y.toString();
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        if(ActiveEnum.N.toString().equals(dbData)) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }


}
