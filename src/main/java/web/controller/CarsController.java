package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;

@Controller
public class CarsController {
    private CarService carService;
    public CarsController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model){
        model.addAttribute("cars", carService.showCars(count));
        return "/cars";
    }
}