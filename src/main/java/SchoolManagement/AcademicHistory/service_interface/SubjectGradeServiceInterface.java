package SchoolManagement.AcademicHistory.service_interface;


import java.util.List;

import org.springframework.stereotype.Repository;

import SchoolManagement.AcademicHistory.entity.Subject;


/**
 * This is the interface that interacts with the database.
 * Also implements more specific methods of the repository for the {@link SubjectGrade} class.
 */
@Repository
public interface SubjectGradeServiceInterface {

    public List<Subject> getAll();

    // Returns all the subjects that a student has taken, even if he has not passed them.
    public List<Subject> getByStudentId(Long studentId);

    public Subject getById(Long subjectId);
    
    public Subject save(Subject subject);

    public void deleteById(Long subjectId);

}
