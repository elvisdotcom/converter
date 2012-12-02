package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToTimeConverter extends StringNotBlankConverter<Time> {

    private SimpleDateFormat format;

    public StringToTimeConverter(SimpleDateFormat format) {
        this.format = format;
    }

    public StringToTimeConverter() {
        format = new SimpleDateFormat("HH:mm:ss");
    }

    @Override
    public Time doConvert(String value) throws ConverterException {
        try {
            return new Time(format.parse(value).getTime());
        } catch (ParseException ex) {
            throw new ConverterException(ex);
        }
    }

    @Override
    public Class<Time> toClass() {
        return Time.class;
    }
}