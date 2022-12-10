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

import SchoolManagement.AcademicHistory.entity.SubjectsList;
import SchoolManagement.AcademicHistory.service.SubjectsListService;


/**
 * {@link Subject} controller
 */
@RestController
@RequestMapping("/subjects_list")
public class SubjectsListController {

    @Autowired
    private SubjectsListService subjectsListService;


    /**
     * Get all subjects that are inside any syllabus
     * @return
     */
    @GetMapping("/all")
    @ResponseBody
    public List<SubjectsList> getAllSubjectsList() {
        return subjectsListService.getAll();
    }


    /**
     * Get subject by id
     * @param subjectId
     * @return Subject
     */
    @GetMapping("subject/{subjectId}")
    public List<SubjectsList> getBySubject(@PathVariable("subjectId") Long subjectId) {
        return subjectsListService.getBySubjectId(subjectId);
    }


    /**
     * Get subject by name
     * @param name
     * @return List of subjects
     */
    @GetMapping("/syllabus/{syllabusId}")
    public List<SubjectsList> getBySyllabusId(@PathVariable("syllabusId") Long syllabusId) {
        List<SubjectsList> list = subjectsListService.getBySyllabusId(syllabusId);
        list.forEach(System.out::println);
        System.out.println(list.size());
        return list;
    }


    /**
     * Get subject by name
     * @param name
     * @return List of subjects
     */
    @GetMapping("/semester/{recommendedSemester}")
    public List<SubjectsList> getByRecommendedSemester(@PathVariable("recommendedSemester") Long recommendedSemester) {
        return subjectsListService.getByRecommendedSemester(recommendedSemester);
    }


    /**
     * Get subject by name
     * @param name
     * @return List of subjects
     */
    @GetMapping("/s={syllabusId}&r={recommendedSemester}")
    public List<SubjectsList> getBySyllabusIdAndRecommendedSemester(@PathVariable("syllabusId") Long syllabusId, @PathVariable("recommendedSemester") Long recommendedSemester) {
        return subjectsListService.getBySyllabusIdAndRecommendedSemester(syllabusId, recommendedSemester);
        // return subjectsListService.getBySyllabusIdAndRecommendedSemester(syllabusId, recommendedSemester);
    }


    /**
     * Save subject
     * @param subject
     * @return Subject
     */
    @PostMapping("/save")
    public SubjectsList save(@Validated SubjectsList subject) {
        return subjectsListService.save(subject);
    }
    

}
