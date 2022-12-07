package SchoolManagement.AcademicHistory.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonManagedReference;



/**
 * This is the class product of the relation between {@link Syllabus} and {@link Subject}.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ListaMateria")
public class SubjectsList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idListaDeMaterias", nullable = false)
    private BigInteger id;

    @Column(name = "idPlanDeEstudio", nullable = false)
    private BigInteger syllabusId;

    @Column(name = "idMateria", nullable = false)
    private BigInteger subjectId;

    @Column(name = "semestreRecomendado", nullable = false)
    private int recommendedSemester;


    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "idPlanDeEstudio", insertable = false, updatable = false)
    private Syllabus syllabus;

    @ManyToOne
    @JoinColumn(name = "idMateria", insertable = false, updatable = false)
    private Subject subject;

}
  