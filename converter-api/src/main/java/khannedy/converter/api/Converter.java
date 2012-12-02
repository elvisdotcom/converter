package khannedy.converter.api;

import khannedy.converter.api.exception.ConverterException;

/**
 * @author Eko Kurniawan Khannedy
 */
public interface Converter<FROM, TO> {

    Class<FROM> fromClass();

    Class<TO> toClass();

    TO convert(FROM from) throws ConverterException;

}
