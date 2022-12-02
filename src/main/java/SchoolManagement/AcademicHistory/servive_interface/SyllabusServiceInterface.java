package SchoolManagement.AcademicHistory.servive_interface;


import java.util.List;

import org.springframework.stereotype.Repository;

import SchoolManagement.AcademicHistory.entity.Syllabus;


/**
 * This is the class that interacts with the database.
 * Also implements more specific methods of the repository for the {@link Syllabus} class.
 */
@Repository
public interface SyllabusServiceInterface {

    public List<Syllabus> getAll();

    public Syllabus getByName(String name);

    public void save(Syllabus syllabus);

    public void delete(Syllabus syllabus);

}
