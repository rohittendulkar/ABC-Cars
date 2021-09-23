package com.abccars.carstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abccars.carstore.entities.Cars;
import com.abccars.carstore.entities.User;
import com.abccars.carstore.repository.CarsRepo;
import com.abccars.carstore.service.CarService;

@Controller
public class CarController {
@Autowired
CarService carService;

@Autowired
CarsRepo carRepo;

@GetMapping("/postcar")
public String postcar(Model model,Cars newcar){
	model.addAttribute("car", newcar);
	return "postcar";
}
@PostMapping("/savecar")
public String saveCar (Model model, Cars savecar) {
	Cars Car=carService.saveCar(savecar);
	model.addAttribute("savedcar", savecar);
	return "post_success";
}
@GetMapping("/search")
public String search() {
	return "search_cars";
}
@GetMapping("/searchcar")
public String search(@RequestParam String keyword, Model model) {
	List<Cars> cars = carService.searchCar(keyword);
	model.addAttribute("searchresult", cars);
	return "searchresults";
}
@GetMapping("/listcars")
public String listcars(Model model) {
	List<Cars> cars = carService.carlist();
	model.addAttribute("list", cars);
	return "carlist";
}
@GetMapping("/deletecar")
public String deleteCar(@RequestParam Long id) {
	carService.deleteCar(id);
	return "redirect:listcars";
}
}
