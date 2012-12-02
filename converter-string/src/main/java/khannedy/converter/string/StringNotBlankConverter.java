package khannedy.converter.string;

import khannedy.converter.api.exception.ConverterException;

/**
 * @author Eko Kurniawan Khannedy
 */
public abstract class StringNotBlankConverter<T> extends StringConverter<T> {

    @Override
    public T convert(String s) throws ConverterException {
        if (s == null || s.trim().isEmpty())
            throw new ConverterException("Value is blank");

        return doConvert(s);
    }

    abstract public T doConvert(String value) throws ConverterException;
}