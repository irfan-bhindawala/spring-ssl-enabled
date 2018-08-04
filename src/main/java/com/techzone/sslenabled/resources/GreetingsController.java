package com.techzone.sslenabled.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/greetings")
@RestController()
public class GreetingsController {

    @GetMapping
    public String greetings() {
        return "hi!! i am secured.";
    }
}
