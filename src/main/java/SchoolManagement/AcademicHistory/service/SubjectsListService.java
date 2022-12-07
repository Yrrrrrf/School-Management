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
    private SubjectsListRepository subjectListRepository;


    public List<SubjectsList> getAll(){
        return (List<SubjectsList>) subjectListRepository.findAll();
    }


    public List<SubjectsList> getBySyllabusId(int syllabusId) {
        return subjectListRepository.findBySyllabusId(syllabusId);
    }
    
    
    public List<SubjectsList> getBySubjectId(int subjectId) {
        return subjectListRepository.findBySyllabusId(subjectId);
    }


    public List<SubjectsList> getByRecommendedSemester(int recommendedSemester) {
        return subjectListRepository.findByRecommendedSemester(recommendedSemester);
    }


    public SubjectsList save(SubjectsList subject){
        return subjectListRepository.save(subject);
    }    
    

    public boolean select() {
        List<SubjectsList> list = subjectListRepository.select();
        System.out.println(list);
        System.out.println(list.size());
        return true;
    }

}
