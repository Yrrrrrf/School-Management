package SchoolManagement.AcademicHistory.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SchoolManagement.AcademicHistory.entity.Student;


/**
 * Interface for generic CRUD operations on a repository for {@link Student} class.
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    
    public List<Student> findByName(String name);

    public List<Student> findByNameOrderByNameAsc(String name);

    public Optional<Student> findByMail(String mail);

    public List<Student> findBySyllabusId(int syllabusId);    


}
