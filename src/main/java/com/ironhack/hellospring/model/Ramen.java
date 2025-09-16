package com.ironhack.hellospring.model;

import com.ironhack.hellospring.enums.SpicyLevel;

public class Ramen {

    private String brand;
    private String flavor;
    private SpicyLevel spicyLevel;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public SpicyLevel getSpicyLevel() {
        return spicyLevel;
    }

    public void setSpicyLevel(SpicyLevel spicyLevel) {
        this.spicyLevel = spicyLevel;
    }

    @Override
    public String toString() {
        return "Ramen{" +
                "brand='" + brand + '\'' +
                ", flavor='" + flavor + '\'' +
                ", spicyLevel=" + spicyLevel +
                '}';
    }

    public Ramen() {
    }

    public Ramen(String brand, String flavor, SpicyLevel spicyLevel) {
        this.brand = brand;
        this.flavor = flavor;
        this.spicyLevel = spicyLevel;
    }
}
