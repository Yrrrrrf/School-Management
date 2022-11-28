package MC01.db.entity;


import javax.persistence.*;

import MC01.model.SubjectStatus;
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
    @Column(name = "idKardex")
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
    
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private SubjectStatus status;


    // ! Still thinking about this...
    // ? Relarions <KardexS - Student>
    @ManyToOne
    @JoinColumn(name = "idAlumno", insertable = false, updatable = false)
    private Student student_relation;
    
    
    // ? Relarions <KardexS - Subject>
    @ManyToOne
    @JoinColumn(name = "idMateria", insertable = false, updatable = false)
    private Subject subject_relation;

}
