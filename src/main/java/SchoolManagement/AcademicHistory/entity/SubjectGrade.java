package SchoolManagement.AcademicHistory.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Entity
@Table(name = "CalificacionMateria")
public class SubjectGrade {

    @EmbeddedId
    @Column(name = "idCalificaion")
    private SubjectGradePK id;

    @Column(name = "primeraCal", nullable = false)
    private float firstEvaluation;

    @Column(name = "segundaCal", nullable = false)
    private float secondEvaluation;

    @Column(name = "terceraCal", nullable = false)
    private float thirdEvaluation;

    @Column(name = "calificacion", nullable = false)
    private float grade;

    @ManyToOne
    @JoinColumn(name = "idAlumno", insertable = false, updatable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "idMateria", insertable = false, updatable = false)
    private Subject subject;

}
