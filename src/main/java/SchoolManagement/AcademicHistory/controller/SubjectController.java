package SchoolManagement.AcademicHistory.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import SchoolManagement.AcademicHistory.entity.Subject;
import SchoolManagement.AcademicHistory.service.SubjectService;


/**
 * {@link Subject} controller
 */
@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;


    /**
     * Get all subjects
     * @return List of subjects
     */
    @GetMapping("/all")
    @ResponseBody
    public List<Subject> getAllSubjects() {
        return subjectService.getAll();
    }


    /**
     * Get subject by id
     * @param subjectId
     * @return Subject
     */
    @GetMapping("/{subjectId}")
    public Subject getById(@PathVariable("subjectId") Long subjectId) {
        return subjectService.getById(subjectId);
    }


    /**
     * Get subject by name
     * @param name
     * @return List of subjects
     */ 
    @GetMapping("/name/{name}")
    public List<Subject> getByName(@PathVariable("name") String name) {
        return subjectService.getByName(name);
    }


    /**
     * Get subject by credits
     * @param credits
     * @return List of subjects
     */
    @GetMapping("/credits/{credits}")
    public List<Subject> getByCredits(@PathVariable("credits") int credits) {
        return subjectService.getByCredits(credits);
    }


    /**
     * Get subject by teacher
     * @param teacher
     * @return List of subjects
     */
    @PostMapping("/save")
    public Subject save(@Validated Subject subject) {
        return subjectService.save(subject);
    }
    
    
    /**
     * Delete subject by id
     * @param subjectId
     */
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long subjectId) {
        subjectService.deleteById(subjectId);
    }


}
