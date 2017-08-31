package com.logistic.vehicles;

import java.awt.*;

public class Car extends Vehicle{
    public Car(String brand, String registrationNumber, Integer weight, Integer mileage, Integer driverId) {
        super(brand, registrationNumber, weight, mileage, driverId);
    }

    @Override
    public Point getLocation() {

        return null;
    }

    @Override
    public void setLocation(Double latitude, Double longitude) {

    }
}
