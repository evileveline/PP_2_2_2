package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", 2021, "white"));
        cars.add(new Car("Porsche", 2015, "black"));
        cars.add(new Car("Cadillac", 2019, "silver"));
        cars.add(new Car("Lamborghini ", 2017, "red"));
        cars.add(new Car("Mercedes", 2022, "grey"));
    }

    public List<Car> getCarsCount() {
        return cars;
    }

}
