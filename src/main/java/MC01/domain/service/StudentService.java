package MC01.domain.service;

import java.util.List;
import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MC01.db.entity.Student;
import MC01.domain.repository.StudentRepository;


@Service
public class StudentService {
    

    // @Autowired
    private StudentRepository studentRepository;


    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    public Optional<Student> getStudent(int id) {
        return studentRepository.getStudent(id);
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }
    
    
    public boolean delete(int id) {
        // TODO: Check if this works properly
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
