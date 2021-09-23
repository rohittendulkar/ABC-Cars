package com.abccars.carstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abccars.carstore.entities.User;
@Repository
public interface RegistrationRepo extends JpaRepository<User, Long> {
	User findByUserName(String username);
	
	@Query(value = "SELECT c FROM User c WHERE c.id != 2")
	List<User> userlist();
}
