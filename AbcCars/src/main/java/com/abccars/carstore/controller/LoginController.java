package com.abccars.carstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

@GetMapping ("/login")
public String login() {
	return "login";
}

@RequestMapping(value="/login_error")
public String onLoginError(Model model) {
    String error_msg = "Incorrect username or password, please fill the form again.";
    model.addAttribute("error_string", error_msg);
    return "login";
}

@GetMapping ("/carstore")
public String carstore() {
	return "carstore";
}

}
