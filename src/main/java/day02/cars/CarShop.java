package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int limitPriceMax;
    private List<Car> cars = new ArrayList<>();

    public CarShop(String name, int limitPriceMax) {
        this.name = name;
        this.limitPriceMax = limitPriceMax;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= limitPriceMax) {
            cars.add(car);
            return true;
        }
        else return false;
    }

    public double sumCarPrice() {                   //should it be int type?
        double allCarsPrice = 0;
        for (Car actualCar : cars) {
            allCarsPrice += actualCar.getPrice();
        }
        return allCarsPrice;
    }

    public int numberOfCarsCheaperThan(int price) {
        int counterOfCars = 0;
        for (Car carPrices : cars) {
            if (carPrices.getPrice() <= price) {
                counterOfCars++;
            }
        }
        return counterOfCars;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> brandedCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {   //Don't like the idea of case-sensitivity here :)
                brandedCars.add(car);
            }
        }
        return brandedCars;
    }

    public String getName() {
        return name;
    }

    public int getLimitPriceMax() {
        return limitPriceMax;
    }

    public List<Car> getCarsForSell() {
        return cars;
    }
}