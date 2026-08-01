package co.edu.cesde.application.Excepciones;

public class StudentNotFoundException extends BusinessException {

    public StudentNotFoundException(Long id) {
        super("Student not found: " + id);
    }
}