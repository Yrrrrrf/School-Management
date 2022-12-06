package SchoolManagement.AcademicHistory.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;


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

    @EmbeddedId
    @Column(name = "idListaMaterias")
    private SubjectsListPK id;

    @Column(name = "semestreRecomendado", nullable = false)
    private int recommendedSemester;


    @ManyToOne
    @JoinColumn(name = "idPlanDeEstudio", insertable = false, updatable = false)
    private Syllabus syllabus;

    @ManyToOne
    @JoinColumn(name = "idMateria", insertable = false, updatable = false)
    private Subject subject;

}
  