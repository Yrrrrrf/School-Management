package MC01.model;

import java.sql.Date;
// import java.util.Calendar;

import javax.persistence.*;  // @Table, @Entity, @Id, @GeneratedValue

import lombok.*;

/**
 * Is the base class for all the users of the system. It can't be instantiated because it's an abstract class.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// User has not the @Entity annotation because it's an abstract class
@Table(name = "Personas")
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

    @ElementCollection(targetClass = UserStatus.class  , fetch = FetchType.LAZY)
    @CollectionTable(name = "Alumnos" , joinColumns = @JoinColumn(name = "status"))
    @Enumerated(EnumType.STRING)
    private UserStatus status;


    // public User() {  // Default constructor
    //     this.id = 0;
    //     this.name = "";
    //     this.fatherLastName = "";
    //     this.motherLastName = "";
    //     this.birthDate = new Date(Calendar.getInstance().getTime().getTime());
    //     this.finishDate = null;
    // }

    @Override
    public String toString()
    {
        return "id: " + this.getId()
             + "\nname: " + this.getName() + " " + this.getFatherLastName() + " " + this.getMotherLastName() + "\n"
             + "birthday: " + this.getBirthday();
            //  + "age: " + (Calendar.getInstance().get(Calendar.YEAR) - this.birthday.getYe);
    }


    public String getSurname() {
        return this.getFatherLastName() + " " + this.getMotherLastName();
    }


}
