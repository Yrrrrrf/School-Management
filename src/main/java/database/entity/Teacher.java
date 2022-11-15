package database.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import model.UserStatus;

import lombok.*;


/**
 * Teacher is a User type that can <b>teach</b> {@code Subject} in some {@code Group}.
 */ 
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Personas")
public class Teacher extends User {


    private String title;


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
