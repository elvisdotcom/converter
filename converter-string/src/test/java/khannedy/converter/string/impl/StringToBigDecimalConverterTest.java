package khannedy.converter.string.impl;

import junit.framework.Assert;
import khannedy.converter.api.exception.ConverterException;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToBigDecimalConverterTest {

    private Logger logger = Logger.getLogger(StringToBigDecimalConverter.class.getName());

    @Test
    public void testToClass() {
        logger.info("test StringToBigDecimalConverter.toClass()");

        StringToBigDecimalConverter converter = new StringToBigDecimalConverter();
        Assert.assertEquals(converter.toClass(), BigDecimal.class);
    }

    @Test
    public void testConverter() {
        logger.info("test StringToBigDecimalConverter.convert(String)");

        StringToBigDecimalConverter converter = new StringToBigDecimalConverter();
        BigDecimal convert = converter.convert("100000");

        Assert.assertNotNull(convert);

        try {
            converter.convert("wrong value");
            Assert.fail();
        } catch (ConverterException ex) {
            //success
        }
    }

}