package co.edu.cesde.application.exception;

public class StudentAlreadyExistsException extends ResourceAreadyExistsExeception{
    public StudentAlreadyExistsException(String message) {
        super(message);
    }
}
