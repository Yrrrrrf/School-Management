package SchoolManagement.AcademicHistory.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SchoolManagement.AcademicHistory.entity.Student;
import SchoolManagement.AcademicHistory.service.StudentService;


/**
 * {@link Student} controller
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * Get all students
     * @return List of students
     */
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAll();
    }


    /**
     * Get student by id
     * @param studentId
     * @return Student
     */
    @GetMapping("/{studentId}")
    public Student getById(@PathVariable("studentId") Long studentId) {
        return studentService.getById(studentId);
    }


    /**
     * Get student by name
     * @param name
     * @return List of students
     */
    @GetMapping("/name/{name}")
    public List<Student> getByName(@PathVariable("name") String name) {
        return studentService.getByName(name);
    }


    /**
     * Get student by mail
     * @param mail
     * @return List of students
     */
    @GetMapping("/mail/{mail}")
    public List<Student> getByMail(@PathVariable("mail") String mail) {
        return studentService.getByMail(mail);
    }


    /**
     * Get student by phone
     * @param phone
     * @return List of students
     */
    @PostMapping("/save")
    public Student save(@Validated Student student) {
        return studentService.save(student);
    }


    /**
     * Delete student by id
     * @param studentId
     */
    @DeleteMapping("/delete/{studentId}")
    public void deleteById(@PathVariable("studentId") Long studentId) {
        studentService.deleteById(studentId);
    }
    

}
