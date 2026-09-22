package co.edu.cesde.application.exception;

public class StudentAlreadyExistsException extends BusinessException {
    public StudentAlreadyExistsException(String message) {
        super(message);
    }
}
