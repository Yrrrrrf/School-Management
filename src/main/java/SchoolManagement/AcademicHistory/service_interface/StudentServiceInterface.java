package SchoolManagement.AcademicHistory.service_interface;


import java.util.List;

import org.springframework.stereotype.Repository;

import SchoolManagement.AcademicHistory.entity.Student;


/**
 * This is the interface that interacts with the database.
 * Also implements more specific methods of the repository for the {@link Student} class.
 */
@Repository
public interface StudentServiceInterface {

    public List<Student> getAll();

    public Student getById(Long subjectId);

    public List<Student> getByName(String name);

    public List<Student> getByMail(String mail);

    public Student save(Student subject);

    public void deleteById(Long subjectId);

}

