package MC01.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The Primary Key class for the {@link StudentList} database table.
 */
@Embeddable
public class StudentListPK implements Serializable {
    

    @Column(name = "idDeAlumno", nullable = false)
    private int studentId;

    @Column(name = "idDeClase", nullable = false, length = 7)
    private String classHourId;

}
