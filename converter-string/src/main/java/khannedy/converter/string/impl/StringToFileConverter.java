package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

import java.io.File;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToFileConverter extends StringNotBlankConverter<File> {

    @Override
    public File doConvert(String value) throws ConverterException {
        File file = new File(value);
        return file;
    }

    @Override
    public Class<File> toClass() {
        return File.class;
    }
}