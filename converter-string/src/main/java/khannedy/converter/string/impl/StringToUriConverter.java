package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToUriConverter extends StringNotBlankConverter<URI> {

    @Override
    public URI doConvert(String value) throws ConverterException {
        try {
            return new URI(value);
        } catch (URISyntaxException e) {
            throw new ConverterException(e);
        }
    }

    @Override
    public Class<URI> toClass() {
        return URI.class;
    }
}