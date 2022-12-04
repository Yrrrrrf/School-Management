package SchoolManagement.AcademicHistory.entity;


// import java.util.List;

import SchoolManagement.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.*;


/**
 * One who is enrolled or attends classes, so, they have it's own {@link Kardex} that contains all the {@link Subject}'s they have taken.
 * The contains of the {@link Kardex} is assigned depending on the {@link Syllabus} of the Career that the student is in.
 */
@Getter
@Setter
@AllArgsConstructor
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
    private int syllabusId;



    // // ? Relations <Student - KardexS>
    // @OneToMany(mappedBy = "student_relation")
    // private List<Kardex> kardex;


    @Override
    public String toString() {
        return super.toString() + "\n";
            //  + this.kardex.toString();
    }

    // ListObject.forEach(System.out::println);
}
