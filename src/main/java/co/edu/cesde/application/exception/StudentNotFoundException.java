package co.edu.cesde.application.exception;

public class StudentNotFoundException extends BusinessException {

    public StudentNotFoundException(Long id) {
        super("No existe un estudiante con el id: " + id );
    }
}