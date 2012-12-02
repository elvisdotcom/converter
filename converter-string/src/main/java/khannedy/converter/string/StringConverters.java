package khannedy.converter.string;

import khannedy.converter.api.ConverterManager;
import khannedy.converter.string.impl.*;

/**
 * @author Eko Kurniawan Khannedy
 */
final public class StringConverters {

    private StringConverters() {
        // utility class
    }

    static public void register(final ConverterManager manager) {
        manager.register(new StringToBigDecimalConverter());
        manager.register(new StringToBigIntegerConverter());
        manager.register(new StringToBooleanConverter());
        manager.register(new StringToByteConverter());
        manager.register(new StringToCharacterConverter());
        manager.register(new StringToDateConverter());
        manager.register(new StringToDateSqlConverter());
        manager.register(new StringToDoubleConverter());
        manager.register(new StringToFloatConverter());
        manager.register(new StringToIntegerConverter());
        manager.register(new StringToLongConverter());
        manager.register(new StringToShortConverter());
        manager.register(new StringToTimeConverter());
        manager.register(new StringToTimestampConverter());
        manager.register(new StringToUriConverter());
        manager.register(new StringToUrlConverter());
    }
}