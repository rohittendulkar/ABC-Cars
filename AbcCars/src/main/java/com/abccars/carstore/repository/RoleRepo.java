package com.abccars.carstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abccars.carstore.entities.Role;
@Repository
public interface RoleRepo extends JpaRepository<Role,Long>{
Role findByName (String role);
}
