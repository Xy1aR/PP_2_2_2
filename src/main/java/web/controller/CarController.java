package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer counter,
                           ModelMap model) {

        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("VW", "Polo", 2023));
        carsList.add(new Car("VAZ", "2101", 1979));
        carsList.add(new Car("BMW", "M3", 2022));
        carsList.add(new Car("M-B", "X-Class", 2018));
        carsList.add(new Car("AUDI", "TT", 2018));

        model.addAttribute("carsList", carService.listCars(carsList, counter));

        return "cars";
    }
}
