package co.edu.cesde.application.Excepciones;

public class CourseNotFoundException extends BusinessException{
    public CourseNotFoundException(Long id) {
        super("No existe un curso con id :" + id);
    }
}
