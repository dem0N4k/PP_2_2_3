package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static int CAR_COUNT;
    Car car1 = new Car(++CAR_COUNT, "BMW", "X6", 2350.6);
    Car car2 = new Car(++CAR_COUNT, "Volvo", "xc90", 2170.7);
    Car car3 = new Car(++CAR_COUNT, "Mazda", "CX-5", 1590.8);
    Car car4 = new Car(++CAR_COUNT, "Tesla", "Cybertruck", 2700.0);
    Car car5 = new Car(++CAR_COUNT, "Mercedes-Benz", "G", 2590.4);

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    public List<Car> show(int count) {
        List<Car> result;
        if (count <= 5) {
            result = cars.subList(0, count);
        } else {
            result = cars;
        }
        return result;
    }
}
