package com.abccars.carstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abccars.carstore.entities.Cars;
import com.abccars.carstore.entities.User;
import com.abccars.carstore.repository.CarsRepo;
import com.abccars.carstore.repository.RegistrationRepo;

@Service
@Transactional

public class CarService {
@Autowired CarsRepo carRepo;
@Autowired RegistrationRepo registrationRepo;
public Cars saveCar(Cars car) {

String name = SecurityContextHolder.getContext().getAuthentication().getName();
  User user = registrationRepo.findByUserName(name);
    car.setSeller(name);
    Cars Car = carRepo.save(car);
    return Car;
}

public List<Cars> searchCar (String keyword) {
	
	List<Cars> car = carRepo.search(keyword);
	return car;
}

public List<Cars> carlist () {
	List<Cars> cars= carRepo.findAll();
	return cars;
}

public void deleteCar(Long id) {
	
	carRepo.deleteById(id);
}
}
