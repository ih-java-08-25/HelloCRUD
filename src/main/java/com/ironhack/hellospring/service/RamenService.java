package com.ironhack.hellospring.service;


import com.ironhack.hellospring.enums.SpicyLevel;
import com.ironhack.hellospring.model.Ramen;
import com.ironhack.hellospring.model.UpdateBrandRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RamenService {

    private List<Ramen> ramenList = new ArrayList<>(List.of(
            new Ramen("Nissin", "Eggplants and miso", SpicyLevel.NOT_SPICY),
            new Ramen("Maruchan", "Ginger", SpicyLevel.MILD),
            new Ramen("Samyang", "Hot Natto", SpicyLevel.BURN_YOUR_TONGUE)
    ));

    public Ramen getRamenOfTheDay() {
        int ramenIndex = (int) (Math.random() * ramenList.size());
        return ramenList.get(ramenIndex);
    }

    public List<Ramen> getAllRamens() {
        return ramenList;
    }

    public Ramen getRamenById(int id) {
        return ramenList.get(id);
    }

    public Ramen create(Ramen ramen) {
        ramenList.add(ramen); // Simulate saving to database
        return ramen;
    }

    public Ramen update(int id, Ramen ramen) {
        ramenList.set(id, ramen);
        return ramenList.get(id);
    }

    public Ramen updateBrand(int id, UpdateBrandRequest updateBrandRequest) {

        if(id != updateBrandRequest.getId()) {
            throw new IllegalArgumentException("ID in path and request body do not match");
        }

        Ramen selectedRamen = ramenList.get(id);
        selectedRamen.setBrand(updateBrandRequest.getBrand());
        ramenList.set(id, selectedRamen);
        return selectedRamen;
    }

    public void deleteById(int id) {
        ramenList.remove(id);
    }

}
