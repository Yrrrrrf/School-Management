package SchoolManagement.model;


import java.math.BigDecimal;
import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.*;


/**
 * Is the base class for all the users of the system. It can't be instantiated because it's an abstract class.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// User has not the @Entity annotation because it's an abstract class
@Entity(name = "Persona")
@Inheritance(strategy = InheritanceType.JOINED)  // This tells Spring that this class is a base class for other entities
public abstract class User {

    @Id  // Primary key
    @Column(name = "idPersona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Autoincrement
    private BigDecimal id;

    @Column(name = "nombre", nullable = false, length = 63)
    private String name;

    @Column(name = "apellidoPaterno", nullable = false, length = 63)
    private String fatherLastName;

    @Column(name = "apellidoMaterno", nullable = false, length = 63)
    private String motherLastName;

    @Column(name = "fechaDeNacimiento", nullable = false)    
    private Date birthday;


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
