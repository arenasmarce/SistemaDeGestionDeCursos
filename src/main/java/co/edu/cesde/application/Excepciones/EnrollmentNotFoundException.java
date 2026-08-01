package co.edu.cesde.application.Excepciones;

public class EnrollmentNotFoundException extends BusinessException {
    public EnrollmentNotFoundException(Long id) {
        super("No existe un a matricula con el id:" + id);
    }
}
