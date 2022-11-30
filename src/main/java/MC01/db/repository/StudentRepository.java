package MC01.db.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import MC01.db.crud.StudentCrudRepository;
import MC01.db.entity.Student;
import MC01.db.mapper.StudentMapper;
import MC01.domain.dto.StudentDTO;
import MC01.domain.dtoRepository.StudentDtoRepository;


@Repository  // Indicate that the Class is a Repository that interacts with the database
// @Component  // Indicate that the Class is a component for the Spring Framework
public class StudentRepository implements StudentDtoRepository {

    @Autowired(required = true)
    private StudentCrudRepository studentCrudRepository;

    @Autowired(required = true)
    private StudentMapper studentMapper;

    /** 
     * Get the list of all the students in the database.
    */
    public List<StudentDTO> getAll() {
        // Cast this iterable as a <Student> list. Yhis only works because the Student class implements the Iterable interface
        List<Student> studentsList = (List<Student>) studentCrudRepository.findAll();
        return studentMapper.toStudentDTOs(studentsList);    
    }


    /** 
     * Get the list of  the students with the given {@code name}.
     * @param name
    */
    public Optional<List<StudentDTO>> getByName(String name) {
        List<Student> studentsList = studentCrudRepository.findByName(name);
        return Optional.of(studentMapper.toStudentDTOs(studentsList));
    }


    /** 
     * Get the list of  the students with the given {@code syllabusId}. 
     * <p>
     * The list is ordered by the student's name in ascending order.
     * @param syllaBusId
    */
    public List<StudentDTO> getBySyllabusId(int syllabusId) {
        List<Student> studentsList =  studentCrudRepository.findBySyllabusIdOrderByNameAsc(syllabusId);
        return studentMapper.toStudentDTOs(studentsList);
    }


    /** 
     * Get the student with the given {@code id}. 
     * @param id
    */
    public Optional<StudentDTO> getStudent(int studentId) {
        return studentCrudRepository.findById(studentId).map(studentMapper::toStudentDTO);
    }


    /**
     * Save the given {@code student} in the database.
     * @param student
     * @return savedStudent
     */
    public StudentDTO save(StudentDTO studentDTO) {
        return studentMapper.toStudentDTO(studentCrudRepository.save(studentMapper.toStudent(studentDTO)));
    }


    /**
     * Delete the student with the given {@code id} from the database.
     * @param id
     */
    public void delete(int studentId) {
        studentCrudRepository.deleteById(studentId);
    }




    // Just for testing
    public static void main(String[] args) {
        new StudentRepository().getAll().forEach(System.out::println);
    }


}
