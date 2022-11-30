package MC01.db.entity;

import javax.persistence.*;


/**
 * This is the class product of the relation between {@link Syllabus} and {@link Subject}.
 */
@Entity
@Table(name = "ListaMateria")
public class SubjectsList {

    @EmbeddedId
    @Column(name = "idListaMaterias")
    private SubjectsListPK idSL;

    @Column(name = "semestreRecomendado", nullable = false)
    private int recommendedSemester;


}
