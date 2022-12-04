package SchoolManagement.AcademicHistory.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SchoolManagement.AcademicHistory.entity.Subject;
import SchoolManagement.AcademicHistory.service.SubjectService;


@RestController
@RequestMapping("/api/subject")
public class SubjectController {
    
    @Autowired
    private SubjectService subjectService;


    @GetMapping("/all")
    public List<Subject> getAllSubjects() {
        return subjectService.getAll();
    }


    @GetMapping("{studentId}")
    public Subject getSubjectsByStudentId(@PathVariable("studentId") Long studentId) {
        return subjectService.getById(studentId);
    }


    @GetMapping("/data") 
    public String subjectMenu() {
        return "You're now in the SubjectController";
    }


}
