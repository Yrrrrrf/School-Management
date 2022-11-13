package database.entity;

import java.sql.Time;
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
@Table(name = "ClassHour")
public class ClassHour {

    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "horaInicio", nullable = false)
    private Time startTime;
    
    @Column(name = "horaFin", nullable = false)
    private Time finishTime;
    
    @Column(name = "claveMateria", nullable = false)
    private Subject subject;

    @Column(name = "idDeMaestro", nullable = false)
    private Teacher teacher;

    // A class hour that allow only 30 students to be enrolled
    private ArrayList<Student> students = new ArrayList<Student>(30);



    @Override
    public String toString() {
        return this.getSubject() + "    "
             + this.getStartTime() + " : "
             + this.getFinishTime() + "\nTeacher: "
             + this.getTeacher() + "\nStudents:\n"
             // TODO: List student's names not their objects
             // ! THIS MUST BE DONE USING LAMBDA EXPRESSIONS
             + this.getStudents();
    }

}
