package SchoolManagement.AcademicHistory.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SchoolManagement.AcademicHistory.entity.SubjectsList;


/**
 * Interface for generic CRUD operations on a repository for {@link SubjectList} class.
 */
@Repository
public interface SubjectsListRepository extends CrudRepository<SubjectsList, Long> {

    public List<SubjectsList> findBySyllabusId(Long syllabusId);

    public List<SubjectsList> findBySubjectId(Long subjectId);

    public List<SubjectsList> findByRecommendedSemester(Long recommendedSemester);

    public SubjectsList findBySyllabusIdAndSubjectId(Long syllabusId, Long subjectId);

    @Query("from SubjectsList")
    List<SubjectsList> select();

    public List<SubjectsList> findBySyllabusIdAndRecommendedSemester(Long syllabusId, Long recommendedSemester);

}
