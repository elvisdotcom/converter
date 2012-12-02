package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToDoubleConverter extends StringNotBlankConverter<Double> {

    @Override
    public Double doConvert(String value) throws ConverterException {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException ex) {
            throw new ConverterException(ex);
        }
    }
}