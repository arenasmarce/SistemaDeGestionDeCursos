package co.edu.cesde.application;


import co.edu.cesde.domain.models.Course;


import java.util.List;
import java.util.Optional;

public interface CurseRepository {
    Course save(Course course);
    Optional<Course> findById(Long id);
    List<Course> findAll();
    Course update(Course course);
    void deleteById(Long id);
    boolean existsById(Long id);

}
