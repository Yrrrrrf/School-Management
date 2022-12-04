package SchoolManagement.AcademicHistory.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SchoolManagement.AcademicHistory.entity.SubjectGrade;


/**
 * Interface for generic CRUD operations on a repository for {@link SubjectGrade} class.
 */
@Repository
public interface SubjectGradeRepository extends CrudRepository<SubjectGrade, Long> {
    
    public List<SubjectGrade> findByStudentId(Long studentId);

    public List<SubjectGrade> findBySubjectId(Long subjectId);

    public List<SubjectGrade> findByGrade(float grade);

}
