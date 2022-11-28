package MC01.db.entity;

import javax.persistence.*;  // @Table, @Entity, @Id, @GeneratedValue

import lombok.*;


/**
 * This class is a relation between {@link Student} and {@link ClassHour}.
 */
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "ListaAlumnos")
public class StudentList {

    @EmbeddedId  // Composite Primary Key
    StudentListPK id;

    @ManyToOne
    @JoinColumn(name = "idAlumno", insertable = false, updatable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "idHoraClase", insertable = false, updatable = false)
    private ClassHour classHour;

}
