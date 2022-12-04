package SchoolManagement.AcademicHistory.entity;


import java.math.BigDecimal;
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
import lombok.Setter;


/**
 * Syllabus entity contains the information of a Career's syllabus(curriculum).
 * <p>
 * Contains a Map that assign a {@code Subject} the reccomended {@code Semester} to take it.
 */
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "PlanDeEstidio")
public class Syllabus {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMateria", nullable = false)
    private BigDecimal id;

    @Column(name = "nombre", nullable = false, length = 63)
    private String name;

    @Column(name = "fechaDeAprobacion", nullable = false, length = 63)
    private String approvalDate;


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
