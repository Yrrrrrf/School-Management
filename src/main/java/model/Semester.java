package model;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.*;

import database.entity.Group;
import lombok.*;


/**
 * Semester entity contains the information of a semester. (All the groups data).
 * <p>
 * Contains many {@code Group} objects, each one with many {@code ClassHour} objects.
 * The name of the {@code Semester} is the year of the semester plus the half that's in course now (A or B).
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Semestre")
public class Semester {

    @Id
    @GeneratedValue(strategy = GenerationType   .IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false, length = 7)
    private String name;  // 20XX-1, 20XX-2, etc

    @Column(name = "fechaDeInicio", nullable = false)
    private Date startDate;
    
    @Column(name = "fechaDeFin", nullable = false)
    private Date finishDate;

    private ArrayList<Group> groups;    



}
