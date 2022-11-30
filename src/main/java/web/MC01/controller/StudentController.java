package web.MC01.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import MC01.domain.dto.StudentDTO;
import MC01.domain.service.StudentService;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired(required = true)
    private StudentService studentService;


    @GetMapping("/hi")
    public String StudentPage() {
        return "Welcome Student!";
    }


    /**
     * Get a list of all the students in the database.
     * <p>
     * This method is called when the URL "/student/all" is requested with the GET method.
     */
    @GetMapping("/all")
    public ResponseEntity<List<StudentDTO>> getAll() {
        // ResponseEntity is a class that allows to return a response with a status code
        return new ResponseEntity<>(studentService.getAll(), HttpStatus.OK);
    }


    @GetMapping("/test")
    public String test() {
        return "test";
    }

    /**
     * Get a list of all the students with the given name.
     * <p>
     * This method is called when the URL "/student/name/{name}" is requested with the GET method.
     */
    public ResponseEntity<Optional<List<StudentDTO>>> getByName(@RequestParam String name) {
        return new ResponseEntity<>(studentService.getByName(name), HttpStatus.OK);
    }


    /**
     * Get the data of a student with the given {@code id}.
     * @param StudentId
     * @return HTML page with the data of the student
     */
    @GetMapping("/{studentId}")
    public ResponseEntity<StudentDTO> getStudent(@PathVariable("studentId") int id) {
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
    public ResponseEntity<StudentDTO> save(@RequestBody StudentDTO student) {
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
