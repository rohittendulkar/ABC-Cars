package com.abccars.carstore.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abccars.carstore.entities.User;
import com.abccars.carstore.repository.RegistrationRepo;
import com.abccars.carstore.repository.RoleRepo;

@Service
@Transactional
public class RegistrationService {
@Autowired
	RegistrationRepo registrationRepo;

@Autowired
	RoleRepo roleRepo;
public User saveUser(User user) {
	user.setRoles(Arrays.asList(roleRepo.findByName("USER")));
	User User= registrationRepo.save(user);
	return User;
}
public List<User> userList(User user) {
	
	return registrationRepo.userlist();
}
public void deleteUser(Long id) {
	
	registrationRepo.deleteById(id);
}

}
