package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

import java.math.BigDecimal;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToBigDecimalConverter extends StringNotBlankConverter<BigDecimal> {

    @Override
    public BigDecimal doConvert(String value) throws ConverterException {
        try {
            return new BigDecimal(value);
        } catch (NumberFormatException ex) {
            throw new ConverterException(ex);
        }
    }

    @Override
    public Class<BigDecimal> toClass() {
        return BigDecimal.class;
    }
}