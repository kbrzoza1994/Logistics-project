package com.logistic;

import App.tools.EmployeeFactory;
import App.tools.VehicleFactory;
import com.logistic.employees.Driver;
import com.logistic.employees.Employee;
import com.logistic.vehicles.Vehicle;

import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class Company {

    private HashMap<String, Vehicle> vehicles = null;
    private HashMap<Integer, Employee> employees = null;


    public void run() {
        Boolean check = true;
        String type = null;
        Integer number = 0;
        vehicles = (new VehicleFactory()).getVehicles();
        employees = (new EmployeeFactory()).getEmployees();
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.print("What do you want to do:\n1:Enter vehicles submenu\n2:Enter employees submenu\n3:send transport\nPlease type by number: ");
            do {
                number = (Integer) scanner.nextInt();
            } while (number <= 0 ^ number >= 4);

            switch (number) {

                case 1: {
                    System.out.print("what do you want to do:\n1:check all vehicles\n2:check available vehicles\n3:check vehicles on road\n4:find Vehicle by registration number\nPlease type by number: ");
                    do {
                        number = (Integer) scanner.nextInt();
                    } while (number <= 0 ^ number >= 5);

                    switch (number) {

                        case 1: {
                            Integer i = 1;
                            for (Vehicle vehicle : vehicles.values()) {
                                System.out.println("[" + i + "; " + "regisNumber: " + vehicle.getRegistrationNumber() + "; Brand: " + vehicle.getBrand() + "; weight(kg): " + vehicle.getWeight() + "; mileage(km): " + vehicle.getMileage() + "]");
                                i++;
                            }
                            break;
                        }
                        case 2: {
                            HashMap<String, Vehicle> vehicles = null;
                            vehicles = getAvileabeVehicles();
                            Integer i = 1;
                            for (Vehicle vehicle : vehicles.values()) {
                                System.out.println("[" + i + "; " + "regisNumber: " + vehicle.getRegistrationNumber() + "; Brand: " + vehicle.getBrand() + "; weight(kg): " + vehicle.getWeight() + "; mileage(km): " + vehicle.getMileage() + "]");
                                i++;
                            }
                            break;
                        }
                        case 3: {
                            HashMap<String, Vehicle> vehicles = null;
                            vehicles = getOnRoadVehicles();
                            Integer i = 1;
                            for (Vehicle vehicle : vehicles.values()) {
                                System.out.println("[" + i + "; " + "regisNumber: " + vehicle.getRegistrationNumber() + "; Brand: " + vehicle.getBrand() + "; weight(kg): " + vehicle.getWeight() + "; mileage(km): " + vehicle.getMileage() + "]");
                                i++;
                            }
                            break;

                        }
                        case 4: {
                            Vehicle vehicle = null;
                            String regis = null;

                            System.out.print("Please type registration number of vehicle you want to find: ");
                            regis = scanner.next();
                            vehicle = findVehicleByRegisNumb(regis);
                            if (vehicle==null) {
                                System.out.println("Didn't find vehicle");
                            } else {
                                System.out.println("[regisNumber: " + vehicle.getRegistrationNumber() + "; Brand: " + vehicle.getBrand() + "; weight(kg): " + vehicle.getWeight() + "; mileage(km): " + vehicle.getMileage() + "]");
                            }
                            break;

                        }
                    }
                    break;
                }

                case 2: {

                    System.out.print("What do you want to do: \n1:find employee\n2:find vehicle driven by employee\n3:hire employee\n4:fire employee\n");
                    do {
                        number = (Integer) scanner.nextInt();
                    } while (number <= 0 ^ number >= 5);

                    switch (number) {

                        case 1: {
                            Employee employee = null;

                            System.out.print("Do you want to write id or name of employee: ");
                            do {

                                type = scanner.next();
                            } while (type.equals("id") ^ type.equals("name"));

                            if (type.equals("id")) {
                                System.out.print("Please type Id: ");
                                number = (Integer) scanner.nextInt();
                                employee = findEmployeeById(number);


                            } else {
                                String fname, lname = null;
                                System.out.print("Please type first name: ");
                                fname = scanner.next();
                                System.out.print("Please type last name: ");
                                lname = scanner.next();
                                employee = findEmployeeByName(fname, lname);
                            }

                            if (employee==null) System.out.println("Didn't find employee.");
                            else
                                System.out.println("[Id: " + employee.getEmployeeId() + "; First name: " + employee.getFirstName() + "; Last name: " + employee.getLastName() + "]");

                            break;
                        }
                        case 2: {
                            Vehicle vehicle = null;
                            System.out.print("Enter Driver id: ");
                            number = (Integer) scanner.nextInt();
                            vehicle = findVehicleByDriver(number);
                            if (vehicle==null) {
                                System.out.println("Didn't find vehicle");
                            } else {
                                System.out.println("[regisNumber: " + vehicle.getRegistrationNumber() + "; Brand: " + vehicle.getBrand() + "; weight(kg): " + vehicle.getWeight() + "; mileage(km): " + vehicle.getMileage() + "]");
                            }

                            break;

                        }
                        case 3: {
                            Integer employeeId = null;
                            String firstName, lastName = null;
                            Boolean ableDriveTruck, ableDriveBus;
                            System.out.print("Enter new employee id: ");
                            employeeId = scanner.nextInt();
                            System.out.print("Enter new employee firs name: ");
                            firstName = scanner.next();
                            System.out.print("Enter new employee last name: ");
                            lastName = scanner.next();
                            System.out.print("Is new employee able to drive truck?(true/false): ");
                            ableDriveTruck = scanner.nextBoolean();
                            System.out.print("Is new employee able to drive bus?(true/false): ");
                            ableDriveBus = scanner.nextBoolean();
                            System.out.println(hireEmployee(employeeId, firstName, lastName, ableDriveBus, ableDriveTruck));

                            break;
                        }
                        case 4: {
                            Integer employeeId = null;
                            System.out.print("Enter employee id: ");
                            employeeId = scanner.nextInt();
                            System.out.println(fireEmployee(employeeId));
                        break;
                        }
                    }
                    break;
                }

                case 3: {

                    System.out.println("currently unavailable");
                    break;
                }
            }
            System.out.println("Run again ?(true/false)");
            do {
                check = scanner.nextBoolean();
            } while (check.equals("true") || check.equals("false"));
        } while (check);
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
            if (s.equals(registrationNumber)){
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
        HashMap<String, Vehicle> vehiclesAv = vehicles;
        for (String s : vehicles.keySet()) {
            if (!vehiclesAv.get(s).getAvileable()) {
                vehiclesAv.remove(s);
            }

        }


        return vehiclesAv;
    }

    public HashMap<String, Vehicle> getOnRoadVehicles() {
        HashMap<String, Vehicle> vehiclesOnRoad = vehicles;
        for (String s : vehicles.keySet()) {
            if (!vehiclesOnRoad.get(s).getAvileable()) {
                vehiclesOnRoad.remove(s);
            }

        }
        return vehiclesOnRoad;
    }

    public Point getLocation(Vehicle vehicle) {
        return null;
    }

    public void setTransport(Vehicle vehicle, Employee driver) {


    }

    public String addVehicle(String registrationNumber, String brand, Integer weight, Integer mileage, Integer driverId) {
        vehicles.put(registrationNumber, new Vehicle(brand, registrationNumber, weight, mileage, driverId));                              //must change to possibility to create different subclasses
        return ("Successfully added vehicle to fleet");
    }

    public String removeVehicle(String registrationNumber) {

        for (String s : vehicles.keySet()) {
            if (registrationNumber.equals(s)) {
                vehicles.remove(registrationNumber);
            }
        }
        return ("Succesfully added vehicle");
    }

    public String fireEmployee(Integer employeeId) {

        for (Integer set : employees.keySet()) {
            if (employeeId == set)
                employees.remove(employeeId);

        }
        return ("Found given Id, Employee fired");
    }

    public String hireEmployee(Integer employeeId, String firstName, String lastName, Boolean ableDriveBus, Boolean ableDriveTruck) {
        employees.put(employeeId, new Driver(firstName, lastName, employeeId, ableDriveBus, ableDriveTruck));
        return ("Successfully added employee");
    }


}
