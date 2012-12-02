package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToUrlConverter extends StringNotBlankConverter<URL> {

    @Override
    public URL doConvert(String value) throws ConverterException {
        try {
            return new URI(value).toURL();
        } catch (URISyntaxException e) {
            throw new ConverterException(e);
        } catch (MalformedURLException e) {
            throw new ConverterException(e);
        }
    }
}