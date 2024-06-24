package com.devreis.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devreis.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
