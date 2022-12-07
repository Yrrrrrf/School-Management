package SchoolManagement.AcademicHistory.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SchoolManagement.AcademicHistory.entity.SubjectsList;
import SchoolManagement.AcademicHistory.entity.Syllabus;


/**
 * Interface for generic CRUD operations on a repository for {@link Syllabus} class.
 */
@Repository
public interface SyllabusRepository extends CrudRepository<Syllabus, Long> {

    public Syllabus findByName(String name);
    
    @Query("SELECT s FROM Syllabus s WHERE s.name = ?1")
    public List<SubjectsList> findBySyllabus(int recommendedSemester);

}
