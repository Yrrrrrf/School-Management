package SchoolManagement.AcademicHistory.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SchoolManagement.AcademicHistory.entity.Student;
import SchoolManagement.AcademicHistory.repository.StudentRepository;
import SchoolManagement.AcademicHistory.service_interface.StudentServiceInterface;


/**
 * This is the class that implements the business logic for the {@link Subject} class.
 */
@Service
public class StudentService implements StudentServiceInterface {


    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getAll(){
        return (List<Student>) studentRepository.findAll();
    }


    public Student getById(Long studentId){
        return studentRepository.findById(studentId).orElse(null);
    }


    public List<Student> getByName(String name){
        return studentRepository.findByName(name);
    }


    public List<Student> getByMail(String mail){
        return studentRepository.findByName(mail);
    }


    public Student save(Student student){
        return studentRepository.save(student);
    }


    public void deleteById(Long subjectId){
        studentRepository.deleteById(subjectId);
    }


    public void deleteAll(){
        studentRepository.deleteAll();
    }
}
