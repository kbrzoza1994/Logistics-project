package App.tools;

import com.logistic.employees.Employee;

import java.util.HashMap;

public class WorkersFactory {

    public HashMap<Integer, Employee> getEmployees() {


        HashMap<Integer, Employee> employees = new HashMap<>();


        employees.put(1,new Employee("Brian","Scalabrine",1));
        employees.put(2,new Employee("Matthew","Rose",2));
        employees.put(3,new Employee("William","Chandler",3));
        employees.put(4,new Employee("Ann","Gordon",4));
        employees.put(5,new Employee("AAron","Ball",5));
        employees.put(6,new Employee("Peter","Kerr",6));
        employees.put(7,new Employee("Zach","Wood",7));
        employees.put(8,new Employee("Stephen","Future",8));
        employees.put(9,new Employee("Karl","Alabama",9));
        employees.put(10,new Employee("Harry","Outhorn",10));
        employees.put(11,new Employee("Wilson","Francis",11));
        employees.put(12,new Employee("Lew","Wilson",12));
        employees.put(13,new Employee("Ervin","Ancidor",13));
        employees.put(14,new Employee("Steve","Clay",14));
        employees.put(15,new Employee("Beth","Abbey",15));
        employees.put(16,new Employee("Angelina","Stan",16));
        employees.put(17,new Employee("Walt","Frank",17));


        return employees;

    }
}