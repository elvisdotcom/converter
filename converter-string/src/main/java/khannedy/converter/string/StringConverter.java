package khannedy.converter.string;

import khannedy.converter.api.Converter;

/**
 * @author Eko Kurniawan Khannedy
 */
public abstract class StringConverter<T> implements Converter<String, T> {

    @Override
    public Class<String> fromClass() {
        return String.class;
    }
}