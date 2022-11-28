package MC01.db.entity;


import java.sql.Date;
import java.util.ArrayList;
import java.util.Map;

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
@Table(name = "PlanDeEstudios")
// This class is a list of all the subjects that a Student has taken
public class Syllabus {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "idDeCarrera", nullable = false, length = 15)
    private String syllabusId;

    @Column(name = "nombre", nullable = false, length = 15)
    private String name;

    @Column(name = "fechaDeAutorizacion", nullable = false)
    private Date approvalDate;

    //? This ArrayList contains the Subjects assigned to a reccomended Semester
    // Map<Subject, recommendedSemester> subjects;
    private ArrayList<Map<Subject, Integer>> subjects;


    public Syllabus(int studentId) {
        this.id = studentId;
        getSubjects(this.getId());
    }


    /***
     * This method is used to get the subjects that a student has taken
     * @param studentId
     */
    private ArrayList<Subject> getSubjects(int studentId) {        
        // TODO: Use the studentId to get the subjects from the database
        // Can use lambdas, nested_smthing, etc
        // this.subjects = new ArrayList<Subject>();
        // this.subjects.add(new Subject("MATH", 4, SubjectStatus.PENDING_TO_CATALOG));
        return null;
    }

}
