package khannedy.converter.api;

import khannedy.converter.api.exception.ConverterException;

/**
 * @author Eko Kurniawan Khannedy
 */
public interface Converter<FROM, TO> {

    TO convert(FROM from) throws ConverterException;

}
