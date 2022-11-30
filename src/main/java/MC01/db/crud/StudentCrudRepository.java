package MC01.db.crud;


import java.util.List;
// import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import MC01.db.entity.Student;


/**
 * This interface is used to perform CRUD operations on the {@link Student} table.
 */
@Repository
public interface StudentCrudRepository extends CrudRepository<Student, Integer> {  // CrudRepository <Entity, PK>

    List<Student> findByName(String name);
    
    // @Query allow us to write our own queries with native SQL
    @Query(value = "SELECT * FROM Alumno WHERE name = ?", nativeQuery = true)
    List<Student> findByNameNativeSQL(String name);

    // @Query(value = "SELECT * FROM Alumno WHERE idPlanDeEstudio = syllabusId", nativeQuery = true)
    // ! Still need to be tested
    List<Student> findBySyllabusIdOrderByNameAsc(int syllabusId);


}
