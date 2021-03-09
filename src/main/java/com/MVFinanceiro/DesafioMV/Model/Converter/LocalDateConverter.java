package com.MVFinanceiro.DesafioMV.Model.Converter;

public class LocalDateConverter {

    @Converter(autoApply = true)
    public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

        @Override
        public Date convertToDatabaseColumn(LocalDate localDate) {
            return Optional.ofNullable(localDate).map(Date::valueOf).orElse(null);
        }

        @Override
        public LocalDate convertToEntityAttribute(Date date) {
            return Optional.ofNullable(date).map(Date::toLocalDate).orElse(null);
        }
}
