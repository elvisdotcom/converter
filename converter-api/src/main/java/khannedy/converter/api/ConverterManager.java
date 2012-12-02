package khannedy.converter.api;

import khannedy.converter.api.exception.ConverterException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eko Kurniawan Khannedy
 */
public class ConverterManager {

    private Map<Class<?>, Map<Class<?>, Converter<?, ?>>> map;

    public ConverterManager() {
        map = new HashMap<Class<?>, Map<Class<?>, Converter<?, ?>>>();
    }

    protected Map<Class<?>, Converter<?, ?>> submap(Class<?> key) {
        Map<Class<?>, Converter<?, ?>> submap = map.get(key);
        if (submap == null) {
            submap = new HashMap<Class<?>, Converter<?, ?>>();
            map.put(key, submap);
        }
        return submap;
    }

    public <FROM, TO> void register(Converter<FROM, TO> converter) {
        submap(converter.fromClass()).put(converter.toClass(), converter);
    }

    public <FROM, TO> Converter<FROM, TO> get(Class<FROM> fromClass, Class<TO> toClass) {
        return (Converter<FROM, TO>) submap(fromClass).get(toClass);
    }

    public <FROM, TO> TO convert(Class<FROM> fromClass, Class<TO> toClass, FROM value)
            throws ConverterException {
        Converter<FROM, TO> converter = this.<FROM, TO>get(fromClass, toClass);
        return converter.convert(value);
    }
}