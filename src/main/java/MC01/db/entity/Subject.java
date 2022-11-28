package MC01.db.entity;


// import java.util.List;

import javax.persistence.*;

import lombok.*;
// import MC01.model.AcademicArea;
// import MC01.model.SubjectStatus;


@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Materia")
public class Subject {

    @Id
    @Column(name = "idMateria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "nombre", nullable = false, length = 63)
    private String name;

    @Column(name = "creditos", nullable = false)
    private int credits;

    // @Enumerated(EnumType.STRING)
    @Column(name = "idDeAreaAcademica", nullable = false)
    private int area;
    // System.out.println(AcademicArea.fromString("MATH").ordinal());


    @Override
    public String toString() {
        return this.getName() + " " + this.getCredits() + "\n";
    }

}
