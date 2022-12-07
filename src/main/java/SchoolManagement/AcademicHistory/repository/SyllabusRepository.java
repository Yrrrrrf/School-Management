package SchoolManagement.AcademicHistory.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SchoolManagement.AcademicHistory.entity.Syllabus;


/**
 * Interface for generic CRUD operations on a repository for {@link Syllabus} class.
 */
@Repository
public interface SyllabusRepository extends CrudRepository<Syllabus, Long> {

    public Syllabus findByName(String name);
    
}
