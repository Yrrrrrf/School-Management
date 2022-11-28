package MC01.db.entity;


import java.util.ArrayList;
import java.util.Map;

import javax.persistence.*;

import lombok.*;


/**
 * Kardex entity contains the information of a {@code Student}'s academic record.
 */
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Kardex")
public class Kardex {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "idAlumno", nullable = false, length = 63)
    private int studentId;

    @Column(name = "idMateria", nullable = false, length = 63)
    private int subjectId;

    @Column(name = "primeraE", nullable = false)
    private float firstEvaluation;

    @Column(name = "segundaE", nullable = false)
    private float secondEvaluation;

    @Column(name = "terceraE", nullable = false)
    private float thirdEvaluation;

    @Column(name = "calificacion", nullable = false)
    private float grade;
    
    @Column(name = "estado", nullable = false)
    private String status;


    // ! Still thinking about this...
    // ? Relarions <KardexS - Student>
    @ManyToOne
    @JoinColumn(name = "idAlumno", insertable = false, updatable = false)
    private Student student_relation;
    
    
    // ? Relarions <KardexS - Subject>
    @ManyToOne
    @JoinColumn(name = "idMateria", insertable = false, updatable = false)
    private Subject subject_relation;
    



    // TODO: CHECK THIS OUT LATER (I'm not sure if this is the right way to do it)    
    //? This ArrayList contains the Subjects assigned to the obtained grade
    // Map<Subject, grade> subjects;
    private ArrayList<Map<Subject, Integer>> subjects;


    public Kardex(int studentId) {
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
