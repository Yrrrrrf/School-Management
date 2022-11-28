package MC01.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import MC01.db.crud.StudentCrudRepository;
import MC01.db.entity.Student;

@Repository  // Indicate that the Class is a Repository that interacts with the database
// @Component  // Indicate that the Class is a component for the Spring Framework
public class StudentRepository {

    @Autowired(required = true)
    private StudentCrudRepository studentCrudRepository;

    /** 
     * Get the list of all the students in the database.
    */
    public List<Student> getAll() {   
        // Cast this iterable as a <Student> list
        return (List<Student>) studentCrudRepository.findAll();
    }


    public Optional<Student> getStudent(int id) {
        return studentCrudRepository.findById(id);
    }


    public Student save(Student student) {
        return studentCrudRepository.save(student);
    }


    public void delete(int id) {
        studentCrudRepository.deleteById(id);
    }


    // Just for testing
    public static void main(String[] args) {
        new StudentRepository().getAll().forEach(System.out::println);
    }
}
