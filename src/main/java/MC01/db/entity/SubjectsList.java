package MC01.db.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;




@Entity
@Table(name = "ListaMateria")
public class SubjectsList {
    
    @EmbeddedId
    @Column(name = "idListaMaterias")
    private SubjectsListPK idSL;

    @Column(name = "semestreRecomendado", nullable = false)
    private int recommendedSemester;


}
