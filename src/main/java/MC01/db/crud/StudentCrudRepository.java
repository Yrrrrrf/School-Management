

package MC01.db.crud;

import java.util.List;

// import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import MC01.db.entity.Student;

/**
 * This interface is used to perform CRUD operations on the {@link Student} table.
 */
public interface StudentCrudRepository extends CrudRepository<Student, Integer> {
    // extends CrudRepository <Entity, PrimaryKey>

    // @Query(value = "SELECT * FROM Alumno WHERE name = ?", nativeQuery = true)
    List<Student> findByName(String name);



    // ? CRUD Operations


}
