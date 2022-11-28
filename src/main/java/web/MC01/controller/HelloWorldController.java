package web.MC01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Indicate that this class is a Controller for a RestAPI
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "";
    }


    @GetMapping("/friend")
    public String helloFriend() {
        return "Hello Friend";
    }


}
