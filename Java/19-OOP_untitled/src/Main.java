import Classes.Car;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "black", 2022));
        cars.add(new Car("BMW", "red", 2025));
        cars.add(new Car("Mercedes", "Brown", 2024));
        for (Car car : cars) {
            System.out.println(car);
        }

    }
}