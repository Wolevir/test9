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
public class CarsController {

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        CarServiceImpl carService = new CarServiceImpl();
        List<Car> list = new ArrayList<>();
        list.add(new Car(5, "BMW", "RED"));
        list.add(new Car(2, "VESTA", "YELLOW"));
        list.add(new Car(3, "KIA","BLACK"));
        list.add(new Car(3, "HONDA","GREEN"));
        list.add(new Car(2, "NIVA", "BLUE"));
        list =  carService.carsCount(list, allCars);
        model.addAttribute("list", list);
        return "car";

    }
}
