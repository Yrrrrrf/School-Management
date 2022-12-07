package SchoolManagement.AcademicHistory.service_interface;


import java.util.List;

import org.springframework.stereotype.Repository;

import SchoolManagement.AcademicHistory.entity.SubjectGrade;


/**
 * This is the interface that interacts with the database.
 * Also implements more specific methods of the repository for the {@link SubjectGrade} class.
 */
@Repository
public interface SubjectGradeServiceInterface {

    // Returns all the subjects that a student has taken, even if he has not passed them.
    
    public List<SubjectGrade> getAll();

    public List<SubjectGrade> getByStudentId(Long studentId);
    
    public List<SubjectGrade> getBySubjectId(Long subjectId);

    public SubjectGrade save(SubjectGrade subject);

    public void deleteById(Long subjectId);

}
