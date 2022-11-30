package MC01.domain.dto;

import org.mapstruct.Mapper;

import lombok.*;


@Getter
@Setter
/**
 * <h3>StudentDTO</h3>
 * <p>
 * This class models the data of a {@link Student} to transfer it between the database and the web interface.
 */
@Mapper(componentModel = "spring")
public class StudentDTO {
    
    private int studentId;
    
    private int syllabusId;
    
    private String name;
    
    private String fatherLastName;

    private String motherLastName;

    private String mail;



}
