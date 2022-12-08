package SchoolManagement.AcademicHistory.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SchoolManagement.AcademicHistory.entity.SubjectsList;
import SchoolManagement.AcademicHistory.repository.SubjectsListRepository;
import SchoolManagement.AcademicHistory.service_interface.SubjectsListServiceInterface;


/**
 * This is the class that implements the business logic for the {@link Subject} class.
 */
@Service
public class SubjectsListService implements SubjectsListServiceInterface {

    @Autowired
    private SubjectsListRepository subjectsListRepository;


    public List<SubjectsList> getAll(){
        return (List<SubjectsList>) subjectsListRepository.findAll();
    }


    public List<SubjectsList> getBySyllabusId(Long syllabusId) {
        return subjectsListRepository.findBySyllabusId(syllabusId);
    }
    
    
    public List<SubjectsList> getBySubjectId(Long subjectId) {
        return subjectsListRepository.findBySubjectId(subjectId);
    }


    public List<SubjectsList> getByRecommendedSemester(Long recommendedSemester) {
        return subjectsListRepository.findByRecommendedSemester(recommendedSemester);
    }


    // public SubjectsList getBySyllabusIdAndSubjectId(Long syllabusId, Long subjectId) {
    //     return subjectsListRepository.findBySyllabusIdAndSubjectId(syllabusId, subjectId);
    // }


    public List<SubjectsList> getBySyllabusIdAndRecommendedSemester(Long syllabusId, Long recommendedSemester) {
        return subjectsListRepository.findBySyllabusIdAndRecommendedSemester(syllabusId, recommendedSemester);
    }

    public SubjectsList save(SubjectsList subject){
        return subjectsListRepository.save(subject);
    }


}
