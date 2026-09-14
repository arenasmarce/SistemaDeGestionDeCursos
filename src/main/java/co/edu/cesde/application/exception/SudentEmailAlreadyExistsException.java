package co.edu.cesde.application.exception;

public class SudentEmailAlreadyExistsException extends RuntimeException {
    public SudentEmailAlreadyExistsException(String message) {
        super("Email already exists:" + message);
    }
}
