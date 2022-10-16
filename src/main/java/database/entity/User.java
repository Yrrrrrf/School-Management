package database.entity;

import javax.persistence.*;  // @Table, @Entity, @Id, @GeneratedValue
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;



@Getter
@Setter
@Entity
@Table(name = "Personas")
@AllArgsConstructor
public class User {

    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Autoincrement
    private Integer id;

    @Column(name = "Nombre", nullable = false, length = 63)
    private String name;

    @Column(name = "Apellido_Paterno", nullable = false, length = 63)
    private String Apellido_Paterno;

    // Date birthDate;


}
