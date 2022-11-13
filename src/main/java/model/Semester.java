package model;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import database.entity.Group;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
public class Semester {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false, length = 7)
    private String name;  // 20XX-1, 20XX-2, etc

    @Column(name = "fechaDeInicio", nullable = false)
    private Date startDate;
    
    @Column(name = "fechaDeFin", nullable = false)
    private Date finishDate;

    private ArrayList<Group> groups;    

}
