package MC01.db.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
// Specifies a class whose instances are stored as intrinsic part of an owning entity.
public class SubjectsListPK implements Serializable {

    @Column(name = "idPlanDeEstudio", nullable = false)
    private int syllabusId;

    @Column(name = "idMateria", nullable = false)
    private int subjectId;

}
