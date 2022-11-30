package MC01.db.mapper;

import org.mapstruct.InheritInverseConfiguration;

import java.util.List;

import org.mapstruct.*;

import MC01.db.entity.Student;
import MC01.domain.dto.StudentDTO;


@Mapper(componentModel = "spring")
public interface StudentMapper {


    /**
     * This class is used to map the data of a StudentDTO to a Student and viceversa.
     * @param student
     * @return {StudentDTO}
     */
    @Mappings({
        @Mapping(source = "id", target = "studentId"),
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "fatherLastName", target = "fatherLastName"),
        @Mapping(source = "motherLastName", target = "motherLastName"),
        @Mapping(source = "mail", target = "mail"),
        @Mapping(source = "syllabusId", target = "syllabusId")
    })
    StudentDTO toStudentDTO(Student student);
    List<StudentDTO> toStudentDTOs(List<Student> student);


    /**
     * This class is used to map the data of a Student to a StudentDTO and viceversa.
     * @param studentDTO
     * @return {Student}
     */
    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "birthday", ignore = true),
        @Mapping(target = "password", ignore = true),
        @Mapping(target = "kardex", ignore = true)
    })
    Student toStudent(StudentDTO studentDTO);
    // List<Student> toStudents(StudentDTO studentDTO);


}
