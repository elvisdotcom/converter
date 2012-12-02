package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToByteConverter extends StringNotBlankConverter<Byte> {

    @Override
    public Byte doConvert(String value) throws ConverterException {
        try {
            return Byte.parseByte(value);
        } catch (NumberFormatException ex) {
            throw new ConverterException(ex);
        }
    }
}