package com.ironhack.hellospring.model;

public class UpdateBrandRequest {

    private int id;
    private String brand;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "UpdateBrandRequest{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
