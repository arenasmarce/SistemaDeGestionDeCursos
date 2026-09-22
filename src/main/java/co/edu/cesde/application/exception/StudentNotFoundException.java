package co.edu.cesde.application.exception;

public class StudentNotFoundException extends ResourceNotFoundException{

    public StudentNotFoundException(Long id) {
        super("No existe un estudiante con el id: " + id );
    }
}