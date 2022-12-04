package SchoolManagement.AcademicHistory.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SchoolManagement.AcademicHistory.entity.Syllabus;
import SchoolManagement.AcademicHistory.repository.SyllabusRepository;
import SchoolManagement.AcademicHistory.service_interface.SyllabusServiceInterface;


/**
 * This is the class that implements the business logic for the {@link Syllabus} class.
 */
@Service
public class SyllabusService implements SyllabusServiceInterface {


    @Autowired
    private SyllabusRepository syllabusRepository;


    public List<Syllabus> getAll(){
        return (List<Syllabus>) syllabusRepository.findAll();
    }


    public Syllabus getById(Long studentId){
        return syllabusRepository.findById(studentId).orElse(null);
    }


    public Syllabus getByName(String name){
        return syllabusRepository.findByName(name);
    }


    public Syllabus save(Syllabus syllabus){
        return syllabusRepository.save(syllabus);
    }


    public void deleteById(Long subjectId){
        syllabusRepository.deleteById(subjectId);
    }


}
