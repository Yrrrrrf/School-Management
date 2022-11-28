package MC01.db.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import MC01.model.User;
import MC01.model.UserStatus;

import lombok.*;


/**
 * Teacher is a User type that can <b>teach</b> {@code Subject} in some {@code Group}.
 */ 
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Profesor")
public class Teacher extends User {

    @Column(name = "idDeTitulo", nullable = false, length = 31)
    private String title;
    // The attribute is a int in the database, but it's a String in the model (for now)
    // private Title title;


    // ? Relaiton <Teacher - ClassHourS>
    @OneToMany(mappedBy = "teacher_relation")
    private List<ClassHour> classHours;


    public Teacher() {
        super();
        this.setStatus(UserStatus.TEACHER);  // Set as a Teacher
        this.title = "";
    }


    @Override
    public String toString() {
        return super.toString() + "\n"
            + this.getTitle();
    }   

}
