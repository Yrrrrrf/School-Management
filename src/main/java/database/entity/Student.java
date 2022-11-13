package database.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import model.UserStatus;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Personas")
public class Student extends User {


    private Kardex kardex;


    public Student() {
        super();
        this.setStatus(UserStatus.STUDENT); // Set as a Student
        this.kardex = new Kardex(0);  // Build a new syllabus (void)
    }


    @Override
    public String toString() {
        return super.toString() + "\n"
             + this.kardex.getName() + "\n"
             // TODO: Be able to display the subjects schedule & the average grade
             + this.kardex.toString();
    }

}
