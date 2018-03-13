package com.company;

import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Car car1 = new Car(1, "Volvo", "S60", 2012, "black", 4550.5, "АА 5889 АН");
        Car car2 = new Car(2, "Volkswagen", "Passat B5", 2005, "silver", 8000.0, "АЕ 1000 НІ");
        Car car3 = new Car(3, "Volvo", "XC60", 2011, "white", 22300.1, "ВК 5445 ВК");
        Car car4 = new Car(4, "Volkswagen", "Passat B5", 2003, "black", 8399.0, "АА 2313 АВ");
        Car car5 = new Car(5, "Volkswagen", "Passat B5", 2011, "red", 6999.9, "АА 2313 АВ");
        Car car6 = new Car(5, "BMV", "X5", 2011, "red", 15000.0, "АА 1235 АН");

        List<Car> carList = Arrays.asList(car1, car2, car3, car4, car5, car6);

        CarDB carDB = new CarDB(carList);

        System.out.println("Cars by brand: " + carDB.getCarsByBrand("Volvo") + "\n");
        System.out.println("Cars by model and expluatating years more than: " + carDB.getCarsByModelAndExpluatationYears("Passat b5", 10) + "\n");
        System.out.println("Cars by year and price:" + carDB.getCarsByYearAndPrice(2011, 10000.0) + "\n");


    }
}
