package MC01.db.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import lombok.*;


/**
 * Semester entity contains the information of a semester. (All the groups data).
 * <p>
 * Contains many {@code Group} objects, each one with many {@code ClassHour} objects.
 * The name of the {@code Semester} is the year of the semester plus the half that's in course now (A or B).
 */
@Getter
@Setter
@AllArgsConstructor
@Table(name = "Semestre")
public class Semester {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false, length = 7)
    private String name;  // 20XX-1, 20XX-2, etc

    // ? Using name as the Primary Key
    // @Id
    // @Column(name = "nombre", nullable = false, length = 7)
    // private String name;  // 202X-JJ, 202X-JD, etc

    @Column(name = "fechaDeInicio", nullable = false)
    private Date startDate;
    
    @Column(name = "fechaDeFin", nullable = false)
    private Date finishDate;

    // ? Relations <Semester - Group>
    @OneToMany(mappedBy = "semester")
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private List<Group> groups;



}
