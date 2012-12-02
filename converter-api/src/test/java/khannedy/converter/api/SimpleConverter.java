package khannedy.converter.api;

import khannedy.converter.api.exception.ConverterException;

/**
 * @author Eko Kurniawan Khannedy
 */
public class SimpleConverter implements Converter<String, Integer> {

    @Override
    public Class<String> fromClass() {
        return String.class;
    }

    @Override
    public Class<Integer> toClass() {
        return Integer.class;
    }

    @Override
    public Integer convert(String s) throws ConverterException {
        return Integer.parseInt(s);
    }
}