package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToLongConverter extends StringNotBlankConverter<Long> {

    @Override
    public Long doConvert(String value) throws ConverterException {
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException ex) {
            throw new ConverterException(ex);
        }
    }

    @Override
    public Class<Long> toClass() {
        return Long.class;
    }
}