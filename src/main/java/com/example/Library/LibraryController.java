package com.example.Library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/")
    public String index() {
        return "Greetings from the Library!";
    }

}