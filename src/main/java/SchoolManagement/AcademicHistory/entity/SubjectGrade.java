package SchoolManagement.AcademicHistory.entity;


import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.*;


/**
 * Kardex entity contains the information of a {@link Student}'s academic record.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CalificacionMateria")
public class SubjectGrade {

    // @EmbeddedId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCalificaion", nullable = false)
    private BigInteger id;
    
    @Column(name = "idMateria", nullable = false)
    private BigInteger subjectId;

    @Column(name = "idAlumno", nullable = false)
    private BigInteger studentId;

    @Column(name = "primeraCal")
    private float firstEvaluation;

    @Column(name = "segundaCal")
    private float secondEvaluation;

    @Column(name = "terceraCal")
    private float thirdEvaluation;

    @Column(name = "calificacion")
    private float grade;


    // @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "idAlumno", insertable = false, updatable = false)
    private Student student;


    // @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "idMateria", insertable = false, updatable = false)
    private Subject subjectGrade;

}
