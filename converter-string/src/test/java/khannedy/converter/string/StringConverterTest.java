package khannedy.converter.string;

import junit.framework.Assert;
import khannedy.converter.api.exception.ConverterException;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * @author Eko Kurniawan Khannedy
 */
public class StringConverterTest extends Assert {

    private Logger logger = Logger.getLogger(StringConverterTest.class.getName());

    @Test
    public void test() {
        logger.info("test StringConverter");
        StringConverter<Integer> converter = new StringConverter<Integer>() {

            @Override
            public Class<Integer> toClass() {
                return Integer.class;
            }

            @Override
            public Integer convert(String s) throws ConverterException {
                return Integer.parseInt(s);
            }
        };

        assertEquals(converter.fromClass(), String.class);
    }

}