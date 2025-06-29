package june28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainVehicle {
    public static void main(String[] args) {
        List<Vehicle>  vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("honda","black",40000));
        vehicleList.add(new Vehicle("meces","red",20000));
        vehicleList.add(new Vehicle("tesla","white",30000));

        Collections.sort(vehicleList, new ColorComaptor());
        System.out.println(vehicleList);

    }

}
