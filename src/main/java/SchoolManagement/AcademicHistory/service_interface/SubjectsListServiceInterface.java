package SchoolManagement.AcademicHistory.service_interface;


import java.util.List;

import org.springframework.stereotype.Repository;

import SchoolManagement.AcademicHistory.entity.SubjectsList;


/**
 * This is the interface that interacts with the database.
 * Also implements more specific methods of the repository for the {@link SubjectList} class.
 */
@Repository
public interface SubjectsListServiceInterface {

    public List<SubjectsList> getAll();

    public List<SubjectsList> getBySubjectId(Long subjectId);

    public List<SubjectsList> getBySyllabusId(Long syllabusId);

    public SubjectsList getBySyllabusIdAndSubjectId(Long syllabusId, Long subjectId);

    public SubjectsList save(SubjectsList subject);

}
