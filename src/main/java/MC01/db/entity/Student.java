package MC01.db.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import MC01.model.User;
import MC01.model.UserStatus;

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


    // ? Relations <Student - KardexS>
    @OneToMany(mappedBy = "student_relation")
    private List<Kardex> kardex;


    // ! TODO: Look this
    // ? Relations <Student - SubjectS>
    @OneToMany(mappedBy = "student")
    private List<StudentList> classHours;


    public Student() {
        super();
        this.setStatus(UserStatus.STUDENT); // Set as a Student
        // this.kardex = new Kardex(0);  // Build a new syllabus (void)
    }


    @Override
    public String toString() {
        return super.toString() + "\n";
            //  + this.kardex.getName() + "\n"
             // TODO: Be able to display the subjects schedule & the average grade
            //  + this.kardex.toString();
    }


    // ListObject.forEach(System.out::println);
    // 


}
