package com.logistic.vehicles;

public class Vehicle {
    private String brand, registrationNumber;
    private Integer mileage;
    private Integer weight;
    //private Integer vinNumber;  add at the end

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Vehicle(String brand, String registrationNumber, Integer weight, Integer mileage) {
        this.brand = brand;
        this.registrationNumber = registrationNumber;
        this.weight = weight;
        this.mileage = mileage;
    }
}
