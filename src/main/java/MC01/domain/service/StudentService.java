package MC01.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MC01.domain.dto.StudentDTO;
import MC01.domain.dtoRepository.StudentDtoRepository;


@Service
public class StudentService {
    

    @Autowired
    private StudentDtoRepository studentRepository;


    public List<StudentDTO> getAll() {
        return studentRepository.getAll();
    }


    public Optional<List<StudentDTO>> getByName(String name) {
        return studentRepository.getByName(name);
    }


    public Optional<StudentDTO> getStudent(int studentId) {
        return studentRepository.getStudent(studentId);
    }


    public StudentDTO save(StudentDTO student) {
        return studentRepository.save(student);
    }
    
    
    public boolean delete(int id) {
        // if (getStudent(id).isPresent()) {
        // if (getStudent(id) != null) {
        //     studentRepository.delete(id);
        //     return true;
        // } else return false;        
        return getStudent(id).map(student -> {
            studentRepository.delete(id);
            return true;
        }).orElse(false);
        // ? Same line but cooler (with lambda expressions)
    }

}
