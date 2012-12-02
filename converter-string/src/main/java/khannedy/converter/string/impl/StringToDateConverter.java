package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToDateConverter extends StringNotBlankConverter<Date> {

    private SimpleDateFormat format;

    public StringToDateConverter() {
        format = new SimpleDateFormat("yyyy-MM-dd");
    }

    public StringToDateConverter(SimpleDateFormat format) {
        this.format = format;
    }

    @Override
    public Date doConvert(String value) throws ConverterException {
        try {
            return format.parse(value);
        } catch (ParseException ex) {
            throw new ConverterException(ex);
        }
    }

    @Override
    public Class<Date> toClass() {
        return Date.class;
    }
}