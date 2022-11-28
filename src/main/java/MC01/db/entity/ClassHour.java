package MC01.db.entity;

import java.sql.Time;
import java.util.List;

import javax.persistence.*;  // @Table, @Entity, @Id, @GeneratedValue

import lombok.*;


/**
 * ClassHour entity is an attribute of a {@code Group} object.
 * This class contains the information of a class hour, such as the {@code Teacher} and {@code Students} list.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ClassHour")
public class ClassHour {

    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // ? FOREIGN KEYS
    @Column (name = "claveGrupo", nullable = false, length = 15)
    private Group group;

    @Column(name = "claveMateria", nullable = false)
    private Subject subject;

    @Column(name = "idDeMaestro", nullable = false)
    private Teacher teacher;

    // ? Attributes
    @Column(name = "horaInicio", nullable = false)
    private Time startTime;
    
    @Column(name = "horaFin", nullable = false)
    private Time finishTime;

    @Column(name = "cupo", nullable = false)
    private int free_space;  // Default value: 32


    // ! TODO: CHECK THIS
    // ? Relations <ClassHour - StudentS>
    @OneToMany(mappedBy = "classHour")
    private List<Student> students;


    // ? Relations <ClassHourS - Subject>
    @ManyToOne
    @JoinColumn(name = "idMateria", insertable = false, updatable = false)
    private Subject subject_relation;


    // ? Relations <ClassHourS - Group>
    @ManyToOne
    @JoinColumn(name = "nombreGrupo", insertable = false, updatable = false)
    private Group group_relation;


    // ? Relations <ClassHourS - Teacher>
    @ManyToOne
    @JoinColumn(name = "idProfesor", insertable = false, updatable = false)    
    private Teacher teacher_relation;

    @Override
    public String toString() {
        return this.getSubject() + "    "
             + this.getStartTime() + " : "
             + this.getFinishTime() + "\nTeacher: "
             + this.getTeacher() + "\nStudents:\n"
             // TODO: List student's names not their objects
             // ! THIS MUST BE DONE USING LAMBDA EXPRESSIONS
             + this.getStudents();
    }

}
