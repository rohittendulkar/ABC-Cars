package com.abccars.carstore.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abccars.carstore.entities.User;
import com.abccars.carstore.service.RegistrationService;

@Controller
public class RegistrationController {

@Autowired
RegistrationService regservice;

@GetMapping("/register")
public String register(Model model,User user){
	model.addAttribute("user", user);
	return "register";
}
@PostMapping("/save")
public String saveUser(Model model, User user) {
	regservice.saveUser(user);
	model.addAttribute("user",user);
	return "registration_success";
}
@GetMapping ("/manageusers")
public String manageusers(Model model,User user) {
	List<User> User = regservice.userList(user);
	model.addAttribute("userlist", User);
	return "manageuser";
}
@GetMapping("/delete")
public String delete(@RequestParam Long id) {
	regservice.deleteUser(id);
	return "redirect:manageusers";
}
}
