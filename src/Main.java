import task1.Car;
import task1.DataCar;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Car, DataCar> carMap = new HashMap<>();
        carMap.put(new Car(1,"MN 208 RS"),
                   new DataCar(2015,"BMW",800500,"Black"));
        carMap.put(new Car(2,"FS 867 KL"),
                   new DataCar(2020,"Mercedes-Benz",1000000,"Red"));

        for (Map.Entry entry : carMap.entrySet()){
            Car a = (Car) entry.getKey();
            DataCar b = (DataCar) entry.getValue();

            System.out.println(a);
            System.out.println(b);
        }

    }
}