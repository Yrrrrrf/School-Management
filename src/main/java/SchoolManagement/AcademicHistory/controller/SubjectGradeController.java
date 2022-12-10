package SchoolManagement.AcademicHistory.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import SchoolManagement.AcademicHistory.entity.SubjectGrade;
import SchoolManagement.AcademicHistory.service.SubjectGradeService;


/**
 * {@link SubjectGrade} controller
 */
@RestController
@RequestMapping("/subject_grade")
public class SubjectGradeController {

    @Autowired
    private SubjectGradeService subjectGradeService;


    /**
     * Return all grades from any subject
     * @return
     */
    @GetMapping("/all")
    @ResponseBody
    public List<SubjectGrade> getAllSubjectsGrade() {
        return subjectGradeService.getAll();
    }


    /**
     * Return subject and grade by id
     * @param subjectId
     * @return
     */
    @GetMapping("subject/{id}")
    public List<SubjectGrade> getBySubjectId(@PathVariable("id") Long subjectId) {
        return subjectGradeService.getBySubjectId(subjectId);
    }


    /**
     * Return subject and grade by student id
     * @param studentId
     * @return
     */
    @GetMapping("/student/{studentId}")
    public List<SubjectGrade> getByStudentId(@PathVariable("studentId") Long studentId) {
        List<SubjectGrade> list = subjectGradeService.getByStudentId(studentId);
        list.forEach(System.out::println);
        System.out.println(list.size());
        return list;
    }


    /**
     * Save subject and grade
     * @param subject
     * @return
     */
    @PostMapping("/save")
    public SubjectGrade save(@Validated SubjectGrade subject) {
        return subjectGradeService.save(subject);
    }
    

}
