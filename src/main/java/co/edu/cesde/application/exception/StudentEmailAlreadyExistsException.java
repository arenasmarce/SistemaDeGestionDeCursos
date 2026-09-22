package co.edu.cesde.application.exception;

public class StudentEmailAlreadyExistsException extends BusinessException {
    public StudentEmailAlreadyExistsException(String message) {
        super("Email already exists:" + message);
    }
}
