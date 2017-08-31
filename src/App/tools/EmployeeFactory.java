package App.tools;

import com.logistic.employees.Driver;
import com.logistic.employees.Employee;
import com.logistic.vehicles.Vehicle;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

public class EmployeeFactory {
    private HashMap<Integer, Employee> employees = new HashMap<>();

    public HashMap<Integer, Employee> getEmployees() {


        employees.put(1, new Driver("Brian", "Scalabrine", 1));
        employees.put(2, new Driver("Matthew", "Rose", 2));
        employees.put(3, new Driver("William", "Chandler", 3));
        employees.put(4, new Driver("Ann", "Gordon", 4));
        employees.put(5, new Driver("AAron", "Ball", 5));
        employees.put(6, new Driver("Peter", "Kerr", 6));
        employees.put(7, new Driver("Zach", "Wood", 7));
        employees.put(8, new Driver("Stephen", "Future", 8));
        employees.put(9, new Driver("Karl", "Alabama", 9));
        employees.put(10, new Driver("Harry", "Outhorn", 10));
        employees.put(11, new Driver("Wilson", "Francis", 11));
        employees.put(12, new Driver("Lew", "Wilson", 12));
        employees.put(13, new Driver("Ervin", "Ancidor", 13));
        employees.put(14, new Driver("Steve", "Clay", 14));
        employees.put(15, new Driver("Beth", "Abbey", 15));
        employees.put(16, new Driver("Angelina", "Stan", 16));
        employees.put(17, new Driver("Walt", "Frank", 17));


        return employees;

    }


}