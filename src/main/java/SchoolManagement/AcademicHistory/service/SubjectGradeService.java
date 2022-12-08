package SchoolManagement.AcademicHistory.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SchoolManagement.AcademicHistory.entity.Subject;
import SchoolManagement.AcademicHistory.entity.SubjectGrade;
import SchoolManagement.AcademicHistory.repository.SubjectGradeRepository;
import SchoolManagement.AcademicHistory.service_interface.SubjectGradeServiceInterface;


/**
 * This is the class that implements the business logic for the {@link Subject} class.
 */
@Service
public class SubjectGradeService implements SubjectGradeServiceInterface {

    @Autowired
    private SubjectGradeRepository subjectRepository;


    public List<SubjectGrade> getAll(){
        return (List<SubjectGrade>) subjectRepository.findAll();
    }


    public List<SubjectGrade> getByStudentId(Long studentId){
        return subjectRepository.findByStudentId(studentId);
    }


    public List<SubjectGrade> getBySubjectId(Long subjectId){
        return subjectRepository.findBySubjectId(subjectId);
    }


    public SubjectGrade getBySubjectIdAndStudentId(Long subjectId, Long studentId) {
        return subjectRepository.findBySubjectIdAndStudentId(subjectId, studentId);
    }

    public SubjectGrade save(SubjectGrade subject){
        return subjectRepository.save(subject);
    }


    public void deleteById(Long subjectId){
        subjectRepository.deleteById(subjectId);
    }



}
