package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToCharacterConverter extends StringNotBlankConverter<Character> {

    @Override
    public Character doConvert(String value) throws ConverterException {
        return Character.valueOf(value.charAt(0));
    }
}