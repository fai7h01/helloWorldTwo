package com.example.javatutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "")
public class MainController {

    @GetMapping
    public String greeting() {
        return "Hello World Two!";
    }
}
