package SchoolManagement.AcademicHistory.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SchoolManagement.AcademicHistory.entity.Subject;


/**
 * Interface for generic CRUD operations on a repository for {@link Subject} class.
 */
@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {
    
    public List<Subject> findByName(String name);

    public List<Subject> findByNameOrderByNameAsc(int credits);

    public List<Subject> findByCredits(int credits);

    public List<Subject> findByCreditsOrderByNameAsc(int credits);

    
}
