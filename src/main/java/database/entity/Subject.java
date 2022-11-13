package database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
import model.SubjectStatus;


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

    // @Column(name = "idDeAreaAcademica", nullable = false)
    private SubjectStatus status = SubjectStatus.NULL;  // Not cursed yet



    @Override
    public String toString() {
        return this.getName() + "\n"
             + this.getCredits() + "\n"
             + this.getStatus();
    }

}
