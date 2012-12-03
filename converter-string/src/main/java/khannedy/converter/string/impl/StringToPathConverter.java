package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToPathConverter extends StringNotBlankConverter<Path> {

    @Override
    public Path doConvert(String value) throws ConverterException {
        try {
            return Paths.get(value);
        } catch (InvalidPathException ex) {
            throw new ConverterException(ex);
        }
    }

    @Override
    public Class<Path> toClass() {
        return Path.class;
    }
}