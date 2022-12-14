package SchoolManagement.AcademicHistory.entity;


import java.math.BigInteger;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import SchoolManagement.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.*;


/**
 * One who is enrolled or attends classes, so, they have it's own {@link SubjectGrade} that contains all the {@link Subject}'s they have taken.
 * The contains of the {@link SubjectGrade} is assigned depending on the {@link Syllabus} of the Career that the student is in.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "idAlumno")
@Table(name = "Alumno")
public class Student extends User {

    // The id of the student is being inherited from the User class

    @Column(name = "correo", nullable = false, length = 63)
    private String mail;

    @Column(name = "contraseña", nullable = false, length = 63)
    private String password;

    @Column(name = "idPlanDeEstudio", nullable = false)
    private BigInteger syllabusId;


    // ? Relation: Many Students can have a same Syllabys
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "idPlanDeEstudio", insertable = false, updatable = false)
    private Syllabus studentSyllabus;

    // ? Relation: A Student can have many SubjectGrade's
    @JsonBackReference
    @OneToMany(mappedBy = "student")
    private List<SubjectGrade> kardex;


    @Override
    public String toString() {
        return super.toString() + "\n";
    }

    // ListObject.forEach(System.out::println);
}
