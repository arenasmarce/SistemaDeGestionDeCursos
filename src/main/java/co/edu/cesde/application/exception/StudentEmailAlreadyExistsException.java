package co.edu.cesde.application.exception;

public class StudentEmailAlreadyExistsException extends ResourceAreadyExistsExeception {
    public StudentEmailAlreadyExistsException(String message) {
        super("Email already exists:" + message);
    }
}
