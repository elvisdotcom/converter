package khannedy.converter.api.exception;

/**
 * @author Eko Kurniawan Khannedy
 */
public class ConverterException extends RuntimeException {

    public ConverterException() {
    }

    public ConverterException(String message) {
        super(message);
    }

    public ConverterException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConverterException(Throwable cause) {
        super(cause);
    }
}