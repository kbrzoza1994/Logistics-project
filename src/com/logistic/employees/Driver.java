package com.logistic.employees;

public class Driver extends Employee {

   private Boolean ableDriveBus, ableDriveTruck;

    public Driver(String firstName, String lastName, Integer employeeId) {
        super(firstName, lastName, employeeId);
    }

    public Driver(String firstName, String lastName, Integer employeeId, boolean ableDriveBus, boolean ableDriveTruck) {
        super(firstName, lastName, employeeId);
        this.ableDriveBus = ableDriveBus;
        this.ableDriveTruck = ableDriveTruck;
    }

    public boolean isAbleDriveBus() {
        return ableDriveBus;
    }

    public void setAbleDriveBus(boolean ableDriveBus) {
        this.ableDriveBus = ableDriveBus;
    }

    public boolean isAbleDriveTruck() {
        return ableDriveTruck;
    }

    public void setAbleDriveTruck(boolean ableDriveTruck) {
        this.ableDriveTruck = ableDriveTruck;
    }
}
