package com.logistic;

import com.logistic.employees.Employee;
import com.logistic.vehicles.Vehicle;

import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class Company {

    private static HashMap<String, Vehicle> vehicles = null;
    private static HashMap<Integer, Employee> employees = null;


    public void run(HashMap<Integer, Employee> employees, HashMap<String, Vehicle> vehicles) {

    }

    public Vehicle findVehicleByDriver(Integer driverId) {
        Vehicle vehicle = null;
        for (String s : vehicles.keySet()) {
            if (vehicles.get(s).getDriverId() == driverId) {
                vehicle = vehicles.get(s);
            }
        }
        return vehicle;
    }

    public Vehicle findVehicleByRegisNumb(String registrationNumber) {
        Vehicle vehicle = null;
        for (String s : vehicles.keySet()) {
            if (s == registrationNumber) {
                vehicle = vehicles.get(s);
            }
        }
        return vehicle;
    }

    public Employee findEmployeeById(Integer driverId) {
        Employee employee = null;
        for (Integer integer : employees.keySet()) {
            if (integer == driverId) {
                employee = employees.get(integer);
            }
        }
        return employee;
    }

    public Employee findEmployeeByName(String firstName, String lastName) {
        Employee employee = null;
        for (Integer integer : employees.keySet()) {
            if (employees.get(integer).getFirstName().equals(firstName) && employees.get(integer).getLastName().equals(lastName)) {
                employee = employees.get(integer);
            }
        }
        return employee;
    }

    public HashMap<String, Vehicle> getVehicles() {

        return null;
    }

    public HashMap<String, Vehicle> getAvileabeVehicles() {
        HashMap<String, Vehicle> vehiclesAv = null;
        for (String s : vehicles.keySet()) {
            if (vehicles.get(s).getAvileable())
                vehiclesAv.put(s, vehicles.get(s));
        }
        return vehiclesAv;
    }

    public HashMap<String, Vehicle> getOnRoadVehicles() {
        HashMap<String, Vehicle> vehiclesOnRoad = null;
        for (String s : vehicles.keySet()) {
            if (!vehicles.get(s).getAvileable())
                vehiclesOnRoad.put(s, vehicles.get(s));
        }
        return vehiclesOnRoad;
    }

    public Point getLocation(Vehicle vehicle) {

        return null;
    }

    public void setTransport(Vehicle vehicle, Employee driver) {


    }


}
