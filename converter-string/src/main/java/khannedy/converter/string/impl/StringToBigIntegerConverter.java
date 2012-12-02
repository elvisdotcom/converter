package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

import java.math.BigInteger;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToBigIntegerConverter extends StringNotBlankConverter<BigInteger> {

    @Override
    public BigInteger doConvert(String value) throws ConverterException {
        try {
            return new BigInteger(value);
        } catch (NumberFormatException ex) {
            throw new ConverterException(ex);
        }
    }
}