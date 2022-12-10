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

import SchoolManagement.AcademicHistory.entity.Syllabus;
import SchoolManagement.AcademicHistory.service.SyllabusService;


/**
 * {@link Syllabus} controller
 */
@RestController
@RequestMapping("/syllabus")
public class SyllabusController {

    @Autowired
    private SyllabusService syllabusService;


    /**
     * Get all syllabus
     * @return List of syllabus
     */
    @GetMapping("/all")
    public List<Syllabus> getAllSyllabus() {
        return syllabusService.getAll();
    }


    /**
     * Get syllabus by id
     * @param studentId
     * @return Syllabus
     */
    @GetMapping("/{syllabusId}")
    public Syllabus getById(@PathVariable("syllabusId") Long studentId) {
        return syllabusService.getById(studentId);
    }


    /**
     * Get syllabus by name
     * @param name
     * @return Syllabus
     */
    @GetMapping("/name/{name}")
    public Syllabus getByName(@PathVariable("name") String name) {
        return syllabusService.getByName(name);
    }


    /**
     * Save syllabus
     * @param syllabus
     * @return Syllabus
     */
    @PostMapping("/save")
    public Syllabus save(@Validated Syllabus syllabus) {
        return syllabusService.save(syllabus);
    }


    /**
     * Delete syllabus by id
     * @param syllabusId
     */
    @DeleteMapping("/delete/{syllabusId}")
    public void deleteById(@PathVariable("syllabusId") Long syllabusId) {
    // public ResponseEntity deleteById(@PathVariable("syllabusId") Long syllabusId) {
        syllabusService.deleteById(syllabusId);
        // return ResponseEntity.ok(syllabusId + " deleted");
    }


}
