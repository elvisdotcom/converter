package khannedy.converter.string.impl;

import junit.framework.Assert;
import khannedy.converter.api.exception.ConverterException;
import org.junit.Test;

import java.math.BigInteger;
import java.util.logging.Logger;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringToBigIntegerConverterTest extends Assert {

    private Logger logger = Logger.getLogger(StringToBigIntegerConverter.class.getName());

    @Test
    public void testToClass() {
        logger.info("test StringToBigIntegerConverter.toClass()");

        StringToBigIntegerConverter converter = new StringToBigIntegerConverter();
        assertEquals(converter.toClass(), BigInteger.class);
    }

    @Test
    public void testConverter() {
        logger.info("test StringToBigIntegerConverter.convert(String)");

        StringToBigIntegerConverter converter = new StringToBigIntegerConverter();
        BigInteger convert = converter.convert("100000");

        assertNotNull(convert);

        try {
            converter.convert("wrong value");
            Assert.fail();
        } catch (ConverterException ex) {
            //success
        }
    }

}