package SchoolManagement.AcademicHistory.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SchoolManagement.AcademicHistory.entity.Syllabus;
import SchoolManagement.AcademicHistory.service.SyllabusService;


@RestController
@RequestMapping("/syllabus")
public class SyllabusController {

    @Autowired
    private SyllabusService syllabusService;


    @GetMapping("/all")
    public List<Syllabus> getAllSyllabus() {
        return syllabusService.getAll();
    }


    @GetMapping("/{syllabusId}")
    public Syllabus getById(@PathVariable("syllabusId") Long studentId) {
        return syllabusService.getById(studentId);
    }


    @GetMapping("/name/{name}")
    public Syllabus getByName(@PathVariable("name") String name) {
        return syllabusService.getByName(name);
    }


    @PostMapping("/save")
    public Syllabus save(@Validated Syllabus syllabus) {
        return syllabusService.save(syllabus);
    }


    @DeleteMapping("/delete/{syllabusId}")
    public ResponseEntity deleteById(@PathVariable("syllabusId") Long syllabusId) {
        syllabusService.deleteById(syllabusId);
        return ResponseEntity.ok(syllabusId + " deleted");
    }


    @GetMapping("/data")
    public String syllabusMenu() {
        return "You're now in the SyllabusController";
    }

}
