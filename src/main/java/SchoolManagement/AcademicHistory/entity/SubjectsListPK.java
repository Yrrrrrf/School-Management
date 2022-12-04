package SchoolManagement.AcademicHistory.entity;


import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


/**
 * This is the class product of the relation between {@link Syllabus} and {@link Subject}.
 * <p>
 * Is used only as the Primary Key of the {@link SubjectsList} class.
 */
@Embeddable
// Specifies a class whose instances are stored as intrinsic part of an owning entity.
public class SubjectsListPK implements Serializable {

    @Column(name = "idPlanDeEstudio", nullable = false)
    private BigDecimal syllabusId;

    @Column(name = "idMateria", nullable = false)
    private BigDecimal subjectId;

}
