package co.edu.cesde.application;

import co.edu.cesde.domain.models.Enrollment;

import java.util.List;
import java.util.Optional;

public interface EnrollmentRepository {
    Enrollment save(Enrollment enrollment);
    Optional<Enrollment> findById(Long id);
    List<Enrollment> findAll();
    Enrollment update(Enrollment enrollment);
    void deleteById(Long id);
    boolean existsById(Long id);
}
