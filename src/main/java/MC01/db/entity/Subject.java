package MC01.db.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;
import MC01.model.AcademicArea;
import MC01.model.SubjectStatus;


@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Materia")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "nombre", nullable = false, length = 63)
    private String name;

    @Column(name = "creditos", nullable = false)
    private int credits;

    @Column(name = "idDeAreaAcademica", nullable = false)
    // TODO:  Check if it's possible to assign a value from the enum AcademicArea
    private AcademicArea area; // INTEGER

    // @Column(name = "idDeAreaAcademica", nullable = false)
    private SubjectStatus status = SubjectStatus.NULL;  // Not cursed yet


    // ? Relations <Subject - ClassHour>
    @OneToMany(mappedBy = "subject_relation")
    private List<ClassHour> classHours;


    @Override
    public String toString() {
        return this.getName() + "\n"
             + this.getCredits() + "\n"
             + this.getStatus();
    }

}
