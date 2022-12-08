package SchoolManagement.AcademicHistory.entity;


import java.math.BigInteger;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
 * It is the entity that represents the subjects that are taught in the school.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Materia")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMateria", nullable = false)
    private BigInteger id;

    @Column(name = "nombre", nullable = false, length = 63)
    private String name;

    @Column(name = "creditos", nullable = false)
    private int credits;

    @Column(name = "areaAcademica", nullable = false, length = 63)
    private String academicArea;


    // ? Relation: A Subject can be in many Syllabus
    @JsonBackReference
    @OneToMany(mappedBy = "subject")
    private List<SubjectsList> subjectsList;

    // ? Relation: A Subject can be in many Kardex
    @JsonBackReference
    @OneToMany(mappedBy = "subjectGrade")
    private List<SubjectGrade> subjectsGrade;



    // @Override
    // public String toString() {
    //     return String.format("Subject [id= %4s    name= &32s, credits= $4s]");
    // }


}
