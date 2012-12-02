package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToTimestampConverter extends StringNotBlankConverter<Timestamp> {

    private SimpleDateFormat format;

    public StringToTimestampConverter(SimpleDateFormat format) {
        this.format = format;
    }

    public StringToTimestampConverter() {
        format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    @Override
    public Timestamp doConvert(String value) throws ConverterException {
        try {
            return new Timestamp(format.parse(value).getTime());
        } catch (ParseException ex) {
            throw new ConverterException(ex);
        }
    }
}