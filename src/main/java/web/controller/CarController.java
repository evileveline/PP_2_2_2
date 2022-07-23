package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 2021, "white"));
        cars.add(new Car("Porsche", 2015, "black"));
        cars.add(new Car("Cadillac", 2019, "silver"));
        cars.add(new Car("Lamborghini ", 2017, "red"));
        cars.add(new Car("Mercedes", 2022, "grey"));
        CarServiceImpl carService = new CarServiceImpl();
        model.addAttribute("cars", carService.getCarsCount(cars, count));
        return "cars";
    }

}
