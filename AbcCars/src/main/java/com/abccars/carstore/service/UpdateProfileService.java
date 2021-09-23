package com.abccars.carstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abccars.carstore.entities.User;
import com.abccars.carstore.repository.RegistrationRepo;
import com.abccars.carstore.repository.RoleRepo;

@Service
@Transactional
public class UpdateProfileService {
@Autowired RegistrationRepo registrationRepo;
@Autowired RoleRepo roleRepo;


public void updateUser(User user) {
	user.setRoles(Arrays.asList(roleRepo.findByName("USER")));
	registrationRepo.save(user);
}
}
