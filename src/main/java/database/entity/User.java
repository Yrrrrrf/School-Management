package database.entity;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.*;  // @Table, @Entity, @Id, @GeneratedValue
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
import model.UserStatus;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Personas")
// Being an abstract class, it can't be instantiated
public abstract class User {

    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Autoincrement
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 63)
    private String name;

    @Column(name = "apellidoPaterno", nullable = false, length = 63)
    private String fatherLastName;

    @Column(name = "apellidoMaterno", nullable = false, length = 63)
    private String motherLastName;

    @Column(name = "fechaDeNacimiento", nullable = false)    
    private Date birthday;
    
    @Column(name = "fechaDeFin", nullable = false)
    private Date finishDate;

    private UserStatus status = UserStatus.NULL;  // Not cursed yet



    // public User() {  // Default constructor
    //     this.id = 0;
    //     this.name = "";
    //     this.fatherLastName = "";
    //     this.motherLastName = "";
    //     this.birthDate = new Date(Calendar.getInstance().getTime().getTime());
    //     this.finishDate = null;
    // }

    

    @Override
    public String toString() {
        return "id: " + this.getId()
             + "\nname: " + this.getName() + " " + this.getFatherLastName() + " " + this.getMotherLastName() + "\n"
             + "birthday: " + this.getBirthday();
            //  + "age: " + (Calendar.getInstance().get(Calendar.YEAR) - this.birthday.getYe);
    }


    public String getSurname() {
        return this.getFatherLastName() + " " + this.getMotherLastName();
    }

}
