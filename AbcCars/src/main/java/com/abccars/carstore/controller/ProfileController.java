package com.abccars.carstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abccars.carstore.entities.User;
import com.abccars.carstore.repository.RegistrationRepo;
import com.abccars.carstore.service.RegistrationService;
import com.abccars.carstore.service.UpdateProfileService;

@Controller
public class ProfileController {
@Autowired 
UpdateProfileService profileService;
@Autowired
RegistrationService registrationService;
@Autowired
RegistrationRepo registrationRepo;

	@GetMapping ("/yourprofile")
	public String yourprofile(Model model) {
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
	    User user = registrationRepo.findByUserName(name);
		model.addAttribute("profile", user);
		return "yourprofile";
	}
	
	@GetMapping("/editprofile")
	public String profilepage(Model model) {
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = registrationRepo.findByUserName(name);
		model.addAttribute("user", user);
		return "update_profile";
	}
	
	@RequestMapping("/userupdate")
	public String editprofile(Model model,User user) {
		profileService.updateUser(user);
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		User update = registrationRepo.findByUserName(name);
		model.addAttribute("profile", update);
		return "yourprofile";
	}
//	@GetMapping("/updatesucc")
//	public String updatesuccess (Model model,User user) {
//		String name = SecurityContextHolder.getContext().getAuthentication().getName();
//	    User updated = registrationRepo.findByUserName(name);
//	    model.addAttribute("updated", updated);
//		return "carstore";
//	}
	
}
