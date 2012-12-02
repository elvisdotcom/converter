package khannedy.converter.api;

import junit.framework.Assert;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * @author Eko Kurniawan Khannedy
 */
public class ConverterManagerTest {

    private Logger logger = Logger.getLogger(ConverterManagerTest.class.getName());

    @Test
    public void testRegister() {
        logger.info("test ConverterManager.register(Converter)");

        ConverterManager manager = new ConverterManager();
        manager.register(new SimpleConverter());
    }

    @Test
    public void testGet() {
        logger.info("test ConverterManager.get(FromClass, ToClass)");

        ConverterManager manager = new ConverterManager();
        manager.register(new SimpleConverter());

        Converter<String, Integer> converter = manager.get(String.class, Integer.class);
        Assert.assertNotNull(converter);
    }

    @Test
    public void testConvert() {
        logger.info("test ConverterManager.convert(FromClass, ToClass, Value)");

        ConverterManager manager = new ConverterManager();
        manager.register(new SimpleConverter());

        Integer data = manager.convert(String.class, Integer.class, "100");
        Assert.assertEquals(data, new Integer(100));
    }

}