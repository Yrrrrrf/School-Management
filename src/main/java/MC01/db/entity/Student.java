package MC01.db.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import MC01.model.User;
// import db.entity.StudentList;
import lombok.*;


/**
 * Student is a student .____.
 * <p>
 * A student can <b>take</b> {@code Subject} in some {@code Group} at a certain {@code ClassHour}.
 * <p>
 * Every Student have it's own {@code Kardex} that contains all the {@code Subject} that the student has taken or will take.
 * The contains of the {@code Kardex} is assigned depending on the {@code Syllabus} of the Career that the student is in.
 */
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Alumno")
public class Student extends User {

    // The id of the student is being inherited from the User class

    @Column(name = "correo", nullable = false, length = 63)
    private String mail;

    @Column(name = "idPlanDeEstudio", nullable = false)
    private int syllabusId;

    @Column(name = "contraseña", nullable = false, length = 63)
    private String password;


    // ? Relations <Student - KardexS>
    @OneToMany(mappedBy = "student_relation")
    private List<Kardex> kardex;


    @Override
    public String toString() {
        return super.toString() + "\n";
            //  + this.kardex.toString();
    }

    // ListObject.forEach(System.out::println);
}
