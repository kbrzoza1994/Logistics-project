package com.logistic.vehicles;

import java.awt.*;

public class Vehicle implements Trackable{
    private String brand, registrationNumber;
    private Integer mileage;
    private Integer weight;
    private Integer driverId;
    private Boolean avileable;
    private Double latitude, longitude;
    //private Integer vinNumber;  add at the end


    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

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

    public Boolean getAvileable() {
        return avileable;
    }

    public void setAvileable(Boolean avileable) {
        this.avileable = avileable;
    }

    public Vehicle(String brand, String registrationNumber, Integer weight, Integer mileage, Integer drivenBy) {
        this.brand = brand;
        this.registrationNumber = registrationNumber;
        this.weight = weight;
        this.mileage = mileage;
        this.driverId = drivenBy;
        this.avileable = true;
    }

    @Override
    public Point getLocation() {

        Point point = new Point();
        point.setLocation(latitude,longitude);

        return point.getLocation();
    }

    @Override
    public void setLocation(Double latitude, Double longitude) {
        this.latitude=latitude;
        this.longitude=longitude;

    }
}
