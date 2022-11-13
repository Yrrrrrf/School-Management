package database.entity;


import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "HistorialAcademico")
// This class is a list of all the subjects that a Student has taken
public class Kardex {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "idDeCarrera", nullable = false, length = 15)
    private String syllabusId;

    @Column(name = "nombre", nullable = false, length = 15)
    private String name;

    @Column(name = "fechaDeAutorizacion", nullable = false)
    private Date approvalDate;

    private ArrayList<Subject> subjects;


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
