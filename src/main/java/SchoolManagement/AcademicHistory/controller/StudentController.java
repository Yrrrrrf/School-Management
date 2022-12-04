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


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/all")
    public List<Student> getAllSubjects() {
        return studentService.getAll();
    }


    @GetMapping("/{studentId}")
    public Student getById(@PathVariable("studentId") Long studentId) {
        return studentService.getById(studentId);
    }


    @GetMapping("/name/{name}")
    public List<Student> getByName(@PathVariable("name") String name) {
        return studentService.getByName(name);
    }


    @GetMapping("/mail/{mail}")
    public List<Student> getByMail(@PathVariable("mail") String mail) {
        return studentService.getByMail(mail);
    }


    @PostMapping("/save")
    public Student save(@Validated Student student) {
        return studentService.save(student);
    }


    // TODO: Fix this
    @DeleteMapping("/delete/{studentId}")
    public void deleteById(@PathVariable("studentId") Long studentId) {
        studentService.deleteById(studentId);
    }


    @GetMapping("/data")
    public String studentData() {
        return "You're now in the Student Controller";
    }


}
