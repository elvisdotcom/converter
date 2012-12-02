package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToFloatConverter extends StringNotBlankConverter<Float> {

    @Override
    public Float doConvert(String value) throws ConverterException {
        try {
            return Float.parseFloat(value);
        } catch (NumberFormatException ex) {
            throw new ConverterException(ex);
        }
    }

    @Override
    public Class<Float> toClass() {
        return Float.class;
    }
}