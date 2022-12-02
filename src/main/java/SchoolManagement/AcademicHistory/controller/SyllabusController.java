package SchoolManagement.AcademicHistory.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/syllabus")
public class SyllabusController {


    @GetMapping("/data")
    public String syllabusMenu() {
        return "You're now in the SyllabusController";
    }


}
