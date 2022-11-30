package web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class URLController {

    
    @RequestMapping("/404")
    public String error() {
        return "Error";
    }


}
