package database.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Personas")
public abstract class Student extends User{
    

    public Student(int id, String name, String lastName) {
        super(id, name, lastName);
    }

    public static void main(String[] args) {
        
    }


}
