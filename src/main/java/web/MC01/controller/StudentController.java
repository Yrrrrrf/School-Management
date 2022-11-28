package web.MC01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import MC01.db.entity.Student;
import MC01.domain.service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    // private StudentServic studentService;
    private StudentService studentService;


    /**
     * Get a list of all the students in the database.
     * <p>
     * This method is called when the URL "/student" is requested with the GET method.
     */
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAll() {
        // ResponseEntity is a class that allows to return a response with a status code
        return new ResponseEntity<>(studentService.getAll(), HttpStatus.OK);
    }


    /**
     * Get the data of a 
     * @param StudentId
     * @return HTML page with the data of the student
     */
    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable("studentId") int id) {
        return studentService.getStudent(id).map(student -> 
            new ResponseEntity<>(student, HttpStatus.OK))  // If the student exists, return it
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND)); // If the student is not found, return a 404 Error
    }


    /**
     * Add a new student to the database.
     * @param student
     * @return HTML page with the data of the student
     */
    @PostMapping("/save")    
    public ResponseEntity<Student> save(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.save(student), HttpStatus.CREATED);  // Return the student that was saved
    }

    /**
     * 
     * @param id
     */
    @DeleteMapping("/delete/{studentId}")    
    public ResponseEntity delete(@PathVariable() int id) {
        // Return Ok if the student was deleted, or (404) Not Found if the student was not found
        return new ResponseEntity<>(studentService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }


}
