package co.edu.cesde.application.Excepciones;

public class EnrollmentNotFoundException extends BusinessException {
    public EnrollmentNotFoundException(String id) {
        super("No existe un a matricula con el id:" + id);
    }
}
