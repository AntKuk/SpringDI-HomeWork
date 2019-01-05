package com.netcracker.lookup;

public class Car {
    private String brand = "Mercedes";

    public void buzz() {
        System.out.println(brand + "VRUM VRUM");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
