package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToObjectConverter extends StringNotBlankConverter<Object> {

    @Override
    public Object doConvert(String value) throws ConverterException {
        try {
            return Class.forName(value).newInstance();
        } catch (InstantiationException e) {
            throw new ConverterException(e);
        } catch (IllegalAccessException e) {
            throw new ConverterException(e);
        } catch (ClassNotFoundException e) {
            throw new ConverterException(e);
        }
    }

    @Override
    public Class<Object> toClass() {
        return Object.class;
    }
}