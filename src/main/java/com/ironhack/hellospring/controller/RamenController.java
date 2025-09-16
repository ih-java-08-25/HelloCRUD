package com.ironhack.hellospring.controller;


import com.ironhack.hellospring.model.Ramen;
import com.ironhack.hellospring.model.UpdateBrandRequest;
import com.ironhack.hellospring.service.RamenService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

// CRUD -> Create, Read, Update, Delete
// POST, GET, PUT/PATCH, DELETE

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

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED) // status code 201
    public Ramen createRamen(@RequestBody Ramen ramen) {
        return ramenService.create(ramen);
    }

    @PutMapping("/{id}")
    public Ramen updateRamen(@PathVariable int id, @RequestBody Ramen ramen) {
        return ramenService.update(id, ramen);
    }


    @PatchMapping("/{id}/brand")
    public Ramen updateRamenBrand(@PathVariable int id, @RequestBody UpdateBrandRequest updateBrandRequest) {
        return ramenService.updateBrand(id, updateBrandRequest);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT) // status code 204
    public void deleteById(@PathVariable int id) {
        ramenService.deleteById(id);
    }
}



