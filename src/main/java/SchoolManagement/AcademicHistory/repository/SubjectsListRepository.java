package SchoolManagement.AcademicHistory.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SchoolManagement.AcademicHistory.entity.SubjectsList;


/**
 * Interface for generic CRUD operations on a repository for {@link SubjectList} class.
 */
@Repository
public interface SubjectsListRepository extends CrudRepository<SubjectsList, Long> {

    public List<SubjectsList> findBySyllabusId(int syllabusId);

    public List<SubjectsList> findBySubjectId(int subjectId);

    public List<SubjectsList> findByRecommendedSemester(int recommendedSemester);

}
