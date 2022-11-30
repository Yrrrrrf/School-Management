package MC01.domain.dtoRepository;

import java.util.List;
import java.util.Optional;

import MC01.domain.dto.StudentDTO;


/**
 * <h3>StudentDtoRepository</h3>
 * <p>
 * This interface is used to perform CRUD operations on the {@link StudentDTO} table.
 * <p>
 * This class is mustly the same as {@link StudentRepository} but it uses the {@link StudentDTO} class instead of the {@link Student} class.
 */
public interface StudentDtoRepository {

    List<StudentDTO> getAll();

    Optional<List<StudentDTO>> getByName(String name);

    Optional<StudentDTO> getStudent(int studentId);

    StudentDTO save(StudentDTO student);

    void delete(int id);


}
