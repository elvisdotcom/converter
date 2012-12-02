package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToIntegerConverter extends StringNotBlankConverter<Integer> {
    @Override
    public Integer doConvert(String value) throws ConverterException {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException ex) {
            throw new ConverterException(ex);
        }
    }
}