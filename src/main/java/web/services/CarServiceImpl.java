package web.services;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("RAV4", 3.0, 35000.0));
        cars.add(new Car("Corolla", 1.6, 20000.0));
        cars.add(new Car("Camry", 2.4, 30000.0));
        cars.add(new Car("LandCruiser", 5.0, 70000.0));
        cars.add(new Car("Yaris", 1.0, 15000.0));
    }

    public List<Car> showCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
