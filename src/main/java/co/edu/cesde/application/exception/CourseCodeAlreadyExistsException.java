package co.edu.cesde.application.exception;

public class CourseCodeAlreadyExistsException extends ResourceAreadyExistsExeception{
    public CourseCodeAlreadyExistsException(String code) {
        super("El código del curso " + code + " ya existe");
    }
}