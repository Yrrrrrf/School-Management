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


@RestController
@RequestMapping("/subjects_list")
public class SubjectsListController {

    @Autowired
    private SubjectsListService subjectsListService;


    @GetMapping("/all")
    @ResponseBody
    public List<SubjectsList> getAllSubjectsList() {
        return subjectsListService.getAll();
    }

    @GetMapping("/{id}")
    public List<SubjectsList> getById(@PathVariable("id") int subjectId) {
        return subjectsListService.getBySubjectId(subjectId);
    }


    @GetMapping("/syllabus/{syllabusId}")
    public List<SubjectsList> getBySyllabusId(@PathVariable("syllabusId") int syllabusId) {
        List<SubjectsList> list = subjectsListService.getBySyllabusId(syllabusId);
        list.forEach(System.out::println);
        System.out.println(list.size());
        return list;
    }


    @GetMapping("/rec/{recommendedSemester}")
    public List<SubjectsList> getByCredits(@PathVariable("recommendedSemester") int recommendedSemester) {
        return subjectsListService.getByRecommendedSemester(recommendedSemester);
    }


    @PostMapping("/save")
    public SubjectsList save(@Validated SubjectsList subject) {
        return subjectsListService.save(subject);
    }
    

    @GetMapping("/data")
    public String subjectMenu() {
        return "You're now in the Subjects List Menu";
    }


}
