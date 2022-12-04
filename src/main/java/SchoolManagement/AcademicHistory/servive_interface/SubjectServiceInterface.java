package SchoolManagement.AcademicHistory.servive_interface;


import java.util.List;

import org.springframework.stereotype.Repository;

import SchoolManagement.AcademicHistory.entity.Subject;


/**
 * This is the interface that interacts with the database.
 * Also implements more specific methods of the repository for the {@link Subject} class.
 */
@Repository
public interface SubjectServiceInterface {

    public List<Subject> getAll();

    public Subject getById(Long subjectId);

    public List<Subject> getByName(String name);

    public List<Subject> getByCredits(int credits);

    public Subject save(Subject subject);

    public void deleteById(Long subjectId);

}
