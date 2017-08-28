package App.tools;

import com.logistic.vehicles.Truck;
import com.logistic.vehicles.Vehicle;

import java.util.HashMap;

public class VehicleFactory {

    public HashMap<String, Vehicle> getVehicles() {
        /*String key = "";
        String a;
        StringBuffer b = new StringBuffer();
        boolean check;
        for (int i = 0; i < 200; i++) {
            check=true;
            do {
                for (int j = 0; j < 5; j++) {
                    a = ((Double) (Math.random() * 10)).toString();
                    b = b.append(a);
                }

                key = "RDD" + b.toString();

                for (String s : vehicles.keySet()) {
                    if (s.equals(key))
                        check = false;
                }

            } while (check);


        }*/


        //basic factory
        HashMap<String, Vehicle> vehicles = new HashMap<>();

        vehicles.put("RDD24586", new Truck("Mercedes", "RDD24586", 14117, 0));
        vehicles.put("RDD58659", new Truck("Iveco", "RDD58659", 13431, 253485));
        vehicles.put("RDD11236", new Truck("Volvo", "RDD11236", 14526, 47596));
        vehicles.put("RDD87874", new Truck("Mercedes", "RDD87874", 15020, 26584));
        vehicles.put("RDD00213", new Truck("Mercedes", "RDD00213", 13987, 359658));
        vehicles.put("RDD84756", new Truck("Scania", "RDD84756", 13254, 856253));
        vehicles.put("RDD14563", new Truck("Mercedes", "RDD14563", 12456, 123253));
        vehicles.put("RDD47859", new Truck("Mercedes", "RDD47859", 14112, 562352));
        vehicles.put("RDD47126", new Truck("Man", "RDD47126", 13125, 485625));

        return vehicles;
    }
}
