package com.ironhack.hellospring.service;


import com.ironhack.hellospring.enums.SpicyLevel;
import com.ironhack.hellospring.model.Ramen;
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

}
