package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToBooleanConverter extends StringNotBlankConverter<Boolean> {

    @Override
    public Boolean doConvert(String value) throws ConverterException {
        return Boolean.parseBoolean(value);
    }

    @Override
    public Class<Boolean> toClass() {
        return Boolean.class;
    }
}