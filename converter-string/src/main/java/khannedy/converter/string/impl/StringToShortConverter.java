package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToShortConverter extends StringNotBlankConverter<Short> {

    @Override
    public Short doConvert(String value) throws ConverterException {
        try {
            return Short.parseShort(value);
        } catch (NumberFormatException ex) {
            throw new ConverterException(ex);
        }
    }
}