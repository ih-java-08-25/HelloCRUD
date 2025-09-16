package com.ironhack.hellospring.controller;


import com.ironhack.hellospring.service.GreetService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetController {

    private final GreetService greetService;


    public GreetController(GreetService greetService) {
        this.greetService = greetService;
    }

    @GetMapping
    public String greet() {
        return greetService.greet();
    }


    @GetMapping("name/{name}")
    public String greetByName(@PathVariable String name) {
        return greetService.greet() + " " + name + "!";
    }

    @GetMapping("manual")
    public String manualGreet(@RequestParam(required = false, defaultValue = "") String timeOfDay) {
        if (timeOfDay.equalsIgnoreCase("morning")) {
            return "Good morning";
        } else if (timeOfDay.equalsIgnoreCase("evening")) {
            return "Good evening ";
        }
        return "Hello";
    }
}
