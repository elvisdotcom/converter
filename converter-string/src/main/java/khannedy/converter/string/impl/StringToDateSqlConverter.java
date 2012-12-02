package khannedy.converter.string.impl;

import khannedy.converter.api.exception.ConverterException;
import khannedy.converter.string.StringNotBlankConverter;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToDateSqlConverter extends StringNotBlankConverter<Date> {

    private SimpleDateFormat format;

    public StringToDateSqlConverter() {
        format = new SimpleDateFormat("yyyy-MM-dd");
    }

    public StringToDateSqlConverter(SimpleDateFormat format) {
        this.format = format;
    }

    @Override
    public Date doConvert(String value) throws ConverterException {
        try {
            return new Date(format.parse(value).getTime());
        } catch (ParseException ex) {
            throw new ConverterException(ex);
        }
    }
}