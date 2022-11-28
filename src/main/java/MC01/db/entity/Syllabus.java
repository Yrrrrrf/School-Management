package MC01.db.entity;


// import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.*;

import lombok.*;


/**
 * Syllabus entity contains the information of a Career's syllabus(curriculum).
 * <p>
 * Contains a Map that assign a {@code Subject} the reccomended {@code Semester} to take it.
 */
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "PlanDeEstudio")
// This class is a list of all the subjects that a Student has taken
public class Syllabus {


    @Id
    @Column(name = "idPlanDeEstudio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "idListaMaterias")
    private SubjectsList subjectsList;

    @Column(name = "nombre", nullable = false, length = 15)
    private String name;

    // ! Add this only if I'm able to do it before the deadline (01-12-2022)
    // @Column(name = "fechaDeAutorizacion", nullable = false)
    // private Date approvalDate;


    //? Relations <Syllabus - Subject>
    // TODO: CHECK THIS
    @OneToMany(mappedBy = "syllabus")
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private ArrayList<Subject> subjectsList_relation;

}
