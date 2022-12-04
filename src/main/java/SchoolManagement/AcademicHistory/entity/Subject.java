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
 * It is the entity that represents the subjects that are taught in the school.
 */
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Materia")
public class Subject {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMateria", nullable = false)
    private BigDecimal id;

    @Column(name = "nombre", nullable = false, length = 63)
    private String name;

    @Column(name = "creditos", nullable = false)
    private int credits;

    @Column(name = "areaAcademica", nullable = false, length = 63)
    private String academicArea;


    // ? Relation: A Subject can be in many Syllabus
    @OneToMany(mappedBy = "subject")
    private List<SubjectsList> subjectsList;



    @Override
    public String toString() {
        return String.format("Subject [id= %4s    name= &32s, credits= $4s]");
    }


}