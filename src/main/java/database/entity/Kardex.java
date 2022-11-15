package database.entity;


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

    @Column(name = "idDeCarrera", nullable = false, length = 15)
    private String syllabusId;

    @Column(name = "nombre", nullable = false, length = 15)
    private String name;

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
