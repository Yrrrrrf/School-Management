package database.entity;

import java.util.ArrayList;

import javax.persistence.*;  // @Table, @Entity, @Id, @GeneratedValue
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Personas")

public class Group {

    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false, length = 15)
    private String name;  // (ex: IC_101, IC_102, etc)

    // A group can have at most 12 class hours per week
    private ArrayList<ClassHour> classHours = new ArrayList<ClassHour>(12);

}
