package co.edu.cesde.application.Excepciones;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
