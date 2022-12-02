package SchoolManagement.AcademicHistory.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/subject")
public class SubjectController {
    
    @GetMapping("/data") 
    public String subjectMenu() {
        return "You're now in the SubjectController";
    }


}
