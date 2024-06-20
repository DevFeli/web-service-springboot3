package com.devreis.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devreis.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
