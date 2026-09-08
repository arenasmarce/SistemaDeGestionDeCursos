package co.edu.cesde.infrastructure.Repositories;

import co.edu.cesde.domain.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseJpaRepository extends JpaRepository<Course,Long> {
}
