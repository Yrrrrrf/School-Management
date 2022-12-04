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

import SchoolManagement.AcademicHistory.entity.Subject;
import SchoolManagement.AcademicHistory.service.SubjectService;


@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;


    @GetMapping("/all")
    public List<Subject> getAllSubjects() {
        return subjectService.getAll();
    }


    @GetMapping("/{subjectId}")
    public Subject getById(@PathVariable("subjectId") Long subjectId) {
        return subjectService.getById(subjectId);
    }


    @GetMapping("/name/{name}")
    public List<Subject> getByName(@PathVariable("name") String name) {
        return subjectService.getByName(name);
    }


    @GetMapping("/credits/{credits}")
    public List<Subject> getByCredits(@PathVariable("credits") int credits) {
        return subjectService.getByCredits(credits);
    }


    @PostMapping("/save")
    public Subject save(@Validated Subject subject) {
        return subjectService.save(subject);
    }
    
    
    // TODO: Fix this
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long subjectId) {
        subjectService.deleteById(subjectId);
    }


    @GetMapping("/data")
    public String subjectMenu() {
        return "You're now in the SubjectController";
    }


}
