package com.company;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class CarDB {
    private static final String SEPARATOR = "\n-------------------------------------------------------------------\n";

    private final List<Car> carList;

    public CarDB(List<Car> carList) {
        this.carList = Collections.unmodifiableList(carList);
    }

    public List<Car> getAllCars() {
        return carList;
    }

    public List<Car> getCarsByBrand(String brand) {
        return carList.stream().filter((Car car) -> car.getBrand().toLowerCase().equals(brand.toLowerCase())).
                collect(Collectors.toList());
    }

    public List<Car> getCarsByModelAndExpluatationYears(String model, int years) {
        return carList.stream().filter((Car car) -> car.getModel().toLowerCase().equals(model.toLowerCase()) &&
        car.getReleaseYear() + years < LocalDate.now().getYear()).collect(Collectors.toList());
    }

    public List<Car> getCarsByYearAndPrice(int year, double price) {
        return carList.stream().filter((Car car) -> car.getReleaseYear() == year &&
                car.getPrice()  > price).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(SEPARATOR, SEPARATOR + "Car DB: " + SEPARATOR, SEPARATOR);
        carList.forEach((Car car) -> stringJoiner.add(car.toString()));
        return stringJoiner.toString();
    }
}
