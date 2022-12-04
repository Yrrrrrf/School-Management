package SchoolManagement.AcademicHistory.entity;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Syllabus entity contains the information of a Career's syllabus(curriculum).
 * <p>
 * Contains a Map that assign a {@code Subject} the reccomended {@code Semester} to take it.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PlanDeEstudio")
public class Syllabus {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMateria", nullable = false)
    private BigInteger id;

    @Column(name = "nombre", nullable = false, length = 63)
    private String name;
    
    @Column(name = "fechaDeAprobacion", nullable = false)//, length = 63)
    private Date approvalDate;


    // ? Relation: A Syllabus can have many Subjects
    @OneToMany(mappedBy = "syllabus")
    private List<SubjectsList> subjectsList;
    
    // ? Relation: A Syllabus can be taken by many Students
    @OneToMany(mappedBy = "studentSyllabus")
    private List<Student> studentsList;
    

    @Override
    public String toString() {
        return String.format("Syllabus [id= %4s    name= &32s, approvalDate= $4s]");
    }


}
