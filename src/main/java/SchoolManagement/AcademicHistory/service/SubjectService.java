package SchoolManagement.AcademicHistory.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SchoolManagement.AcademicHistory.entity.Subject;
import SchoolManagement.AcademicHistory.repository.SubjectRepository;
import SchoolManagement.AcademicHistory.service_interface.SubjectServiceInterface;


/**
 * This is the class that implements the business logic for the {@link Subject} class.
 */
@Service
public class SubjectService implements SubjectServiceInterface {

    @Autowired
    private SubjectRepository subjectRepository;


    public List<Subject> getAll(){
        return (List<Subject>) subjectRepository.findAll();
    }


    public Subject getById(Long subjectId){
        return subjectRepository.findById(subjectId).orElse(null);
    }


    public List<Subject> getByName(String name){
        return subjectRepository.findByName(name);
    }


    public List<Subject> getByCredits(int credits){
        return subjectRepository.findByCreditsOrderByNameAsc(credits);
    }


    public Subject save(Subject subject){
        return subjectRepository.save(subject);
    }


    public void deleteById(Long subjectId){
        // return getById(subjectId).map(subject -> {
        //     subjectRepository.delete(subject);
        //     return true;
        // }).orElse(false);
        subjectRepository.deleteById(subjectId);
    }


}
