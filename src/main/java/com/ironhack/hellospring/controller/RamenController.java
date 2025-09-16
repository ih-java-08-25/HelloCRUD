package com.ironhack.hellospring.controller;


import com.ironhack.hellospring.model.Ramen;
import com.ironhack.hellospring.service.RamenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ramens")
public class RamenController {

    private final RamenService ramenService;

    public RamenController(RamenService ramenService) {
        this.ramenService = ramenService;
    }

    @GetMapping()
    public java.util.List<Ramen> getAllRamens() {
        return ramenService.getAllRamens();
    }

    @GetMapping("/{id}")
    public Ramen getRamenById(@PathVariable int id) {
        return ramenService.getRamenById(id);
    }

    @GetMapping("/ramen-of-the-day")
    public Ramen getRamenOfTheDay() {
        return ramenService.getRamenOfTheDay();
    }


}
