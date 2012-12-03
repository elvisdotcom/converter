package khannedy.converter.string;

import junit.framework.Assert;
import khannedy.converter.api.exception.ConverterException;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringNotBlankConverterTest extends Assert {

    private Logger logger = Logger.getLogger(StringNotBlankConverterTest.class.getName());

    @Test
    public void test() {
        logger.info("test StringNotBlankConverter");

        StringNotBlankConverter<Integer> converter = new StringNotBlankConverter<Integer>() {

            @Override
            public Integer doConvert(String value) throws ConverterException {
                return Integer.parseInt(value);
            }

            @Override
            public Class<Integer> toClass() {
                return Integer.class;
            }
        };

        try {
            converter.convert(null);
            fail("StringNotBlankConverter must not accept null value");
        } catch (ConverterException ex) {
            // success
        }

        try {
            converter.convert("");
            fail("StringNotBlankConverter must not accept empty string");
        } catch (ConverterException ex) {
            // success
        }

        try {
            converter.convert("      ");
            fail("StringNotBlankConverter must not accept blank string");
        } catch (ConverterException ex) {
            // success
        }

        Integer value = converter.convert("100");
        assertEquals(value, new Integer(100));
    }

}