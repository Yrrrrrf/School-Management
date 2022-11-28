package MC01.db.entity;

import java.util.List;

// import java.util.ArrayList;
import javax.persistence.*;  // @Table, @Entity, @Id, @GeneratedValue
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

/**
 * Group entity contains the information of a class group.
 * <p>
 * Contains many {@code ClassHour} objects.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Grupo")
public class Group {

    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private int id;

    @Id  // Primary key
    @Column(name = "nombreGrupo", nullable = false, length = 15)
    private String name;  // (ex: IC_101, IC_102, etc)

    // A group can have at most 12 class hours per week
    // private ArrayList<ClassHour> classHours = new ArrayList<ClassHour>(12);


    // ? Relations <Group - Semester>
    @ManyToOne
    @JoinColumn(name = "nombreSemestre", insertable = false, updatable = false)
    private Semester semester;


    // ? Relations <Group - ClassHourS>
    @OneToMany(mappedBy = "group_relation")
    private List<ClassHour> classHour;


    // public boolean addClassHour(ClassHour classHour) {
    //     if (this.classHours.size() < 12) {
    //         this.classHours.add(classHour);
    //         return true;
    //     }
    //     else {
    //         System.out.println("The group already has 12 class hours per week!");
    //         return false;
    //     }
    // }


    // public boolean removeClassHour(ClassHour classHour) {
    //     if (this.classHours.size() > 0) {
    //         this.classHours.remove(classHour);
    //         return true;
    //     }
    //     else {
    //         System.out.println("No class hours to remove!");
    //         return false;
    //     }
    // }

}
